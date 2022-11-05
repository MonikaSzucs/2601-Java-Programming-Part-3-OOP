package ca.bcit.comp2601.lab5.monikaszucs;

/**
 * InvalidFileName.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Lab #5
 *
 * @author Monika Szucs
 * @version 1.2
 *
 * Unchecked exception
 */
public class InvalidFileName extends RuntimeException {

    /**
     * @param message the message for the invalid file name
     */
    public InvalidFileName(final String message) {
        super(message);
    }
}
