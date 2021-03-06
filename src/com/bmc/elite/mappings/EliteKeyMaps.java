package com.bmc.elite.mappings;

import com.bmc.elite.KeyHIDCodes;
import com.bmc.elite.config.LedKeys;

import java.util.HashMap;

public class EliteKeyMaps {
    public static HashMap<String, Integer> TO_LOGITECH = new HashMap<String, Integer>() {
        {
            put("Key_Escape", LedKeys.ESC);
            put("Key_F1", LedKeys.F1);
            put("Key_F2", LedKeys.F2);
            put("Key_F3", LedKeys.F3);
            put("Key_F4", LedKeys.F4);
            put("Key_F5", LedKeys.F5);
            put("Key_F6", LedKeys.F6);
            put("Key_F7", LedKeys.F7);
            put("Key_F8", LedKeys.F8);
            put("Key_F9", LedKeys.F9);
            put("Key_F10", LedKeys.F10);
            put("Key_F11", LedKeys.F11);
            put("Key_F12", LedKeys.F12);
            put("Key_PrintScreen", LedKeys.PRINT_SCREEN);
            put("Key_ScrollLock", LedKeys.SCROLL_LOCK);
            put("Key_PauseBreak", LedKeys.PAUSE_BREAK);
            put("Key_Grave", LedKeys.TILDE);
            put("Key_1", LedKeys.ONE);
            put("Key_2", LedKeys.TWO);
            put("Key_3", LedKeys.THREE);
            put("Key_4", LedKeys.FOUR);
            put("Key_5", LedKeys.FIVE);
            put("Key_6", LedKeys.SIX);
            put("Key_7", LedKeys.SEVEN);
            put("Key_8", LedKeys.EIGHT);
            put("Key_9", LedKeys.NINE);
            put("Key_0", LedKeys.ZERO);
            put("Key_Minus", LedKeys.MINUS);
            put("Key_Equals", LedKeys.EQUALS);
            put("Key_Backspace", LedKeys.BACKSPACE);
            put("Key_Insert", LedKeys.INSERT);
            put("Key_Home", LedKeys.HOME);
            put("Key_PageUp", LedKeys.PAGE_UP);
            put("Key_Numpad_Lock", LedKeys.NUM_LOCK);
            put("Key_Numpad_Divide", LedKeys.NUM_SLASH);
            put("Key_Numpad_Multiply", LedKeys.NUM_ASTERISK);
            put("Key_Numpad_Subtract", LedKeys.NUM_MINUS);
            put("Key_Tab", LedKeys.TAB);
            put("Key_Q", LedKeys.Q);
            put("Key_W", LedKeys.W);
            put("Key_E", LedKeys.E);
            put("Key_R", LedKeys.R);
            put("Key_T", LedKeys.T);
            put("Key_Y", LedKeys.Y);
            put("Key_U", LedKeys.U);
            put("Key_I", LedKeys.I);
            put("Key_O", LedKeys.O);
            put("Key_P", LedKeys.P);
            put("Key_LeftBracket", LedKeys.OPEN_BRACKET);
            put("Key_RightBracket", LedKeys.CLOSE_BRACKET);
            put("Key_BackSlash", LedKeys.BACKSLASH);
            put("Key_Delete", LedKeys.KEYBOARD_DELETE);
            put("Key_End", LedKeys.END);
            put("Key_PageDown", LedKeys.PAGE_DOWN);
            put("Key_Numpad_7", LedKeys.NUM_SEVEN);
            put("Key_Numpad_8", LedKeys.NUM_EIGHT);
            put("Key_Numpad_9", LedKeys.NUM_NINE);
            put("Key_Numpad_Add", LedKeys.NUM_PLUS);
            put("Key_CapsLock", LedKeys.CAPS_LOCK);
            put("Key_A", LedKeys.A);
            put("Key_S", LedKeys.S);
            put("Key_D", LedKeys.D);
            put("Key_F", LedKeys.F);
            put("Key_G", LedKeys.G);
            put("Key_H", LedKeys.H);
            put("Key_J", LedKeys.J);
            put("Key_K", LedKeys.K);
            put("Key_L", LedKeys.L);
            put("Key_SemiColon", LedKeys.SEMICOLON);
            put("Key_Apostrophe", LedKeys.APOSTROPHE);
            put("Key_Enter", LedKeys.ENTER);
            put("Key_Numpad_4", LedKeys.NUM_FOUR);
            put("Key_Numpad_5", LedKeys.NUM_FIVE);
            put("Key_Numpad_6", LedKeys.NUM_SIX);
            put("Key_LeftShift", LedKeys.LEFT_SHIFT);
            put("Key_Z", LedKeys.Z);
            put("Key_X", LedKeys.X);
            put("Key_C", LedKeys.C);
            put("Key_V", LedKeys.V);
            put("Key_B", LedKeys.B);
            put("Key_N", LedKeys.N);
            put("Key_M", LedKeys.M);
            put("Key_Comma", LedKeys.COMMA);
            put("Key_Period", LedKeys.PERIOD);
            put("Key_Slash", LedKeys.FORWARD_SLASH);
            put("Key_RightShift", LedKeys.RIGHT_SHIFT);
            put("Key_UpArrow", LedKeys.ARROW_UP);
            put("Key_Numpad_1", LedKeys.NUM_ONE);
            put("Key_Numpad_2", LedKeys.NUM_TWO);
            put("Key_Numpad_3", LedKeys.NUM_THREE);
            put("Key_Numpad_Enter", LedKeys.NUM_ENTER);
            put("Key_LeftControl", LedKeys.LEFT_CONTROL);
            put("Key_LeftWindows", LedKeys.LEFT_WINDOWS);
            put("Key_LeftAlt", LedKeys.LEFT_ALT);
            put("Key_Space", LedKeys.SPACE);
            put("Key_RightAlt", LedKeys.RIGHT_ALT);
            put("Key_RightWindows", LedKeys.RIGHT_WINDOWS);
            put("Key_Application_select", LedKeys.APPLICATION_SELECT);
            put("Key_RightControl", LedKeys.RIGHT_CONTROL);
            put("Key_LeftArrow", LedKeys.ARROW_LEFT);
            put("Key_DownArrow", LedKeys.ARROW_DOWN);
            put("Key_RightArrow", LedKeys.ARROW_RIGHT);
            put("Key_Numpad_0", LedKeys.NUM_ZERO);
            put("Key_Numpad_Decimal", LedKeys.NUM_PERIOD);
        }
    };
    public static HashMap<String, Integer> TO_HID = new HashMap<String, Integer>() {
        {
            put("Key_Escape", KeyHIDCodes.KEY_ESC);
            put("Key_F1", KeyHIDCodes.KEY_F1);
            put("Key_F2", KeyHIDCodes.KEY_F2);
            put("Key_F3", KeyHIDCodes.KEY_F3);
            put("Key_F4", KeyHIDCodes.KEY_F4);
            put("Key_F5", KeyHIDCodes.KEY_F5);
            put("Key_F6", KeyHIDCodes.KEY_F6);
            put("Key_F7", KeyHIDCodes.KEY_F7);
            put("Key_F8", KeyHIDCodes.KEY_F8);
            put("Key_F9", KeyHIDCodes.KEY_F9);
            put("Key_F10", KeyHIDCodes.KEY_F10);
            put("Key_F11", KeyHIDCodes.KEY_F11);
            put("Key_F12", KeyHIDCodes.KEY_F12);
            put("Key_PrintScreen", KeyHIDCodes.KEY_SYSRQ);
            put("Key_ScrollLock", KeyHIDCodes.KEY_SCROLLLOCK);
            put("Key_PauseBreak", KeyHIDCodes.KEY_PAUSE);
            put("Key_Grave", KeyHIDCodes.KEY_GRAVE);
            put("Key_1", KeyHIDCodes.KEY_1);
            put("Key_2", KeyHIDCodes.KEY_2);
            put("Key_3", KeyHIDCodes.KEY_3);
            put("Key_4", KeyHIDCodes.KEY_4);
            put("Key_5", KeyHIDCodes.KEY_5);
            put("Key_6", KeyHIDCodes.KEY_6);
            put("Key_7", KeyHIDCodes.KEY_7);
            put("Key_8", KeyHIDCodes.KEY_8);
            put("Key_9", KeyHIDCodes.KEY_9);
            put("Key_0", KeyHIDCodes.KEY_0);
            put("Key_Minus", KeyHIDCodes.KEY_MINUS);
            put("Key_Equals", KeyHIDCodes.KEY_EQUAL);
            put("Key_Backspace", KeyHIDCodes.KEY_BACKSPACE);
            put("Key_Insert", KeyHIDCodes.KEY_INSERT);
            put("Key_Home", KeyHIDCodes.KEY_HOME);
            put("Key_PageUp", KeyHIDCodes.KEY_PAGEUP);
            put("Key_Numpad_Lock", KeyHIDCodes.KEY_NUMLOCK);
            put("Key_Numpad_Divide", KeyHIDCodes.KEY_KPSLASH);
            put("Key_Numpad_Multiply", KeyHIDCodes.KEY_KPASTERISK);
            put("Key_Numpad_Subtract", KeyHIDCodes.KEY_KPMINUS);
            put("Key_Tab", KeyHIDCodes.KEY_TAB);
            put("Key_Q", KeyHIDCodes.KEY_Q);
            put("Key_W", KeyHIDCodes.KEY_W);
            put("Key_E", KeyHIDCodes.KEY_E);
            put("Key_R", KeyHIDCodes.KEY_R);
            put("Key_T", KeyHIDCodes.KEY_T);
            put("Key_Y", KeyHIDCodes.KEY_Y);
            put("Key_U", KeyHIDCodes.KEY_U);
            put("Key_I", KeyHIDCodes.KEY_I);
            put("Key_O", KeyHIDCodes.KEY_O);
            put("Key_P", KeyHIDCodes.KEY_P);
            put("Key_LeftBracket", KeyHIDCodes.KEY_LEFTBRACE);
            put("Key_RightBracket", KeyHIDCodes.KEY_RIGHTBRACE);
            put("Key_BackSlash", KeyHIDCodes.KEY_BACKSLASH);
            put("Key_Delete", KeyHIDCodes.KEY_DELETE);
            put("Key_End", KeyHIDCodes.KEY_END);
            put("Key_PageDown", KeyHIDCodes.KEY_PAGEDOWN);
            put("Key_Numpad_7", KeyHIDCodes.KEY_KP7);
            put("Key_Numpad_8", KeyHIDCodes.KEY_KP8);
            put("Key_Numpad_9", KeyHIDCodes.KEY_KP9);
            put("Key_Numpad_Add", KeyHIDCodes.KEY_KPPLUS);
            put("Key_CapsLock", KeyHIDCodes.KEY_CAPSLOCK);
            put("Key_A", KeyHIDCodes.KEY_A);
            put("Key_S", KeyHIDCodes.KEY_S);
            put("Key_D", KeyHIDCodes.KEY_D);
            put("Key_F", KeyHIDCodes.KEY_F);
            put("Key_G", KeyHIDCodes.KEY_G);
            put("Key_H", KeyHIDCodes.KEY_H);
            put("Key_J", KeyHIDCodes.KEY_J);
            put("Key_K", KeyHIDCodes.KEY_K);
            put("Key_L", KeyHIDCodes.KEY_L);
            put("Key_SemiColon", KeyHIDCodes.KEY_SEMICOLON);
            put("Key_Apostrophe", KeyHIDCodes.KEY_APOSTROPHE);
            put("Key_Enter", KeyHIDCodes.KEY_ENTER);
            put("Key_Numpad_4", KeyHIDCodes.KEY_KP4);
            put("Key_Numpad_5", KeyHIDCodes.KEY_KP5);
            put("Key_Numpad_6", KeyHIDCodes.KEY_KP6);
            put("Key_LeftShift", KeyHIDCodes.KEY_LEFTSHIFT);
            put("Key_Z", KeyHIDCodes.KEY_Z);
            put("Key_X", KeyHIDCodes.KEY_X);
            put("Key_C", KeyHIDCodes.KEY_C);
            put("Key_V", KeyHIDCodes.KEY_V);
            put("Key_B", KeyHIDCodes.KEY_B);
            put("Key_N", KeyHIDCodes.KEY_N);
            put("Key_M", KeyHIDCodes.KEY_M);
            put("Key_Comma", KeyHIDCodes.KEY_COMMA);
            put("Key_Period", KeyHIDCodes.KEY_DOT);
            put("Key_Slash", KeyHIDCodes.KEY_SLASH);
            put("Key_RightShift", KeyHIDCodes.KEY_RIGHTSHIFT);
            put("Key_UpArrow", KeyHIDCodes.KEY_UP);
            put("Key_Numpad_1", KeyHIDCodes.KEY_KP1);
            put("Key_Numpad_2", KeyHIDCodes.KEY_KP2);
            put("Key_Numpad_3", KeyHIDCodes.KEY_KP3);
            put("Key_Numpad_Enter", KeyHIDCodes.KEY_KPENTER);
            put("Key_LeftControl", KeyHIDCodes.KEY_LEFTCTRL);
            put("Key_LeftWindows", KeyHIDCodes.KEY_LEFTMETA);
            put("Key_LeftAlt", KeyHIDCodes.KEY_LEFTALT);
            put("Key_Space", KeyHIDCodes.KEY_SPACE);
            put("Key_RightAlt", KeyHIDCodes.KEY_RIGHTALT);
            put("Key_RightWindows", KeyHIDCodes.KEY_RIGHTMETA);
            put("Key_Application_select", KeyHIDCodes.KEY_COMPOSE);
            put("Key_RightControl", KeyHIDCodes.KEY_RIGHTCTRL);
            put("Key_LeftArrow", KeyHIDCodes.KEY_LEFT);
            put("Key_DownArrow", KeyHIDCodes.KEY_DOWN);
            put("Key_RightArrow", KeyHIDCodes.KEY_RIGHT);
            put("Key_Numpad_0", KeyHIDCodes.KEY_KP0);
            put("Key_Numpad_Decimal", KeyHIDCodes.KEY_KPDOT);
        }
    };

}
