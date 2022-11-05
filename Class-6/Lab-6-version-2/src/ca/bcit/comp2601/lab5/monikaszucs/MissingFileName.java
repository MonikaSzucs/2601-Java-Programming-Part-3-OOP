package ca.bcit.comp2601.lab5.monikaszucs;

/**
 * MissingFileName.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Lab #5
 *
 * @author Monika Szucs
 * @version 1.2
 *
 * Checked Exception
 */
public class MissingFileName extends Exception {

    /**
     * @param message the message returned for a missing file name
     */
    public MissingFileName(final String message) {
        super(message);
    }
}
