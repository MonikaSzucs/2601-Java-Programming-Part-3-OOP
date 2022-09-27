package ca.bcit.comp2601.lab02.parhammehrgan;

import java.util.Objects;

/**
 * @author Parham Mehrgan
 * @version 1.0
 * @2022–09-23
 */
public class IPhoneSeven extends IPhone
{
    private final boolean highResCamera;
    private final int     memoryGigaBytes;

    /**
     * constructor
     * @param minutesRemaining number of minutes remaining on phone plan
     * @param carrierName name of the phone provider/carrier
     * @param highResCamera whether the device has a high-resolution camera
     * @param memoryGigaBytes amount of device memory in gigabytes
     */
    IPhoneSeven(final double minutesRemaining, final String carrierName, final boolean highResCamera,
                       final int memoryGigaBytes)
    {
        super(minutesRemaining, carrierName);
        this.highResCamera   = highResCamera;
        this.memoryGigaBytes = memoryGigaBytes;
    }

    /**
     * boolean method to determine if there is a high-resolution camera present
     * @return true if there is a high-resolution camera present
     */
    public boolean hasHighResCamera()
    {
        return highResCamera;
    }

    /**
     * getter for the amount of memory the device has (in gigabytes)
     * @return the amount of memory the device has (in gigabytes)
     */
    public int getMemoryGigaBytes()
    {
        return memoryGigaBytes;
    }

    /**
     * @return a string representation of this phone and its fields
     */
    @Override
    public String toString()
    {
        return "iPhoneSeven [" +
                "highResCamera=" + highResCamera +
                ", memoryGigaBytes=" + memoryGigaBytes + ", toString()=" + super.toString() +
                ']';
    }

    /**
     * @param o the object to which this iPhone is being compared
     * @return true if the iPhones have high-resolution cameras and the same number of minutes remaining
     */
    @Override
    public boolean equals(final Object o)
    {
        if(this == o) return true;
        if(!(o instanceof IPhoneSeven)) return false;
        IPhoneSeven that = (IPhoneSeven) o;
        return highResCamera == that.highResCamera;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), highResCamera);
    }
}
