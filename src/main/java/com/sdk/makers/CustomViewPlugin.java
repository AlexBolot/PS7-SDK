package com.sdk.makers;

import org.json.JSONObject;

import java.util.List;

/**
 * This class is the abstract definition of a CustomViewPlugin
 * <p>
 * Its main purpose is to enforce definition of methods (like an interface would do).
 * It also contains the reference and method used to attach to a CustomViewExtensionPoint.
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

    /**
     * @return a {List} of {JSONObject} representing a view
     */
    public abstract List<JSONObject> getViews();

}
