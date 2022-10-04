package ca.bc.bcit.comp2601.lab3.monikaszucsdavood;

import java.util.Objects;

/**
 * HockeyPlayer.java
 *
 * A Hockey Player Class
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * Lab 3
 * @author Monika Szucs
 * @author Davood Tabrizi
 *
 * @version 1.1
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {
    private final String dressCode;
    private boolean paidSalary;
    private final boolean educationRequired;
    private final String workVerb;

    private int numberOfGoals;

    private static final String DRESS_CODE = "jersey";
    private static final String WORK_VERB = "play";
    private static final double OVERTIME_PAY_RATE = 0.0;
    private static final Integer POSITIVE_NUMBER = +120;
    private static final Integer NEGATIVE_NUMBER = -120;
    private static final Integer HASHCODE_RETURN = 0;

    /**
     * @param name the name of the person
     * @param goalNumber the number of goals the individual scored
     */
    HockeyPlayer(final String name, final int goalNumber) {
        super(name);
        this.dressCode = DRESS_CODE;
        this.paidSalary = true;
        this.educationRequired = false;
        this.workVerb = WORK_VERB;
        this.numberOfGoals = goalNumber;
    }

    /**
     * @return the name of the person from the employee class
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * @return the number of goals the hockey player made
     */
    public int getGoals() {
        return numberOfGoals;
    }

    /**
     * @return the dress code of the player
     */
    @Override
    public String getDressCode() {
        return DRESS_CODE;
    }

    /**
     * @return if the player has a paid salary or not
     */
    @Override
    public boolean isPaidSalary() {
        return paidSalary;
    }

    /**
     * @return if the player needs an education or not
     */
    @Override
    public boolean postSecondaryEducationRequired() {
        return educationRequired;
    }

    /**
     * @return the work verb of the hockey player
     */
    @Override
    public String getWorkVerb() {
        return WORK_VERB;
    }

    /**
     * @return the over time pay rate
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    /**
     * @param hockeyPlayer the hockey player Class
     * @return the order of the hockey player based on the number of goals
     */
    @Override
    public int compareTo(final HockeyPlayer hockeyPlayer) {
        if(numberOfGoals < hockeyPlayer.getGoals()) {
            return POSITIVE_NUMBER;
        } else {
            return NEGATIVE_NUMBER;
        }
    }

    /**
     * @return the string containing the hockey players information
     */
    @Override
    public String toString() {
        return "HockeyPlayer{" +
                "firstName='" + super.getName() + '\'' +
                ", dressCode=" + DRESS_CODE +
                ", paidSalary=" + paidSalary +
                ", educationRequired=" + educationRequired +
                ", workVerb=" + workVerb +
                ", numberOfGoals=" + numberOfGoals +
                '}' + "\n";
    }

    /**
     * @param o is the value of the Object
     * @return if the number of goals matches the objects number of goals
     */
    @Override
    public boolean equals(final Object o) {
        if(this == o) return true;
        if(!(o instanceof HockeyPlayer)) return false;
        HockeyPlayer hockeyPlayer = (HockeyPlayer) o;
        return numberOfGoals == hockeyPlayer.numberOfGoals;
    }

    /**
     * @return the value of 0
     */
    @Override
    public int hashCode() {
        return HASHCODE_RETURN;
    }
}
