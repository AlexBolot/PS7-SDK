package com.sdk.makers.WidgetFactory;

import java.util.List;

public class Row extends MultipleChildrenWidget {

    public Row() {
        super("Column");
    }

    public Row withChildren(List<Widget> children) {
        super.children = children;
        return this;
    }

    public Row withMainAxisAlignment(String alignment) {
        withParam("mainAxisAlignment", alignment);
        return this;
    }

    public Row withMainAxisSize(String alignment) {
        withParam("mainAxisSize", alignment);
        return this;
    }

    public Row withCrossAxisAlignment(String alignment) {
        withParam("crossAxisAlignment", alignment);
        return this;
    }

    public Row withTextDirection(String alignment) {
        withParam("textDirection", alignment);
        return this;
    }

    public Row withVerticalDirection(String alignment) {
        withParam("verticalDirection", alignment);
        return this;
    }

    public Row withTextBaseline(String alignment) {
        withParam("textBaseline", alignment);
        return this;
    }

}
