package com.sdk.makers.WidgetFactory;

public class Container extends SingleChildWidget {

    public Container() {
        super("Container");
    }

    public Container withChild(Widget child) {
        setChild(child);
        return this;
    }

    public Container withColor(int color) {
        withParam("colorValue", color);
        return this;
    }

    public Container withHeight(double height) {
        withParam("height", height);
        return this;
    }

    public Container withWidth(double width) {
        withParam("width", width);
        return this;
    }

    public Container withMargin(double all) {
        return withMargin(all, all, all, all);
    }

    public Container withMargin(double lateral, double vertical) {
        return withMargin(vertical, lateral, vertical, lateral);
    }

    public Container withMargin(double top, double right, double bottom, double left) {
        withParam("topMargin", top);
        withParam("rightMargin", right);
        withParam("bottomrgin", bottom);
        withParam("leftMargin", left);

        return this;
    }

    public Container withPadding(double all) {
        return withPadding(all, all, all, all);
    }

    public Container withPadding(double lateral, double vertical) {
        return withPadding(vertical, lateral, vertical, lateral);
    }

    public Container withPadding(double top, double right, double bottom, double left) {
        withParam("topPadding", top);
        withParam("rightPadding", right);
        withParam("bottomrgin", bottom);
        withParam("leftPadding", left);

        return this;
    }

}