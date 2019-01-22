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


    /**
     * Handles a call to [methodName]. This call is sent on broadcast to all plugins of the same extensionPoint
     * <p>
     * The implementation of this needs to checks the value of [methodName] and act in consequence
     *
     * @param methodName
     */
    public abstract void reactToMethod(String methodName);

}
