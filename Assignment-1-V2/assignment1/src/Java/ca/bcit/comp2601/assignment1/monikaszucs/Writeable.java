package ca.bcit.comp2601.assignment1.monikaszucs;

/**
 * Writable.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Assignment 1
 *
 * @author Monika Szucs
 * @version 1.1
 *
 * @FunctionalInterface an interface
 */
@FunctionalInterface
public interface Writeable {
    public void printData(final String s, final int min, final int max);
}
