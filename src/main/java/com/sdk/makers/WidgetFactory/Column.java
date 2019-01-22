package com.sdk.makers.WidgetFactory;

import java.util.List;

public class Column extends MultipleChildrenWidget {

    public Column() {
        super("Column");
    }

    public Column withChildren(List<Widget> children) {
        super.children = children;
        return this;
    }

    public Column withMainAxisAlignment(String alignment) {
        withParam("mainAxisAlignment", alignment);
        return this;
    }

    public Column withMainAxisSize(String alignment) {
        withParam("mainAxisSize", alignment);
        return this;
    }

    public Column withCrossAxisAlignment(String alignment) {
        withParam("crossAxisAlignment", alignment);
        return this;
    }

    public Column withTextDirection(String alignment) {
        withParam("textDirection", alignment);
        return this;
    }

    public Column withVerticalDirection(String alignment) {
        withParam("verticalDirection", alignment);
        return this;
    }

    public Column withTextBaseline(String alignment) {
        withParam("textBaseline", alignment);
        return this;
    }

}
