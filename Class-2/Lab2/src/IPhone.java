import java.util.Objects;

abstract class IPhone extends IDevice {
    private double numberOfMinutesRemainingOnPhonePlan;
    private String carrier;

    private static final String PURPOSE = "talking";

    IPhone(final String purpose, final double numberOfMinutesRemainingOnPhonePlan, final String carrier) {
        super(purpose);
        this.numberOfMinutesRemainingOnPhonePlan = numberOfMinutesRemainingOnPhonePlan;
        this.carrier = carrier;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "purpose=" + PURPOSE +
                "numberOfMinutesRemainingOnPhonePlan=" + numberOfMinutesRemainingOnPhonePlan +
                ", carrier='" + carrier + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }

        if(this == o) { // same address; i.e. same Iphone
            return true;
        }

        if(!(o instanceof IPhone)) {
            return false;
        }

        IPhone iphone = (IPhone)o;

        return (this.numberOfMinutesRemainingOnPhonePlan == iphone.numberOfMinutesRemainingOnPhonePlan);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.getPurpose());
    }
}
