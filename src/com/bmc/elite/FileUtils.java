package com.bmc.elite;

import com.bmc.elite.callbacks.FileReadCallback;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileUtils {
    public static String readFile(String filename) {
        return readFile(filename, null);
    }
    public static String readFile(String filename, FileReadCallback fileReadCallback) {
        try {
            return readFile(new FileReader(filename), fileReadCallback);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String readFile(InputStreamReader inputStreamReader) {
        return readFile(inputStreamReader, null);
    }
    public static String readFile(InputStreamReader inputStreamReader, FileReadCallback fileReadCallback) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(inputStreamReader);
            try {
                String line;
                while ((line = br.readLine()) != null) {
                    if(fileReadCallback != null) {
                        fileReadCallback.onRead(0, line);
                    }
                    sb.append(line).append(System.lineSeparator());
                }
            } finally {
                br.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public static File lastFileModified(String dir) {
        return lastFileModified(dir, null);
    }
    public static File lastFileModified(String dir, String extension) {
        File fl = new File(dir);
        File[] files = fl.listFiles(file -> file.isFile() && (extension == null || file.getName().endsWith(extension)));
        long lastMod = Long.MIN_VALUE;
        File choice = null;
        for (File file : files) {
            if (file.lastModified() > lastMod) {
                choice = file;
                lastMod = file.lastModified();
            }
        }
        return choice;
    }
}
