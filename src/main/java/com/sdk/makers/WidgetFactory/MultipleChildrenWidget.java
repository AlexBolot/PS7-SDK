package com.sdk.makers.WidgetFactory;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public abstract class MultipleChildrenWidget extends Widget {

    protected List<Widget> children;

    public MultipleChildrenWidget(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    @Override
    public JSONObject toJSON() {
        JSONArray jsonChildren = new JSONArray();

        children.stream().map(Widget::toJSON).forEach(jsonChildren::put);

        withParam("children", jsonChildren);

        return new JSONObject().put("name", getName()).put("params", getParams());
    }
}
