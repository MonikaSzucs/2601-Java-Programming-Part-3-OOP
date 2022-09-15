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

    private static final Integer FOURTY_FIVE_CHARACTERS = 45;
    private static final Integer INITIAL_CHARACTER      = 0;
    private static final Integer SECOND_CHARACTER       = 1;

    /**
     * The constructor for the Name class
     *
     * @param first the first name of the person in String
     * @param last the last name of the person in String
     * @throws IllegalArgumentException for the first and last name if the name if null, blank, or over 45 characters
     *
     */
    Name(final String first, final String last) {
        if(first == null || first.isBlank()) {
            throw new IllegalArgumentException("The argument is not valid. The first cannot be null or empty");
        }
        if(last == null || last.isBlank()) {
            throw new IllegalArgumentException("The argument is not valid. The first cannot be null or empty");
        }

        if(first.length() > FOURTY_FIVE_CHARACTERS) {
            throw new IllegalArgumentException("The first name is longer than 45 characters");
        } else if(first.toLowerCase().contains("admin")) {
            throw new IllegalArgumentException("The first name has the word admin in it");
        } else {
            this.first = first;
        }

        if(last.length() > FOURTY_FIVE_CHARACTERS) {
            throw new IllegalArgumentException("The last name is longer than 45 characters");
        } else if(last.toLowerCase().contains("admin")){
            throw new IllegalArgumentException("The last name has the word admin in it");
        }else {
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
        return first.substring(INITIAL_CHARACTER,SECOND_CHARACTER).toUpperCase() + "." + last.substring(INITIAL_CHARACTER,SECOND_CHARACTER).toUpperCase() + ".";
    }

    /**
     * Getting the full name of the person
     *
     * @return the first and last name of the person with first initials capitalized
     */
    public String getFullName() {
        return first.substring(INITIAL_CHARACTER,SECOND_CHARACTER).toUpperCase() + first.substring(SECOND_CHARACTER).toLowerCase() + " " +
                last.substring(INITIAL_CHARACTER,SECOND_CHARACTER).toUpperCase()  + last.substring(SECOND_CHARACTER).toLowerCase();
    }
}
