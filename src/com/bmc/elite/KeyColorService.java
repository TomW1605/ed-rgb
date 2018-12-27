package com.bmc.elite;

import com.bmc.elite.config.Application;
import com.bmc.elite.config.PipPresets;
import com.bmc.elite.config.PulsatingKeys;
import com.bmc.elite.mappings.Colors;
import com.bmc.elite.mappings.ControlGroups;
import com.bmc.elite.mappings.Controls;
import com.bmc.elite.lists.LogitechKeysList;
import com.bmc.elite.models.ControlGroup;
import com.bmc.elite.models.ControlGroupList;
import com.bmc.elite.models.Status;
import com.bmc.elite.status.Flags;
import com.bmc.elite.status.GuiFocus;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.logitech.gaming.LogiLED;

import java.io.FileReader;
import java.util.*;

public class KeyColorService {

    Gson gson;
    JsonReader jsonReader;

    public static boolean isBitSet(long bitmask, int flag) {
        return (bitmask & flag) == flag;
    }

    public static HashMap<String, List<String>> eliteBindings;

    public static HashMap<String, Integer[]> MAIN_CONTROLS = ControlGroups.getControlToColorMap(ControlGroups.MAIN_CONTROLS);

    ControlGroupList currentControlGroups;
    Status currentStatus = null;

    public PulsatingKeys pulsatingKeys = new PulsatingKeys();

    public KeyColorService() {
        gson = new Gson();
        initColors();
    }

    public void initColors() {
        initColors(false);
    }
    public void initColors(boolean resetBindings) {
        eliteBindings = BindingParser.getBindings(resetBindings);
        updateStatus();
    }

    public void setColorsFromBindings(Status newStatus) {

        if(AnimationHelper.isAnimating()) {
            return;
        }

        if(ControlGroups.UI_MODE_CONTROLS.containsKey(newStatus.GuiFocus)) {
            currentControlGroups = ControlGroups.UI_MODE_CONTROLS.get(newStatus.GuiFocus);
        } else {
            currentControlGroups = ControlGroups.UI_MODE_CONTROLS.get(GuiFocus.NONE);
        }

        List<Integer> remainingLogitechKeys = new LogitechKeysList();
        List<String> keys;
        for(ControlGroup controlGroup : currentControlGroups) {
            if(controlGroup.neededStatus != null && !controlGroup.neededStatus.conditionSatisfied(newStatus)) {
                continue;
            }
            for(String control : controlGroup.controls) {
                keys = eliteBindings.get(control);
                if(keys != null) {
                    if(Arrays.equals(controlGroup.color, Colors.OTHER)) {
                        continue;
                    }
                    remainingLogitechKeys.removeAll(LedTools.setEliteKeysFromColorArray(keys, controlGroup.color));
                }
            }
        }

        for(Integer logitechKey : remainingLogitechKeys) {
            LedTools.setKeyFromColorArray(logitechKey, Colors.OTHER);
        }

        setToggleKeyColors(newStatus);

        LogiLED.LogiLedSetLightingForKeyWithKeyName(10, 0, 100, 100);
        LogiLED.LogiLedSetLightingForKeyWithQuartzCode(10, 0, 100, 100);
        LogiLED.LogiLedSetLightingForKeyWithHidCode(10, 0, 100, 100);
        LogiLED.LogiLedSetLightingForKeyWithScanCode(10, 0, 100, 100);

        try {
            // We need to give time for color scheme to set
            Thread.sleep(Application.DELAY_AFTER_COLOR_SET);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStatus() {
        updateStatus(FileUtils.readFile(Application.STATUS_FILE_PATH));
    }
    public void updateStatus(String statusJson) {
        try {
            Status newStatus = gson.fromJson(statusJson, Status.class);
            if(newStatus == null) {
                if(Application.DEBUG) LogUtils.log("Cannot get status! " + statusJson);
                return;
            }
            setColorsFromBindings(newStatus);
            setKeyColorFromStatus(newStatus);
            currentStatus = newStatus;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setToggleKeyColors(Status newStatus) {
        // Custom PIP presets for G keys
        for (Map.Entry<Integer, Integer[]> pipPreset : PipPresets.STATUS_TO_CONTROL.entrySet()) {
            if(Arrays.equals(pipPreset.getValue(), newStatus.Pips)) {
                LedTools.setKeyFromColorArray(
                    pipPreset.getKey(),
                    PipPresets.PIP_PRESET_COLORS.get(pipPreset.getKey())
                );
            } else {
                LedTools.setKeyFromColorArray(
                    pipPreset.getKey(),
                    PipPresets.PIP_PRESET_COLORS_DISABLED.get(pipPreset.getKey())
                );
            }
        }

        // Change HUD Mode key color based on current HUD mode (Discovery/Combat)
        if(currentControlGroups.allControls.contains(Controls.PlayerHUDModeToggle)) {
            if(isBitSet(newStatus.Flags, Flags.HUD_DISCOVERY_MODE)) {
                LedTools.setEliteKeysFromColorArray(
                    eliteBindings.get(Controls.PlayerHUDModeToggle),
                    Colors.HUD_MODE_DISCOVERY
                );
            } else {
                LedTools.setEliteKeysFromColorArray(
                    eliteBindings.get(Controls.PlayerHUDModeToggle),
                    Colors.HUD_MODE_COMBAT
                );
            }
        }
    }

    public void setKeyColorFromStatus(Status newStatus) {
        try {
            String controlName;
            for(Map.Entry<String, StatusState> condition : pulsatingKeys.entrySet()) {
                controlName = condition.getKey();
                if(
                    currentControlGroups.allControls.contains(controlName)
                    && condition.getValue().conditionSatisfied(newStatus)
                ) {
                    LedTools.setEliteKeysPulseFromColorArrays(
                        eliteBindings.get(controlName),
                        Colors.OTHER,
                        MAIN_CONTROLS.get(controlName),
                        Application.PULSE_DURATION,
                        true
                    );
                } else {
                    LedTools.stopEliteKeysEffect(eliteBindings.get(controlName));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
