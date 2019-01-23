package com.sdk.makers.WidgetFactory;

import java.util.List;

/**
 * This graphical Widget is used to display a group of other widget side by side
 * <p>
 * Its possible modifiers are :
 * <pre>
 * - Children             : list of widgets contained in this Row
 * - Horizontal Alignment : horizontal placement of the children
 *                        {{@code start, end, center, spaceAround, spaceEvenly, spaceBetween}} (default is start)
 * - Horizontal Size      : {@code min, max}, defines if this Row should shrink to its content's size or expand as much as possible
 * - Vertical Alignment   : vertical placement of the children
 *                          {@code start, end, center, stretch, baseline} (default is start)
 * - Text Direction       : {@code ltr} (left-to-right) or {@code rtl} (right-to-left)
 * - Vertical Direction   : {@code up, down}
 * - Text Baseline        : {@code alphabetic, ideographic}
 * </pre>
 */
public class Row extends MultipleChildrenWidget {

    public Row() {
        super("Row");
    }

    /**
     * Sets or Updates the list of children in this row
     *
     * @param children List of widgets contained in the row
     * @return This widget, to allow chained method calls
     */
    public Row withChildren(List<Widget> children) {
        super.children = children;
        return this;
    }

    /**
     * Sets or Updates the Horizontal Alignment of the children in this row
     *
     * @param alignment Horizontal placement of the children <br>
     *                  {{@code start, end, center, spaceAround, spaceEvenly, spaceBetween}} (default is start)
     * @return This widget, to allow chained method calls
     */
    public Row withHorizontalAlignment(String alignment) {
        withParam("mainAxisAlignment", alignment);
        return this;
    }

    /**
     * Sets or Updates the Horizontal Size of this row
     *
     * @param size Defines if this Row should shrink to its content's size or expand as much as possible <br>
     *             {{@code min, max}}
     * @return This widget, to allow chained method calls
     */
    public Row withHorizontalSize(String size) {
        withParam("mainAxisSize", size);
        return this;
    }

    /**
     * Sets or Updates the Vertical Alignment of the children in this row
     *
     * @param alignment Vertical placement of the children <br>
     *                  {{@code start, end, center, stretch, baseline}} (default is start)
     * @return This widget, to allow chained method calls
     */
    public Row withVerticalAlignment(String alignment) {
        withParam("crossAxisAlignment", alignment);
        return this;
    }

    /**
     * Sets or Updates the Text Direction of this row
     *
     * @param direction {@code ltr} (left-to-right) or {@code rtl} (right-to-left)
     * @return This widget, to allow chained method calls
     */
    public Row withTextDirection(String direction) {
        withParam("textDirection", direction);
        return this;
    }

    /**
     * Sets or Updates the Vertical Direction of the children in this row
     *
     * @param direction {@code up, down}
     * @return This widget, to allow chained method calls
     */
    public Row withVerticalDirection(String direction) {
        withParam("verticalDirection", direction);
        return this;
    }

    /**
     * Sets or Updates the Baseline position of the children in this row
     *
     * @param baseline {@code alphabetic, ideographic} depending of the language's character's style
     * @return This widget, to allow chained method calls
     */
    public Row withTextBaseline(String baseline) {
        withParam("textBaseline", baseline);
        return this;
    }

}
