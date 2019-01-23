package com.sdk.makers.WidgetFactory;

/**
 * This graphical Widget is used to apply a padding space around another widget
 * <p>
 * Its possible modifiers are :
 * <pre>
 * - Child   : widget wrapped by this Padding
 * - Padding : spacing value around each side of the child
 * </pre>
 */
public class Padding extends SingleChildWidget {

    public Padding() {
        super("Padding");
    }

    /**
     * Sets or Updates the child of this padding
     *
     * @param child Widget wrapped by this padding
     * @return This widget, to allow chained method calls
     */
    public Padding withChild(Widget child) {
        setChild(child);
        return this;
    }

    /**
     * Sets or Updates the padding value around the child
     *
     * @param all Padding value to apply on all sides of the child
     * @return This widget, to allow chained method calls
     */
    public Padding withPadding(double all) {
        return withPadding(all, all, all, all);
    }

    /**
     * Sets or Updates the padding value around the child
     *
     * @param lateral Padding value to apply on the Left and Right sides of the child
     * @param vertical Padding value to apply on the Top and Bottom sides of the child
     * @return This widget, to allow chained method calls
     */
    public Padding withPadding(double lateral, double vertical) {
        return withPadding(vertical, lateral, vertical, lateral);
    }

    /**
     * Sets or Updates the padding value around the child
     *
     * @param top Padding value to apply on the Top side of the child
     * @param right Padding value to apply on the Right side of the child
     * @param bottom Padding value to apply on the Bottom side of the child
     * @param left Padding value to apply on the Left side of the child
     * @return This widget, to allow chained method calls
     */
    public Padding withPadding(double top, double right, double bottom, double left) {
        withParam("topPadding", top);
        withParam("rightPadding", right);
        withParam("bottomrgin", bottom);
        withParam("leftPadding", left);

        return this;
    }

}
