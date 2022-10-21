package ca.bc.bcit.comp2601.lab3.monikaszucsdavood;
// reverse domain name for package

/**
 * Employable.java
 *
 * A Interface for Employable
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Lab 3
 * @author Monika Szucs
 * @author Davood Tabrizi
 *
 * @version 1.1
 */
public interface Employable {

    // use verbs
    String getDressCode();
    boolean isPaidSalary();
    boolean requiresPostSecondaryEducation();
    String getWorkVerb();
    double getOverTimePayRate();

    // default means not abstract

    /**
     * @return true if employable gets paid
     */
    default public boolean getsPaid() {
        return true;
    }
}
