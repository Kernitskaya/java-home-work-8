package ru.fileManager;

import java.util.*;

public class FileManager {
    Map<String, String> filesMap = new HashMap<>();

    public void registerApp(String appName, String extension) {
        filesMap.put(extension.toLowerCase(), appName);
    }

    public String getAppNameByExtension(String extension) {
        return filesMap.get(extension.toLowerCase());
    }

    public void removeByExtension(String extension) {
        filesMap.remove(extension);
    }

    public Set<String> getAllExtension() {
        return new HashSet<>(filesMap.values());
    }

    public Set<String> getAllKeys() {
        return filesMap.keySet();
    }
}
