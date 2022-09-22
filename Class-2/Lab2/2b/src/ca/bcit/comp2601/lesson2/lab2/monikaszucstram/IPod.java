package ca.bcit.comp2601.lesson2.lab2.monikaszucstram;

import java.sql.PseudoColumnUsage;
import java.util.Objects;

abstract class IPod extends ca.bcit.comp2601.lesson2.lab2.monikaszucstram.IDevice {
    private int numberOfSongsStored;
    private double maximumVolumeInDecibels;

    private static final String PURPOSE = "music";

    IPod(final String purpose, final int numberOfSongsStored, final double maximumVolumeInDecibels) {
        super(purpose);
        this.numberOfSongsStored = numberOfSongsStored;
        this.maximumVolumeInDecibels = maximumVolumeInDecibels;
    }

    public void setNumberOfSongsStored(final int numberOfSongsStored) {
        this.numberOfSongsStored = numberOfSongsStored;
    }

    public void setMaximumVolumeInDecibels(final double maximumVolumeInDecibels) {
        this.maximumVolumeInDecibels = maximumVolumeInDecibels;
    }

    public int getNumberOfSongsStored() {
        return numberOfSongsStored;
    }

    public double getMaximumVolumeInDecibels() {
        return maximumVolumeInDecibels;
    }

    @Override
    public String toString() {
        return "IPod{" +
                "purpose=" + PURPOSE +
                ", numberOfSongsStored=" + numberOfSongsStored +
                ", maximumVolumeInDecibels='" + maximumVolumeInDecibels + '\'' +
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

        if(!(o instanceof IPod)) {
            return false;
        }

        IPod ipod = (IPod) o;
        return (this.numberOfSongsStored == ipod.numberOfSongsStored);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(numberOfSongsStored);
    }
}
