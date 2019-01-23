package com.sdk.makers.WidgetFactory;

/**
 * This graphical Widget is used to wrap around another widget, to apply a border radius and shadow elevation
 * <p>
 * Its possible modifiers are :
 * <pre>
 * - Child     : widget wrapped by this Card
 * - Color     : {@code int} value of the desired background color (ex : 0xFFFFFF = White)
 * - Elevation : {@code double} value for the size of the shadow (like you would expect from a z-axis)
 * - Margin    : spacing value on each side of this widget from its parent
 * </pre>
 */
public class Card extends SingleChildWidget {

    public Card() {
        super("Card");
    }

    /**
     * Sets or Updates the child of this padding
     *
     * @param child Widget wrapped by this padding
     * @return This widget, to allow chained method calls
     */
    public Card withChild(Widget child) {
        setChild(child);
        return this;
    }

    /**
     * Sets or Updates the color for the background of this Card
     *
     * @param colorValue int value for the desired background color (ex : 0xFFFFFF = White)
     * @return This widget, to allow chained method calls
     */
    public Card withColor(int colorValue) {
        withParam("colorValue", colorValue);
        return this;
    }

    /**
     * Sets or Updates the elevation of this Card
     *
     * @param elevation double value for the size of the shadow (like you would expect from a z-axis)
     * @return This widget, to allow chained method calls
     */
    public Card withElevation(double elevation) {
        withParam("elevation", elevation);
        return this;
    }

    /**
     * Sets or Updates the margin value around the child
     *
     * @param all Margin value to apply on all sides of the child
     * @return This widget, to allow chained method calls
     */
    public Card withMargin(double all) {
        return withMargin(all, all, all, all);
    }

    /**
     * Sets or Updates the margin value around the child
     *
     * @param lateral  Margin value to apply on the Left and Right sides of the child
     * @param vertical Margin value to apply on the Top and Bottom sides of the child
     * @return This widget, to allow chained method calls
     */
    public Card withMargin(double lateral, double vertical) {
        return withMargin(vertical, lateral, vertical, lateral);
    }

    /**
     * Sets or Updates the margin value around the child
     *
     * @param top    Margin value to apply on the Top side of the child
     * @param right  Margin value to apply on the Right side of the child
     * @param bottom Margin value to apply on the Bottom side of the child
     * @param left   Margin value to apply on the Left side of the child
     * @return This widget, to allow chained method calls
     */
    public Card withMargin(double top, double right, double bottom, double left) {
        withParam("topMargin", top);
        withParam("rightMargin", right);
        withParam("bottomrgin", bottom);
        withParam("leftMargin", left);

        return this;
    }

}