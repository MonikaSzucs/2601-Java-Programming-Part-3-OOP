package ca.bc.bcit.comp2601.lab3.monikaszucsdavood;

import java.util.Objects;

/**
 * GasStationAttendant.java
 *
 * A Gas Station Attendant Class
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * Lab 3
 * @author Monika Szucs
 * @author Davood Tabrizi
 *
 * @version 1.1
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {
    private int numberOfDollarsStolenPerDay;

    private static final String DRESS_CODE = "uniform";
    private static final Boolean PAID_SALARY = false;
    private static final Boolean EDUCATION_REQUIRED = false;
    private static final String WORK_VERB = "pump";
    private static final double OVERTIME_PAY_RATE = 1.5;
    private static final Integer POSITIVE_NUMBER = +120;
    private static final Integer NEGATIVE_NUMBER = -120;
    private static final Integer HASHCODE_RETURN = 0;

    /**
     * @param firstName the first name of the gas station attendant
     * @param numberOfDollarsStolenPerDay the number of dollars stolen per day in Canadian Dollars
     */
    GasStationAttendant(final String firstName, final int numberOfDollarsStolenPerDay) {
        super(firstName);
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    /**
     * @return the name of the gas station attendant
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * @return the dress code of the gas station attendant
     */
    @Override
    public String getDressCode() {
        return DRESS_CODE;
    }

    /**
     * @return the over time pay rate
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    /**
     * @return if the gas station attendant has a paid salary or not
     */
    @Override
    public boolean isPaidSalary() {
        return PAID_SALARY;
    }

    /**
     * @return if an education is required
     */
    @Override
    public boolean requiresPostSecondaryEducation() {
        return EDUCATION_REQUIRED;
    }

    /**
     * @return what the work verb is
     */
    @Override
    public String getWorkVerb() {
        return WORK_VERB;
    }

    /**
     * @return the number of dollars stolen per day in Canadian dollars
     */
    public int getNumberOfDollarsStolenPerDay() {
        return numberOfDollarsStolenPerDay;
    }

    /**
     * @param gasStationAttendant the gas station attendant Object
     * @return the order of the gas station attendant based on the number of dollars stolen per day
     */
    @Override
    public int compareTo(final GasStationAttendant gasStationAttendant) {
        if(numberOfDollarsStolenPerDay < gasStationAttendant.getNumberOfDollarsStolenPerDay()) {
            return POSITIVE_NUMBER;
        } else {
            return NEGATIVE_NUMBER;
        }
    }

    /**
     * @return the string containing the information on the gas station attendant
     */
    @Override
    public String toString() {
        return "GasStationAttendant{" +
                "firstName='" + super.getName() + '\'' +
                ", dressCode=" + DRESS_CODE +
                ", paidSalary=" + PAID_SALARY +
                ", educationRequired=" + EDUCATION_REQUIRED +
                ", workVerb=" + WORK_VERB +
                ", numberOfDollarsStolenPerDay=" + numberOfDollarsStolenPerDay +
                '}' + "\n";
    }

    /**
     * @param o is the value of the Object
     * @return if the numbers of dollars stolen per day is equivalent to the Objects dollars stolen per day
     */
    @Override
    public boolean equals(final Object o) {
        if(this == o) return true;
        if(!(o instanceof GasStationAttendant)) return false;
        GasStationAttendant gasStationAttendant = (GasStationAttendant) o;
        return numberOfDollarsStolenPerDay == gasStationAttendant.numberOfDollarsStolenPerDay;
    }

    /**
     * @return the value of 0;
     */
    @Override
    public int hashCode() {
        return HASHCODE_RETURN;
    }
}
