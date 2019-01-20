package com.sdk.makers;

import org.json.JSONObject;

import java.util.List;

/**
 * TODO
 */
public abstract class CustomViewPlugin extends Plugin {

    protected CustomViewExtensionPoint customViewExtensionPoint;

    /**
     * Attaches this to a given [customViewExtensionPoint].
     *
     * @param customViewExtensionPoint customViewExtensionPoint to which attach this
     */
    public void plugTo(CustomViewExtensionPoint customViewExtensionPoint) {
        this.customViewExtensionPoint = customViewExtensionPoint;
        this.customViewExtensionPoint.registerAsPlugin(this);
    }

    public abstract List<JSONObject> getViews();

}
