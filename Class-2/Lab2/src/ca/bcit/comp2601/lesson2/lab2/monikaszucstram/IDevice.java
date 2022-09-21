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
    private final String purpose;

    /**
     *
     * @param purpose the purpose of the device for why it is used
     */
    IDevice(final String purpose) {
        this.purpose = purpose;
    }

    /**
     *
     * @return the purpose of the device
     */
    public String getPurpose() {
        return purpose;
    };

    public abstract void printDetails();

    @Override
    public String toString() {
        return "IDevice{" +
                "purpose='" + purpose + '\'' +
                '}';
    }
}
