package com.sdk.makers;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public abstract class ExtensionPoint {

    private Map<ConfigType, JSONObject> configFiles = new HashMap<>();

    public void addConfig(ConfigType configType, JSONObject jsonObject) {
        configFiles.put(configType, jsonObject);
    }

    public JSONObject getConfigFile(ConfigType configType) {
        return configFiles.get(configType);
    }

    public enum ConfigType {
        ThemeConfig
    }
}
