package com.sdk.makers.WidgetFactory;

public class Text extends Widget {

    public Text() {
        this("");
    }

    public Text(String value) {
        super("Text");
        withParam("value", value);
    }

    public Text withValue(String value) {
        withParam("value", value);
        return this;
    }

    public Text withTextDirection(String textDirection) {
        withParam("textDirection", textDirection);
        return this;
    }

    public Text withColor(int colorValue) {
        withParam("colorValue", colorValue);
        return this;
    }

    public Text withFontSize(double fontSize) {
        withParam("fontSize", fontSize);
        return this;
    }

    public Text withTextAlign(String textAlign) {
        withParam("textAlign", textAlign);
        return this;
    }

}
