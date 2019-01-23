package com.sdk.makers.WidgetFactory;

/**
 * This graphical Widget is meant to contain an image obtained from an URL
 * <p>
 * Its possible modifiers are :
 * <pre>
 * - Source  : URL of the image to fetch and display
 * - Height  : {@code double} value of the desired height
 * - Width   : {@code double} value of the desired width
 * - Box Fit : Describes how the image should fit inside the available space
 *             {{@code fill, none, cover, contain, fitWidth, fitHeight, scaleDown}}
 * </pre>
 */
public class Image extends Widget {

    public Image() {
        super("Image");
    }

    /**
     * Sets or Updates the source of this Image
     *
     * @param source URL of the image to fetch and display
     * @return This widget, to allow chained method calls
     */
    public Image withSource(String source) {
        withParam("source", source);
        return this;
    }

    /**
     * Sets or Updates the Width of this Image
     *
     * @param height double value for the width of this Image
     * @return This widget, to allow chained method calls
     */
    public Image withHeight(double height) {
        withParam("height", height);
        return this;
    }

    /**
     * Sets or Updates the Width of this Image
     *
     * @param width double value for the width of this Image
     * @return This widget, to allow chained method calls
     */
    public Image withWidth(double width) {
        withParam("width", width);
        return this;
    }

    /**
     * Sets or Updates the Box Fit value for this Image
     *
     * @param boxFit Describes how the image should fit inside the available space <br>
     *               {{@code fill, none, cover, contain, fitWidth, fitHeight, scaleDown}}
     * @return This widget, to allow chained method calls
     */
    public Image withBoxFit(String boxFit) {
        withParam("boxFit", boxFit);
        return this;
    }


}
