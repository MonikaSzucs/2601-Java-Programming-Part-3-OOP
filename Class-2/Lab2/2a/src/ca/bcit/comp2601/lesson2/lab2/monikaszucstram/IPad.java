package ca.bcit.comp2601.lesson2.lab2.monikaszucstram;

import java.util.Objects;

/**
 * IPad.java
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
abstract class IPad extends IDevice {
    private boolean hasCase;
    private String operatingSystemVersion;

    private static final String PURPOSE = "learning";

    /**
     * Constructor
     *
     * @param purpose the purpose of the device for what it is used for
     * @param hasCase checks to see if the IPad has a case or not
     * @param operatingSystemVersion Checks to see what operating system version the device has
     */
    IPad(final String purpose, final boolean hasCase, final String operatingSystemVersion) {
        super(purpose);
        this.hasCase = hasCase;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * Setter
     *
     * @param hasCase sets the case value if it has a case or not
     */
    public void setHasCase(final boolean hasCase) {
        this.hasCase = hasCase;
    }

    /**
     * Setter
     *
     * @param operatingSystemVersion Sets the operating system of the device
     */
    public void setOperatingSystemVersion(final String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * Getter
     *
     * @return get the information to see if the Ipad has a case or not
     */
    public boolean isHasCase() {
        return hasCase;
    }

    /**
     * Getter
     *
     * @return gets the operating system version of the device
     */
    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    /**
     * To String
     *
     * @return the purpose of the device, if it has a case or not and what operating system version it uses
     */
    @Override
    public String toString() {
        return "IPad{" +
                "purpose=" + PURPOSE +
                ", hasCase=" + hasCase +
                ", operatingSystemVersion=" + operatingSystemVersion +
                '}';
    }

    /**
     * Checks to see if the IPad is really an ipad
     *
     * @param o grabs the object IPad
     * @return will return true if the device is really an ipad or false if it is not
     */
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

    /**
     * Hash
     *
     * @return Checking the operating system version from the equals method and we must check the hashcode here
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(operatingSystemVersion);
    }
}
