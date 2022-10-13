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
 * @version 1.1
 *
 */
class Name {
    private final String first;
    private final String last;

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
        return first.toUpperCase().charAt(0) + first.toLowerCase().substring(1) + " " + last.toUpperCase().charAt(0) + last.toLowerCase().substring(1);
    }

    /**
     * @return the initials of the person
     */
    public String getInitials() {
        return first.toUpperCase().charAt(0) + "." + last.toUpperCase().charAt(0) + ".";
    }
}
