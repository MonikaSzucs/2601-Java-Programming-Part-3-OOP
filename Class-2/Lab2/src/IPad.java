import java.util.Objects;

abstract class IPad extends IDevice {
    private int numberOfSongsStored;
    private double maximumVolumeInDecibels;

    private static final String PURPOSE = "learning";

    IPad(final String purpose, final int numberOfSongsStored, final double maximumVolumeInDecibels) {
        super(purpose);
        this.numberOfSongsStored = numberOfSongsStored;
        this.maximumVolumeInDecibels = maximumVolumeInDecibels;
    }

    @Override
    public String toString() {
        return "IPad{" +
                "purpose=" + PURPOSE +
                "numberOfSongsStored=" + numberOfSongsStored +
                ", maximumVolumeInDecibels=" + maximumVolumeInDecibels +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }

        if(!(o instanceof IDevice)) {
            return false;
        }

        IPad ipad = (IPad)o;
        return (this.numberOfSongsStored == numberOfSongsStored);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.getPurpose());
    }
}
