package com.sdk.makers.WidgetFactory;

/**
 * This graphical Widget is used to display a textual value to the user
 * <p>
 * Its possible modifiers are :
 * <pre>
 * - Value      : text to display
 * - Direction  : {@code ltr} (left-to-right) or {@code rtl} (right-to-left)
 * - Color      : {@code int} value of the desired text color (ex : 0xFFFFFF = White)
 * - Size       : {@code double} value size of the text in pixels (default is 14.0)
 * - Align      : {@code start, end, right, left, center, justify} (default is center)
 * </pre>
 */
public class Text extends Widget {

    public Text() {
        this("");
    }

    public Text(String value) {
        super("Text");
        withParam("value", value);
    }

    /**
     * Sets or Updates the "value" field of this widget
     *
     * @param value text to display in this widget
     * @return This widget, to allow chained method calls
     */
    public Text withValue(String value) {
        withParam("value", value);
        return this;
    }

    /**
     * Sets or Updates the "text direction" field of this widget
     *
     * @param textDirection Direction right-to-left (rtl) or left-to-right (ltr)
     * @return This widget, to allow chained method calls
     */
    public Text withTextDirection(String textDirection) {
        withParam("textDirection", textDirection);
        return this;
    }

    /**
     * Sets or Updates the "color" field of this widget
     *
     * @param colorValue Value of the desired text color (ex : 0xFFFFFF = White)
     * @return This widget, to allow chained method calls
     */
    public Text withColor(int colorValue) {
        withParam("colorValue", colorValue);
        return this;
    }

    /**
     * Sets or Updates the "fontSize" field of this widget
     *
     * @param fontSize Value size of the text in pixels (default is 14.0)
     * @return This widget, to allow chained method calls
     */
    public Text withFontSize(double fontSize) {
        withParam("fontSize", fontSize);
        return this;
    }

    /**
     * Sets or Updates the "textAlign" field of this widget
     *
     * @param textAlign Horizontal align of the content <br>
     *                  {{@code start, end, right, left, center, justify}} (default is center)
     * @return This widget, to allow chained method calls
     */
    public Text withTextAlign(String textAlign) {
        withParam("textAlign", textAlign);
        return this;
    }

}
