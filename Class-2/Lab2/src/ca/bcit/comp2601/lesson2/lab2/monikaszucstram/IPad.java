package ca.bcit.comp2601.lesson2.lab2.monikaszucstram;

import java.util.Objects;

abstract class IPad extends ca.bcit.comp2601.lesson2.lab2.monikaszucstram.IDevice {
    private boolean hasCase;
    private String operatingSystemVersion;

    private static final String PURPOSE = "learning";

    IPad(final String purpose, final boolean hasCase, final String operatingSystemVersion) {
        super(purpose);
        this.hasCase = hasCase;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public void setHasCase(final boolean hasCase) {
        this.hasCase = hasCase;
    }

    public void setOperatingSystemVersion(final String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public boolean isHasCase() {
        return hasCase;
    }

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    @Override
    public String toString() {
        return "IPad{" +
                "purpose=" + PURPOSE +
                ", hasCase=" + hasCase +
                ", operatingSystemVersion=" + operatingSystemVersion +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }

        if(this == o) { // same address; i.e. same IPad
            return true;
        }

        if(!(o instanceof IPad)) {
            return false;
        }

        IPad ipad = (IPad)o;
        return (this.operatingSystemVersion == operatingSystemVersion);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(operatingSystemVersion);
    }
}
