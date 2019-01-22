package com.sdk.makers.WidgetFactory;

import org.json.JSONObject;

public abstract class SingleChildWidget extends Widget {

    private Widget child;

    public SingleChildWidget(String name) {
        super(name);
    }

    protected void setChild(Widget child){
        this.child = child;
    }

    @Override
    public JSONObject toJSON() {
        withParam("child", child.toJSON());
        return new JSONObject().put("name", getName()).put("params", getParams());
    }
}
