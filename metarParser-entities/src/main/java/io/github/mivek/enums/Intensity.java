package io.github.mivek.enums;

import io.github.mivek.internationalization.Messages;

/**
 * Enumeration for indicator.
 * The first attribute is the code used in the metar.
 * The second attribute is the meaning of the code.
 *
 * @author mivek
 */
public enum Intensity {
    /** Light intensity. */
    LIGHT("-"),
    /** Heavy intensity. */
    HEAVY("+"),
    /** In vicinity. */
    IN_VICINITY("VC");

    /** The shortcut of the intensity. */
    private final String shortcut;

    /**
     * Constructor.
     *
     * @param shortcut A String for the shortcut.
     */
    Intensity(final String shortcut) {
        this.shortcut = shortcut;
    }

    @Override
    public String toString() {
        return Messages.getInstance().getString("Intensity." + getShortcut());
    }

    /**
     * Returns shortcut.
     *
     * @return string.
     */
    public String getShortcut() {
        return shortcut;
    }

    /**
     * Returns the enum with the same shortcut than the value.
     *
     * @param value String of the intensity searched.
     * @return a intensity with the same shortcut.
     * @throws IllegalArgumentException error if not found.
     */
    public static Intensity getEnum(final String value) {
        for (Intensity v : values()) {
            if (v.getShortcut().equalsIgnoreCase(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException();
    }
}
