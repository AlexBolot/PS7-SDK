package com.sdk.makers.WidgetFactory;

import java.util.List;

/**
 * This graphical Widget is used to display a group of other widget side by side
 * <p>
 * Its possible modifiers are :
 * <pre>
 * - Children             : list of widgets contained in this Column
 * - Vertical Alignment : vertical placement of the children
 *                        {{@code start, end, center, spaceAround, spaceEvenly, spaceBetween}} (default is start)
 * - Vertical Size      : {@code min, max}, defines if this Column should shrink to its content's size or expand as much as possible
 * - Horizontal Alignment   : horizontal placement of the children
 *                          {@code start, end, center, stretch, baseline} (default is start)
 * - Text Direction       : {@code ltr} (left-to-right) or {@code rtl} (right-to-left)
 * - Horizontal Direction   : {@code up, down}
 * - Text Baseline        : {@code alphabetic, ideographic}
 * </pre>
 */
public class Column extends MultipleChildrenWidget {

    public Column() {
        super("Column");
    }

    /**
     * Sets or Updates the list of children in this column
     *
     * @param children List of widgets contained in the column
     * @return This widget, to allow chained method calls
     */
    public Column withChildren(List<Widget> children) {
        super.children = children;
        return this;
    }

    /**
     * Sets or Updates the Vertical Alignment of the children in this column
     *
     * @param alignment Vertical placement of the children <br>
     *                  {{@code start, end, center, spaceAround, spaceEvenly, spaceBetween}} (default is start)
     * @return This widget, to allow chained method calls
     */
    public Column withVerticalAlignment(String alignment) {
        withParam("mainAxisAlignment", alignment);
        return this;
    }

    /**
     * Sets or Updates the Vertical Size of this column
     *
     * @param size Defines if this Column should shrink to its content's size or expand as much as possible <br>
     *             {{@code min, max}}
     * @return This widget, to allow chained method calls
     */
    public Column withVerticalSize(String size) {
        withParam("mainAxisSize", size);
        return this;
    }

    /**
     * Sets or Updates the Horizontal Alignment of the children in this column
     *
     * @param alignment Horizontal placement of the children <br>
     *                  {{@code start, end, center, stretch, baseline}} (default is start)
     * @return This widget, to allow chained method calls
     */
    public Column withHorizontalAlignment(String alignment) {
        withParam("crossAxisAlignment", alignment);
        return this;
    }

    /**
     * Sets or Updates the Text Direction of this column
     *
     * @param direction {@code ltr} (left-to-right) or {@code rtl} (right-to-left)
     * @return This widget, to allow chained method calls
     */
    public Column withTextDirection(String direction) {
        withParam("textDirection", direction);
        return this;
    }

    /**
     * Sets or Updates the Horizontal Direction of the children in this column
     *
     * @param direction {@code up, down}
     * @return This widget, to allow chained method calls
     */
    public Column withHorizontalDirection(String direction) {
        withParam("horizontalDirection", direction);
        return this;
    }

    /**
     * Sets or Updates the Baseline position of the children in this column
     *
     * @param baseline {@code alphabetic, ideographic} depending of the language's character's style
     * @return This widget, to allow chained method calls
     */
    public Column withTextBaseline(String baseline) {
        withParam("textBaseline", baseline);
        return this;
    }

}
