package com.sdk.makers.WidgetFactory;

public class Card extends SingleChildWidget {

    public Card() {
        super("Card");
    }

    public Card withChild(Widget child) {
        setChild(child);
        return this;
    }

    public Card withColor(int colorValue) {
        withParam("colorValue", colorValue);
        return this;
    }

    public Card withElevation(double elevation) {
        withParam("elevation", elevation);
        return this;
    }

    public Card withMargin(double all) {
        return withMargin(all, all, all, all);
    }

    public Card withMargin(double lateral, double vertical) {
        return withMargin(vertical, lateral, vertical, lateral);
    }

    public Card withMargin(double top, double right, double bottom, double left) {
        withParam("topMargin", top);
        withParam("rightMargin", right);
        withParam("bottomrgin", bottom);
        withParam("leftMargin", left);

        return this;
    }

}