package ca.bcit.comp2601.lesson2.lab2.monikaszucstram;

/**
 * IDevice.java
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
abstract class IDevice {
    private String purpose;

    /**
     *
     * @param purpose the purpose of the device for why it is used
     */
    IDevice(final String purpose) {
        if(purpose == null) {
            throw new NullPointerException("Purpose can not be null");
        }
        this.purpose = purpose;
    }

    public void setPurpose(final String purpose) {
        this.purpose = purpose;
    }

    /**
     *
     * @return the purpose of the device
     */
    public String getPurpose() {
        return this.purpose;
    };

    /**
     * Printing the details of the classes
     */
    abstract void printDetails();

    /**
     *
     * @return the device and purpose of the devices
     */
    @Override
    public String toString() {
        return "IDevice{" +
                "purpose='" + purpose + '\'' +
                '}';
    }
}
