package com.sdk.makers;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomViewExtensionPoint extends ExtensionPoint {

    private List<CustomViewPlugin> plugins = new ArrayList<>();

    /**
     * Allows CustomViewExtensionPlugin to attach to this.
     * <p>
     * If [plugin] == null, it is not attached.
     *
     * @param plugin CustomViewPlugin to attach to this, must not be null
     */
    public void registerAsPlugin(CustomViewPlugin plugin) {
        if (plugin != null)
            plugins.add(plugin);
    }


    /**
     * Processes all plugins attached to this.
     * <p>
     * </pre>
     * <p>
     * And then adds their return value to the [resultOfProcess]
     *
     * @return Map of values containing the result of method calls
     */
    @Override
    public Map<String, Object> processPlugins() {
        for (CustomViewPlugin plugin : plugins) {
            resultOfProcess.put(plugin.getName(), plugin.getViews());
        }
        return resultOfProcess;
    }
}