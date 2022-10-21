package ca.bc.bcit.comp2601.lab3.monikaszucsdavood;

import java.util.Objects;

/**
 * Parent.java
 *
 * A Parent Class
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * Lab 3
 * @author Monika Szucs
 * @author Davood Tabrizi
 *
 * @version 1.1
 */
public class Parent extends Employee implements Comparable<Parent> {
    private int numberOfHoursSpentPerWeekWithKids;

    private static final int        MIN_NUMBER_OF_HOURS_SPENT_PER_WEEK_WITH_KIDS    = 0;
    private static final String     DRESS_CODE                                      = "anything";
    private static final boolean    PAID_SALARY                                     = false;
    private static final boolean    EDUCATION_REQUIRED                              = false;
    private static final String     WORK_VERB                                       = "care";
    private static final double     OVERTIME_PAY_RATE                               = -2.0;
    private static final int        POSITIVE_NUMBER                                 = +120;
    private static final int        NEGATIVE_NUMBER                                 = -120;
    private static final int        HASHCODE_RETURN                                 = 0;

    /**
     * @param name the name of the parent
     * @param numberOfHoursSpentPerWeekWithKids the number of hours the parent spends with the kids
     */
    Parent(final String name, final int numberOfHoursSpentPerWeekWithKids) {
        super(name);
        if(numberOfHoursSpentPerWeekWithKids < MIN_NUMBER_OF_HOURS_SPENT_PER_WEEK_WITH_KIDS) {
            throw new IllegalArgumentException("Invalid number of hours spent with kids");
        }
        this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
    }

    /**
     * @return the name of the parent
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * @return the dress code of the parent
     */
    @Override
    public String getDressCode() {
        return DRESS_CODE;
    }

    /**
     * @return if the salary is paid or not
     */
    @Override
    public boolean isPaidSalary() {
        return PAID_SALARY;
    }

    /**
     * @return the over time pay rate
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    /**
     * @return the educational requirement to be a parent
     */
    @Override
    public boolean requiresPostSecondaryEducation() {
        return EDUCATION_REQUIRED;
    }

    /**
     * @return the work verb of the parent
     */
    @Override
    public String getWorkVerb() {
        return WORK_VERB;
    }

    /**
     * @return the number of hours that the parent spends with the kids
     */
    public int getNumberOfHoursSpentPerWeekWithKids() {
        return numberOfHoursSpentPerWeekWithKids;
    }

    /**
     * @param parent the Object parent
     * @return the order ranking based on the number of hours spent per week with the kids
     */
    @Override
    public int compareTo(final Parent parent) {
        if(numberOfHoursSpentPerWeekWithKids < parent.getNumberOfHoursSpentPerWeekWithKids()) {
            return POSITIVE_NUMBER;
        } else {
            return NEGATIVE_NUMBER;
        }
    }

    /**
     * @return a string about the parent
     */
    @Override
    public String toString() {
        return "Parent{" +
                "firstName='" + super.getName() + '\'' +
                ", dressCode=" + DRESS_CODE +
                ", paidSalary=" + PAID_SALARY +
                ", educationRequired=" + EDUCATION_REQUIRED +
                ", workVerb=" + WORK_VERB +
                ", numberOfHoursSpentPerWeekWithKids=" + numberOfHoursSpentPerWeekWithKids +
                '}' + "\n";
    }

    /**
     * @param o is the value of the Object
     * @return if the number of hours spent with the kids is equals to the Objects hours spent with kids
     */
    @Override
    public boolean equals(final Object o) {
        if(this == o) return true;
        if(!(o instanceof Parent)) return false;
        Parent parent = (Parent) o;
        return numberOfHoursSpentPerWeekWithKids == parent.numberOfHoursSpentPerWeekWithKids;
    }

    /**
     * @return the value of 0
     */
    @Override
    public int hashCode() {
        return HASHCODE_RETURN;
    }
}
