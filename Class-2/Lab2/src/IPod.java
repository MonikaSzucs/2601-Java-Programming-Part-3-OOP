import java.sql.PseudoColumnUsage;
import java.util.Objects;

abstract class IPod extends IDevice {
    private boolean hasACase;
    private String operatingSystemVersion;

    private static final String PURPOSE = "music";

    IPod(final String purpose, final boolean hasACase, final String operatingSystemVersion) {
        super(purpose);
        this.hasACase = hasACase;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public void setHasACase(boolean hasACase) {
        this.hasACase = hasACase;
    }

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public boolean isHasACase() {
        return hasACase;
    }

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    @Override
    public String toString() {
        return "IPod{" +
                "purpose=" + PURPOSE +
                "hasACase=" + hasACase +
                ", operatingSystemVersion='" + operatingSystemVersion + '\'' +
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

        IPod ipad = (IPod) o;
        return (this.operatingSystemVersion == operatingSystemVersion);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.getPurpose());
    }
}
