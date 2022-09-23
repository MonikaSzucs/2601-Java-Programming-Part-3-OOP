package ca.bcit.comp2601.lesson2.lab2.monikaszucstram;

import java.util.Objects;

/**
 * IPod.java
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
abstract class IPod extends IDevice {
    private int numberOfSongsStored;
    private double maximumVolumeInDecibels;

    private static final String PURPOSE = "music";

    /**
     * Constructor
     *
     * @param purpose the purpose of the device for its usage
     * @param numberOfSongsStored the number of songs that will be stored
     * @param maximumVolumeInDecibels the maximum volume in decibels
     */
    IPod(final String purpose, final int numberOfSongsStored, final double maximumVolumeInDecibels) {
        super(PURPOSE);
        this.numberOfSongsStored = numberOfSongsStored;
        this.maximumVolumeInDecibels = maximumVolumeInDecibels;
    }

    /**
     * Setter
     *
     * @param numberOfSongsStored the number of songs stored in the IPod
     */
    public void setNumberOfSongsStored(final int numberOfSongsStored) {
        this.numberOfSongsStored = numberOfSongsStored;
    }

    /**
     * Setter
     *
     * @param maximumVolumeInDecibels the maximum volume in decibels
     */
    public void setMaximumVolumeInDecibels(final double maximumVolumeInDecibels) {
        this.maximumVolumeInDecibels = maximumVolumeInDecibels;
    }

    /**
     * Getter
     *
     * @return the number of songs stored
     */
    public int getNumberOfSongsStored() {
        return numberOfSongsStored;
    }

    /**
     * Getter
     *
     * @return the maximum volume in decibels
     */
    public double getMaximumVolumeInDecibels() {
        return maximumVolumeInDecibels;
    }

    /**
     * Equals
     *
     * @param o the object of the device
     * @return if the object is really an IPod then it will return true. Otherwise false.
     */
    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }

        if(this == o) return true;

        if(!(o instanceof IPod)) {
            return false;
        }

        IPod ipod = (IPod) o;
        return (this.numberOfSongsStored == ipod.numberOfSongsStored);
    }

    /**
     * hashCode
     *
     * @return the hashCode based on the number of songs stored
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(numberOfSongsStored);
    }

    @Override
    public String getPurpose() {
        return  "The purpose of this " + getClass() + " is '" + PURPOSE + "'";
    }

    /**
     * toString
     *
     * @return the information about the IPod which will contain the purpose, number of songs stored, and maximum
     *          volume in decibels
     */
    @Override
    public String toString() {
        return  super.toString() +
                "IPod{" +
                " numberOfSongsStored=" + numberOfSongsStored +
                ", maximumVolumeInDecibels='" + maximumVolumeInDecibels + '\'' +
                '}';
    }
}
