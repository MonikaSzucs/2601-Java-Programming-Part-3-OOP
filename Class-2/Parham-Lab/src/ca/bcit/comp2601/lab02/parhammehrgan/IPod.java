package ca.bcit.comp2601.lab02.parhammehrgan;

import java.util.Objects;

/**
 * @author Parham Mehrgan
 * @version 1.0
 * @2022–09-23
 */
public class IPod extends IDevice
{
    private final int    numberOfSongsStored;
    private final double maxVolumeInDecibels;
    public static final String PURPOSE = "listening";

    /**
     * constructor
     * @param numberOfSongsStored number of songs stored on the iPod
     * @param maxVolumeInDecibels maximum playback volume in decibels
     */
    public IPod(final int numberOfSongsStored, final double maxVolumeInDecibels)
    {
        super(PURPOSE);
        this.numberOfSongsStored = numberOfSongsStored;
        this.maxVolumeInDecibels = maxVolumeInDecibels;
    }

    /**
     * getter for number of songs stored
     * @return number of songs stored
     */
    public int getNumberOfSongsStored()
    {
        return numberOfSongsStored;
    }

    /**
     * getter for maximum volume in decibels
     * @return maximum volume in decibels
     */
    public double getMaxVolumeInDecibels()
    {
        return maxVolumeInDecibels;
    }

    /**
     * prints the iPod's purpose
     */
    @Override
    void printPurpose()
    {
        System.out.println("the purpose of this iDevice is \"music\"");
    }

    /**
     * @return a string representation of this iPod and its fields
     */
    @Override
    public String toString()
    {
        return "iPod [" +
                "numberOfSongsStored=" + numberOfSongsStored +
                ", maxVolumeInDecibels=" + maxVolumeInDecibels + ", toString()=" + super.toString() +
                ']';
    }

    /**
     * @param o the object to which this iPod is being compared
     * @return true if the iPods have the same number of songs stored
     */
    @Override
    public boolean equals(final Object o)
    {
        if(this == o) return true;
        if(!(o instanceof IPod)) return false;
        IPod iPod = (IPod) o;
        return numberOfSongsStored == iPod.numberOfSongsStored;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(numberOfSongsStored);
    }
}
