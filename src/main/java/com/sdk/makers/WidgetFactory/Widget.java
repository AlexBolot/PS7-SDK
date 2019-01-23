package com.sdk.makers.WidgetFactory;

import org.json.JSONObject;

/**
 * This class is the abstract definition of a graphical Widget to create
 * <p>
 * Its purpose is to help generate the appropriate JSON Object, with the appropriate keys and values
 */
public abstract class Widget {

    private String name;
    private JSONObject params;

    public Widget(String name) {
        this.name = name;
        this.params = new JSONObject();
    }

    /**
     * Adds or updates a [key] with a given [value] to the [params] JSON Object
     *
     * @param key   Key to add or update
     * @param value Value linked to the [key]
     */
    protected void withParam(String key, Object value) {
        params.put(key, value);
    }

    protected String getName() {
        return name;
    }

    protected JSONObject getParams() {
        return params;
    }

    /**
     * Builds a JSON Object containing "name" and "params" for this Widget
     *
     * @return A JSON Object containing "name" and "params" for this Widget
     */
    public JSONObject toJSON() {
        return new JSONObject().put("name", name).put("params", params);
    }

    @Override
    public String toString() {
        return this.toJSON().toString();
    }
}