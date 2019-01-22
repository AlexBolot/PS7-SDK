package com.sdk.makers.WidgetFactory;

import org.json.JSONObject;

public abstract class Widget {

    private String name;
    private JSONObject params;

    public Widget(String name) {
        this.name = name;
        this.params = new JSONObject();
    }

    protected void withParam(String key, Object value) {
        params.put(key, value);
    }

    protected String getName() {
        return name;
    }

    protected JSONObject getParams() {
        return params;
    }

    public JSONObject toJSON() {
        return new JSONObject().put("name", name).put("params", params);
    }
}