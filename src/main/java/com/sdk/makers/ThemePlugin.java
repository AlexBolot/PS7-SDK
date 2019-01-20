package com.sdk.makers;

/**
 * This class is the abstract definition of a ThemePlugin
 * <p>
 * Its main purpose is to enforce definition of methods (like an interface would do).
 * It also contains the reference and method used to attach to a ThemeExtensionPoint.
 */
public abstract class ThemePlugin extends Plugin {

    protected ThemeExtensionPoint themeExtensionPoint;

    /**
     * Attaches this to a given [themeExtensionPoint].
     *
     * @param themeExtensionPoint ThemeExtensionPoint to which attach this
     */
    public void plugTo(ThemeExtensionPoint themeExtensionPoint) {
        this.themeExtensionPoint = themeExtensionPoint;
        this.themeExtensionPoint.registerAsPlugin(this);
    }

    /**
     * @return The integer value of the desired Primary Color of the Flutter App (either hex or decimal)
     */
    public abstract int getPrimaryColor();

    /**
     * @return The integer value of the desired Secondary Color of the Flutter App (either hex or decimal)
     */
    public abstract int getSecondaryColor();

    /**
     * @return The integer value of the desired Background Color of the Flutter App (either hex or decimal)
     */
    public abstract int getBackground();

    /*
     * @return True if the Flutter App should have a Dark theme, False if it should be a Light theme
     */
    public abstract boolean isDarkTheme();
}
