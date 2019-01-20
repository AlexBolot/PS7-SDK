package com.sdk.makers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * This class is defines a more specialized kind of Extension Point, able to process ThemePlugins
 * <p>
 * Its purpose is to allow ThemePlugins to attach to itself and then process a Map of values from its list of ThemePlugins
 */
@SuppressWarnings("unused")
public class ThemeExtensionPoint extends ExtensionPoint {

    private List<ThemePlugin> plugins = new ArrayList<>();


    /**
     * Allows a ThemePlugin to attach to this.
     * <p>
     * If [plugin] == null, it is not attached.
     *
     * @param plugin ThemePlugin to attach to this, must not be null
     */
    public void registerAsPlugin(ThemePlugin plugin) {
        if (plugin != null)
            plugins.add(plugin);
    }

    /**
     * Processes all plugins attached to this.
     * <p>
     * Calls the 4 known methods of a ThemePlugin :
     * <pre>
     * {@code
     *  - getPrimaryColor()
     *  - getSecondaryColor()
     *  - getBackground()
     *  - isDarkTheme()
     * }
     * </pre>
     * <p>
     * And then adds their return value to the [resultOfProcess]
     *
     * @return Map of values containing the result of method calls
     */
    @Override
    public Map<String, Object> processPlugins() {

        for (ThemePlugin themePlugin : plugins) {
            processMethod(themePlugin::getPrimaryColor, themePlugin.getName(), "getPrimaryColor()");
            processMethod(themePlugin::getSecondaryColor, themePlugin.getName(), "getSecondaryColor()");
            processMethod(themePlugin::getBackground, themePlugin.getName(), "getBackground()");
            processMethod(themePlugin::isDarkTheme, themePlugin.getName(), "isDarkTheme()");
        }

        return resultOfProcess;
    }

    /**
     * This methods only wraps up a small try-catch system to avoid code redundance
     * <p>
     * If a method call throws an Exception, we just print the message and keep parsing other methods and plugins
     *
     * @param methodToCall Callable parameter of the method to process
     * @param pluginName   Name of the plugin being processes, for print purposes only
     * @param methodName   Name of the method being called, used as key in [resultOfProcess]
     */
    private void processMethod(Callable methodToCall, String pluginName, String methodName) {
        try {
            Object value = methodToCall.call();

            if (resultOfProcess.containsKey(methodName)) {
                System.out.println("> Warning : call to " + methodName + " of " + pluginName + " overriding previous value");
            }

            resultOfProcess.put(methodName, value);

        } catch (Exception exception) {
            handleException(exception, methodName, pluginName);
        }
    }

    private void handleException(Exception exeption, String methodName, String pluginName) {
        System.out.println("--- Error occurred during for " + pluginName + " during call to " + methodName);
        System.out.println(exeption.getMessage());
        System.out.println("-----------------------------------------------------------");
    }
}
