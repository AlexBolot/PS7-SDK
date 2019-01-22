package com.sdk.makers.WidgetFactory;

public class Button extends SingleChildWidget {

    public Button() {
        super("Button");
    }

    public Button withChild(Widget child) {
        setChild(child);
        return this;
    }

    public Button withCallbackName(String callbackName) {
        withParam("callbackName", callbackName);
        return this;
    }

    public Button withPadding(double all) {
        return withPadding(all, all, all, all);
    }

    public Button withPadding(double lateral, double vertical) {
        return withPadding(vertical, lateral, vertical, lateral);
    }

    public Button withPadding(double top, double right, double bottom, double left) {
        withParam("topPadding", top);
        withParam("rightPadding", right);
        withParam("bottomrgin", bottom);
        withParam("leftPadding", left);

        return this;
    }

}
