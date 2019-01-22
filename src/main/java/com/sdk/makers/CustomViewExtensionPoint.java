package com.sdk.makers;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This class is defines a more specialized kind of Extension Point, able to process CustomViewPlugins
 * <p>
 * Its purpose is to allow CustomViewPlugins to attach to itself and then process a Map of values from its list of CustomViewPlugins
 */
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

    /**
     * Used in reaction to an event triggered from a Custom Generatied
     * @param methodName
     */
    public void broadCastTrigger(String methodName) {
        for (CustomViewPlugin plugin : plugins) {
            try {
                plugin.reactToMethod(methodName);
            } catch (Exception exception) {
                System.out.println("----- Exception raised during broadcast of \"" + methodName + "\" to " + plugin.getName() + " -----");
                exception.printStackTrace();
                System.out.println("--------------------------------------------------");
            }
        }
    }
}
