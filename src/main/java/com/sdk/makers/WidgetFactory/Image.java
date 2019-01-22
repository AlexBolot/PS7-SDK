package com.sdk.makers.WidgetFactory;

import org.json.JSONObject;

public class Image extends Widget {

    public Image() {
        super("Image");
    }

    public Image withSource(String source) {
        withParam("source", source);
        return this;
    }

    public Image withHeight(double height) {
        withParam("height", height);
        return this;
    }

    public Image withWidth(double width) {
        withParam("width", width);
        return this;
    }

    public Image withBoxFit(String boxFit) {
        withParam("boxFit", boxFit);
        return this;
    }


}
