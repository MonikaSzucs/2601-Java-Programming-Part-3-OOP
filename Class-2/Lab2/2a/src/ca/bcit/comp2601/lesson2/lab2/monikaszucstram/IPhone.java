package ca.bcit.comp2601.lesson2.lab2.monikaszucstram;

import java.util.Objects;

/**
 * IPhone.java
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * Lab 2a and 2b
 *
 * @author Monika Szucs
 * @author Tram
 *
 * @version 1.0
 *
 */
abstract class IPhone extends IDevice {
    private double numberOfMinutesRemainingOnPhonePlan;
    private String carrier;

    private static final String PURPOSE = "talking";

    /**
     * Constructor
     *
     * @param purpose the purpose of using the device
     * @param numberOfMinutesRemainingOnPhonePlan To see how many minutes are left of the phone plan
     * @param carrier to see what carrier the phone is with
     */
    IPhone(final String purpose, final double numberOfMinutesRemainingOnPhonePlan, final String carrier) {
        super(purpose);
        this.numberOfMinutesRemainingOnPhonePlan = numberOfMinutesRemainingOnPhonePlan;
        this.carrier = carrier;
    }

    /**
     * Setter
     *
     * @param numberOfMinutesRemainingOnPhonePlan to set the number of minutes remaining on the phone plan
     */
    public void setNumberOfMinutesRemainingOnPhonePlan(final double numberOfMinutesRemainingOnPhonePlan) {
        this.numberOfMinutesRemainingOnPhonePlan = numberOfMinutesRemainingOnPhonePlan;
    }

    /**
     * Setter
     *
     * @param carrier to set which carrier the phone is with
     */
    public void setCarrier(final String carrier) {
        this.carrier = carrier;
    }

    /**
     * Getter
     *
     * @return to get the number of minutes that is remaining on the phone plan
     */
    public double getNumberOfMinutesRemainingOnPhonePlan() {
        return numberOfMinutesRemainingOnPhonePlan;
    }

    /**
     * Getter
     *
     * @return the carrier that the phone is with
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * toString
     *
     * @return a string of information on the Iphone which is the purpose, number of minutes remianing on the phone
     *          plan and the carrier
     */
    @Override
    public String toString() {
        return "IPhone{" +
                ", purpose=" + PURPOSE +
                ", numberOfMinutesRemainingOnPhonePlan=" + numberOfMinutesRemainingOnPhonePlan +
                ", carrier='" + carrier + '\'' +
                '}';
    }

    /**
     * Equals
     *
     * @param o grabbing the object
     * @return true if the objectand the iphone we are comparing it to matches but false if they are different
     */
    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }

        if(this == o) {
            return true;
        }

        if(!(o instanceof IPhone)) {
            return false;
        }

        IPhone iphone = (IPhone)o;
        double difference;
        difference = this.numberOfMinutesRemainingOnPhonePlan - iphone.numberOfMinutesRemainingOnPhonePlan;

        if(difference > 10.0 || difference < -10.0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * hashCode
     *
     * @return to check the hasCodes match based on the number of minutes remaining on the phone plan
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(numberOfMinutesRemainingOnPhonePlan);
    }
}
