package ca.bcit.comp2601.firstreview.monikaszucs;

/**
 * Name.java
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * First Review
 *
 * @author Monika Szucs
 * @author Tian Lan
 *
 * @version 1.0
 *
 * Creating a name class with the first and last name
 */
public class Name {
    private final String  first;
    private final String  last;

    /**
     * The constructor for the Name class
     *
     * @param first the first name of the person
     * @param last the last name of the person
     * @throws IllegalArgumentException for the first and last name
     *
     */
    Name(final String first, final String last) {
        if(first == null || first.isBlank()) {
            throw new IllegalArgumentException("The argument is not valid. The first cannot be null or empty");
        }
        if(last == null || last.isBlank()) {
            throw new IllegalArgumentException("The argument is not valid. The last cannot be null or empty");
        }

        if(first.length() > 45 || first.toLowerCase().contains("admin")) {
            throw new IllegalArgumentException("The first is less than 45 characters or contains the word admin");
        } else {
            this.first = first;
        }

        if(last.length() > 45 || last.toLowerCase().contains("admin")) {
            throw new IllegalArgumentException("The last is greater than 45 characters or contains the word admin");
        } else {
            this.last = last;
        }
    }

    /**
     * The first name of the person
     *
     * @return the first name
     */
    public String getFirst() {
        return first;
    }

    /**
     * The last name of the person
     *
     * @return the last name
     */
    public String getLast() {
        return last;
    }

    /**
     * Getting the initials of the person
     *
     * @return initials of the person containing the first letter of the first name and first letter of the last name
     */
    public String getInitials() {
        return first.substring(0,1).toUpperCase() + "." + last.substring(0,1).toUpperCase() + ".";
    }

    /**
     * Getting the full name of the person
     *
     * @return the first and last name of the person
     */
    public String getFullName() {
        return first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase() + " " +
                last.substring(0,1).toUpperCase()  + last.substring(1).toLowerCase();
    }
}
