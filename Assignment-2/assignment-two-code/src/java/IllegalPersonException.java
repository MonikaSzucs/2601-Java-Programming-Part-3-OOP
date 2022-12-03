/**
 * IllegalPersonException.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Assignment 1
 *
 * @author Monika Szucs
 * @version 1.1
 *
 * @RuntimeException extends the exception to a run time exception
 */
public class IllegalPersonException extends RuntimeException {

    /**
     * @param person the information of the person
     */
    IllegalPersonException(final String person) {
        super(person);
    }
}
