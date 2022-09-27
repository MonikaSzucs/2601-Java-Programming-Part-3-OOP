package ca.bcit.comp2601.lab02.parhammehrgan;

import java.util.Objects;

/**
 * @author Parham Mehrgan
 * @version 1.0
 * @2022–09-23
 */
public class IPad extends IDevice
{
    private final boolean hasCase;
    private String        OSVersion;
    public static final String PURPOSE = "studying";

    /**
     * constructor
     * @param hasCase whether the iPad has a case
     * @param OSVersion operating system version
     */
    public IPad(final boolean hasCase, final String OSVersion)
    {
        super(PURPOSE);
        this.hasCase   = hasCase;
        this.OSVersion = OSVersion;
    }

    /**
     * boolean method to see if iPad has a case
     * @return true if iPad has a case
     */
    public boolean hasCase()
    {
        return hasCase;
    }

    /**
     * getter for the device's operating system version
     * @return the device's operating system version
     */
    public String getOSVersion()
    {
        return OSVersion;
    }

    /**
     * setter for the device's operating system version
     * @param OSVersion the device's operating system version
     */
    public void setOSVersion(final String OSVersion)
    {
        this.OSVersion = OSVersion;
    }

    /**
     * prints the iPad's purpose
     */
    @Override
    void printPurpose()
    {
        System.out.println("the purpose of this iDevice is \"learning\"");
    }

    /**
     * @return a string representation of this iPad and its fields
     */
    @Override
    public String toString()
    {
        return "iPad [" +
                "hasCase=" + hasCase +
                ", OSVersion=" + OSVersion + ", toString()=" + super.toString() +
                ']';
    }

    /**
     * @param o the object to which this iPad is being compared
     * @return true if the iPads have the same operating system version
     */
    @Override
    public boolean equals(final Object o)
    {
        if(this == o) return true;
        if(!(o instanceof IPad)) return false;
        IPad iPad = (IPad) o;
        return OSVersion.equals(iPad.OSVersion);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(OSVersion);
    }
}
