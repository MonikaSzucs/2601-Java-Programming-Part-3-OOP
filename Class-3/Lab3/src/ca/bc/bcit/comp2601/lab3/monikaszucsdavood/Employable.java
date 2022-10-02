package ca.bc.bcit.comp2601.lab3.monikaszucsdavood;

/**
 * Employable.java
 *
 * A Interface for Employable
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * Lab 3
 * @author Monika Szucs
 * @author Davood Tabrizi
 *
 * @version 1.1
 */
public interface Employable {

    abstract String getDressCode();

    abstract boolean isPaidSalary();

    abstract boolean postSecondaryEducationRequired();

    abstract String getWorkVerb();

    abstract double getOverTimePayRate();

    // default means not abstract

    /**
     *
     * @return true if employable gets paid
     */
    default public boolean getsPaid() {
        return true;
    }


}
