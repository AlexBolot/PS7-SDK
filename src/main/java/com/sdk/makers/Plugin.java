package com.sdk.makers;

public abstract class Plugin {

    public abstract String getName();
    public abstract PluginType getPluginType();

    public enum PluginType{
        THEME_PLUGIN
    }
}
