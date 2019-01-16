package com.sdk.makers;

import com.sdk.makers.Plugin.PluginType;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public abstract class ExtensionPoint {

    private Map<PluginType, JSONObject> configFiles = new HashMap<>();

    public void addConfig(PluginType pluginType, JSONObject jsonObject) {
        configFiles.put(pluginType, jsonObject);
    }

    public JSONObject getConfigFile(PluginType pluginType) {
        return configFiles.get(pluginType);
    }
}
