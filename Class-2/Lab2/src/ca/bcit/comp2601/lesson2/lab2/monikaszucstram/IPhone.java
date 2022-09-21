package ca.bcit.comp2601.lesson2.lab2.monikaszucstram;

import java.util.Objects;

abstract class IPhone extends ca.bcit.comp2601.lesson2.lab2.monikaszucstram.IDevice {
    private double numberOfMinutesRemainingOnPhonePlan;
    private String carrier;

    private static final String PURPOSE = "talking";

    IPhone(final String purpose, final double numberOfMinutesRemainingOnPhonePlan, final String carrier) {
        super(purpose);
        this.numberOfMinutesRemainingOnPhonePlan = numberOfMinutesRemainingOnPhonePlan;
        this.carrier = carrier;
    }

    public void setNumberOfMinutesRemainingOnPhonePlan(final double numberOfMinutesRemainingOnPhonePlan) {
        this.numberOfMinutesRemainingOnPhonePlan = numberOfMinutesRemainingOnPhonePlan;
    }

    public void setCarrier(final String carrier) {
        this.carrier = carrier;
    }

    public double getNumberOfMinutesRemainingOnPhonePlan() {
        return numberOfMinutesRemainingOnPhonePlan;
    }

    public String getCarrier() {
        return carrier;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                ", purpose=" + PURPOSE +
                ", numberOfMinutesRemainingOnPhonePlan=" + numberOfMinutesRemainingOnPhonePlan +
                ", carrier='" + carrier + '\'' +
                '}';
    }

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

    @Override
    public int hashCode()
    {
        return Objects.hash(numberOfMinutesRemainingOnPhonePlan);
    }
}
