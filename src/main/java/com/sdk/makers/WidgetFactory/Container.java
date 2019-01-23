package com.sdk.makers.WidgetFactory;

/**
 * This graphical Widget is used to be wrapped around another widget
 * <p>
 * Its possible modifiers are :
 * <pre>
 * - Child   : widget wrapped by this Padding
 * - Color   : {@code int} value of the desired background color (ex : 0xFFFFFF = White)
 * - Height  : {@code double} value of the desired height
 * - Width   : {@code double} value of the desired width
 * - Margin  : spacing value on each side of this widget from its parent
 * - Padding : spacing value around each side of the child
 * </pre>
 */
public class Container extends SingleChildWidget {

    public Container() {
        super("Container");
    }

    /**
     * Sets or Updates the child of this Container
     *
     * @param child Widget wrapped by this padding
     * @return This widget, to allow chained method calls
     */
    public Container withChild(Widget child) {
        setChild(child);
        return this;
    }

    /**
     * Sets or Updates the color for the background of this Container
     *
     * @param color int value for the desired background color (ex : 0xFFFFFF = White)
     * @return This widget, to allow chained method calls
     */
    public Container withColor(int color) {
        withParam("colorValue", color);
        return this;
    }

    /**
     * Sets or Updates the Height of this Container
     *
     * @param height double value for the height of this Container
     * @return This widget, to allow chained method calls
     */
    public Container withHeight(double height) {
        withParam("height", height);
        return this;
    }

    /**
     * Sets or Updates the Width of this Container
     *
     * @param width double value for the width of this Container
     * @return This widget, to allow chained method calls
     */
    public Container withWidth(double width) {
        withParam("width", width);
        return this;
    }

    /**
     * Sets or Updates the margin value around the child
     *
     * @param all Margin value to apply on all sides of the child
     * @return This widget, to allow chained method calls
     */
    public Container withMargin(double all) {
        return withMargin(all, all, all, all);
    }

    /**
     * Sets or Updates the margin value around the child
     *
     * @param lateral  Margin value to apply on the Left and Right sides of the child
     * @param vertical Margin value to apply on the Top and Bottom sides of the child
     * @return This widget, to allow chained method calls
     */
    public Container withMargin(double lateral, double vertical) {
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
    public Container withMargin(double top, double right, double bottom, double left) {
        withParam("topMargin", top);
        withParam("rightMargin", right);
        withParam("bottomrgin", bottom);
        withParam("leftMargin", left);

        return this;
    }

    /**
     * Sets or Updates the padding value around the child
     *
     * @param all Padding value to apply on all sides of the child
     * @return This widget, to allow chained method calls
     */
    public Container withPadding(double all) {
        return withPadding(all, all, all, all);
    }

    /**
     * Sets or Updates the padding value around the child
     *
     * @param lateral  Padding value to apply on the Left and Right sides of the child
     * @param vertical Padding value to apply on the Top and Bottom sides of the child
     * @return This widget, to allow chained method calls
     */
    public Container withPadding(double lateral, double vertical) {
        return withPadding(vertical, lateral, vertical, lateral);
    }

    /**
     * Sets or Updates the padding value around the child
     *
     * @param top    Padding value to apply on the Top side of the child
     * @param right  Padding value to apply on the Right side of the child
     * @param bottom Padding value to apply on the Bottom side of the child
     * @param left   Padding value to apply on the Left side of the child
     * @return This widget, to allow chained method calls
     */
    public Container withPadding(double top, double right, double bottom, double left) {
        withParam("topPadding", top);
        withParam("rightPadding", right);
        withParam("bottomrgin", bottom);
        withParam("leftPadding", left);

        return this;
    }

}