package ca.bcit.comp2601.assignment1.monikaszucs;

import java.util.Locale;

/**
 * Name.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Assignment 1
 *
 * @author Monika Szucs
 * @version 1.2
 *
 */
class Name {
    private final String first;
    private final String last;

    private static final int POSITION_CAPITALIZATION;
    private static final int POSITION_LOWERCASE;

    static {
        POSITION_CAPITALIZATION = 0;
        POSITION_LOWERCASE = 1;
    }

    /**
     * @param first the first name of the person
     * @param last the last name of the person
     */
    Name(final String first, final String last) {
        if(first == null || first.isBlank()) {
            throw new IllegalArgumentException("invalid first name");
        }

        if(last == null || last.isBlank()) {
            throw new IllegalArgumentException("invalid last name");
        }

        this.first = first;
        this.last = last;
    }

    /**
     * @return the first name of the person
     */
    public String getFirst() {
        return first;
    }

    /**
     * @return the last name of the person
     */
    public String getLast() {
        return last;
    }

    /**
     * @return the properly formatted name
     */
    public String getPrettyName() {
        return first.toUpperCase().charAt(POSITION_CAPITALIZATION) + first.toLowerCase().substring(POSITION_LOWERCASE) + " " + last.toUpperCase().charAt(POSITION_CAPITALIZATION) + last.toLowerCase().substring(POSITION_LOWERCASE);
    }

    /**
     * @return the initials of the person
     */
    public String getInitials() {
        return first.toUpperCase().charAt(POSITION_CAPITALIZATION) + "." + last.toUpperCase().charAt(POSITION_CAPITALIZATION) + ".";
    }
}
