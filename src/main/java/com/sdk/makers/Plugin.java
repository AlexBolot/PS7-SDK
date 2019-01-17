package com.sdk.makers;

/**
 * This class is the most abstract definition of a Plugin
 * <p>
 * Its main purpose is to enforce definition of methods (like an interface would do).
 * It also contains the definition of the PluginType enum
 */
public abstract class Plugin {

    public abstract String getName();
    public abstract PluginType getPluginType();

    public enum PluginType{
        THEME_PLUGIN
    }
}
