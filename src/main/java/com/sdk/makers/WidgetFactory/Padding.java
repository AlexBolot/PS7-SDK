package com.sdk.makers.WidgetFactory;

public class Padding extends SingleChildWidget {

    public Padding() {
        super("Padding");
    }

    public Padding withChild(Widget child) {
        setChild(child);
        return this;
    }

    public Padding withPadding(double all) {
        return withPadding(all, all, all, all);
    }

    public Padding withPadding(double lateral, double vertical) {
        return withPadding(vertical, lateral, vertical, lateral);
    }

    public Padding withPadding(double top, double right, double bottom, double left) {
        withParam("topPadding", top);
        withParam("rightPadding", right);
        withParam("bottomrgin", bottom);
        withParam("leftPadding", left);

        return this;
    }

}
