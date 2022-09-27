package ca.bcit.comp2601.lab02.parhammehrgan;

/**
 * @author Parham Mehrgan
 * @version 1.0
 * @2022–09-23
 */
abstract class IDevice
{
    private final String purpose;

    /**
     * constructor
     * @param purpose the purpose of the iDevice (e.g. music)
     */
    IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * abstract method for printing all the child classes' instance variables
     */
    abstract void printPurpose();

    /**
     * @return a string representation of this iDevice and its field
     */
    @Override
    public String toString()
    {
        return "iDevice [" +
                "Purpose='" + purpose + '\'' +
                ']';
    }
}
