abstract class IDevice {
    private final String purpose;

    IDevice(final String purpose) {
        this.purpose = purpose;
    }

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
