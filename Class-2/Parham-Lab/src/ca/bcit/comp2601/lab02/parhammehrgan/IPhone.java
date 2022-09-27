package ca.bcit.comp2601.lab02.parhammehrgan;

import java.util.Objects;

/**
 * @author Parham Mehrgan
 * @version 1.0
 * @2022–09-23
 */
class IPhone extends IDevice
{
    private double minutesRemaining;
    private String carrierName;
    public static final String PURPOSE = "talking";
    public static final double MINS_REMAINING_EQUALS_THRESHOLD = 10.0;

    /**
     * constructor
     * @param minutesRemaining number of minutes remaining on phone plan
     * @param carrierName name of the phone provider/carrier
     */
    IPhone(final double minutesRemaining, final String carrierName)
    {
        super(PURPOSE);
        this.minutesRemaining = minutesRemaining;
        this.carrierName      = carrierName;
    }

    /**
     * getter for number of minutes remaining in phone plan
     * @return number of minutes remaining in phone plan
     */
    public double getMinutesRemaining()
    {
        return minutesRemaining;
    }

    /**
     * setter for number of minutes remaining in phone plan
     * @param minutesRemaining number of minutes remaining in phone plan
     */
    public void setMinutesRemaining(final double minutesRemaining)
    {
        this.minutesRemaining = minutesRemaining;
    }

    /**
     * getter for the name of phone carrier
     * @return the name of phone carrier
     */
    public String getCarrierName()
    {
        return carrierName;
    }

    /**
     * setter for the name of phone carrier
     * @param carrierName the name of phone carrier
     */
    public void setCarrierName(final String carrierName)
    {
        this.carrierName = carrierName;
    }

    /**
     * prints the phone's purpose
     */
    @Override
    void printPurpose()
    {
        System.out.println("the purpose of this iDevice is \"talking\"");
    }

    /**
     * @return a string representation of this phone and its fields
     */
    @Override
    public String toString()
    {
        return "iPhone [" +
                "minutesRemaining=" + minutesRemaining +
                ", carrierName=" + carrierName + ", toString()=" + super.toString() +
                ']';
    }

    /**
     * @param o the object to which this iPhone is being compared
     * @return true if the iPhones have the same number of minutes remaining (+/- 10 minutes)
     */
    @Override
    public boolean equals(final Object o)
    {
        if(this == o) return true;
        if(!(o instanceof IPhone)) return false;
        IPhone iPhone = (IPhone) o;
        return (Math.abs(this.minutesRemaining - iPhone.minutesRemaining) <= MINS_REMAINING_EQUALS_THRESHOLD);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(minutesRemaining);
    }
}
