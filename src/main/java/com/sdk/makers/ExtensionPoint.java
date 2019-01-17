package com.sdk.makers;

import com.sdk.makers.Plugin.PluginType;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is the abstract definition of our SDK's API
 * <p>
 * Its main purpose is to allow a plugin to require a JSON Config from the core of the application
 */
public abstract class ExtensionPoint {

    private Map<PluginType, JSONObject> configFiles = new HashMap<>();

    /**
     * Make a JSON config available to all Plugins matching [pluginType]
     *
     * @param pluginType Plugin.PluginType enum value, used as key to reference a JSON config
     * @param jsonObject JSON config accessible by Plugins
     */
    public void addConfig(PluginType pluginType, JSONObject jsonObject) {
        configFiles.put(pluginType, jsonObject);
    }

    /**
     * Returns the JSON Config matching [pluginType]
     *
     * @param pluginType Plugin.PluginType enum value, used as key to find a JSON config
     * @return JSON config matching [pluginType]
     */
    public JSONObject getConfigFile(PluginType pluginType) {
        return configFiles.get(pluginType);
    }
}
