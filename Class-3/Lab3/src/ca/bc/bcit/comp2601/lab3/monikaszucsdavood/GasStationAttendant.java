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
    private final String dressCode;
    private boolean paidSalary;
    private final boolean educationRequired;
    private final String workVerb;

    private int numberOfDollarsStolenPerDay;

    private static final String DRESS_CODE = "uniform";
    private static final String WORK_VERB = "pump";
    private static final double OVERTIME_PAY_RATE = 1.5;

    /**
     * Constructor
     *
     * @param firstName the first name of the gas station attendant
     * @param numberOfDollarsStolenPerDay the number of dollars stolen per day in Canadian Dollars
     */
    GasStationAttendant(final String firstName, final int numberOfDollarsStolenPerDay) {
        super(firstName);
        this.dressCode = DRESS_CODE;
        this.paidSalary = false;
        this.educationRequired = false;
        this.workVerb = WORK_VERB;
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    /**
     * The Getter
     *
     * @return the name of the gas station attendant
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * The Getter
     * @return the dress code of the gas station attendant
     */
    @Override
    public String getDressCode() {
        return DRESS_CODE;
    }

    /**
     * The Getter
     *
     * @return if the gas station attendant has a paid salary or not
     */
    @Override
    public boolean isPaidSalary() {
        return paidSalary;
    }

    /**
     * The Getter
     *
     * @return if an education is required
     */
    @Override
    public boolean postSecondaryEducationRequired() {
        return educationRequired;
    }

    /**
     * The Getter
     *
     * @return what the work verb is
     */
    @Override
    public String getWorkVerb() {
        return WORK_VERB;
    }

    /**
     * The Getter
     *
     * @return the number of dollars stolen per day in Canadian dollars
     */
    public int getNumberOfDollarsStolenPerDay() {
        return numberOfDollarsStolenPerDay;
    }

    /**
     * The Compare To Method
     *
     * @param gasStationAttendant the gas station attendant Object
     * @return the order of the gas station attendant based on the number of dollars stolen per day
     */
    @Override
    public int compareTo(final GasStationAttendant gasStationAttendant) {
        if(numberOfDollarsStolenPerDay < gasStationAttendant.getNumberOfDollarsStolenPerDay()) {
            return +120;
        } else {
            return -120;
        }
    }

    /**
     * To String Method
     *
     * @return the string containing the information on the gas station attendant
     */
    @Override
    public String toString() {
        return "GasStationAttendant{" +
                "firstName='" + super.getName() + '\'' +
                ", dressCode=" + DRESS_CODE +
                ", paidSalary=" + paidSalary +
                ", educationRequired=" + educationRequired +
                ", workVerb=" + workVerb +
                ", numberOfDollarsStolenPerDay=" + numberOfDollarsStolenPerDay +
                '}' + "\n";
    }

    /**
     * Equals Method
     *
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
     * The hashCode Method
     *
     * @return the value of 0;
     */
    @Override
    public int hashCode() {
        return 0;
    }

}
