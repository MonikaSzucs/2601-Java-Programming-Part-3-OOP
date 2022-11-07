class Customer {
    private String firstName;
    private String lastName;
    private String passcode;

    private static final String defaultFirstName;
    private static final String defaultLastName;
    private static final String defaultPasscode;

    static {
        defaultFirstName = "No first name";
        defaultLastName = "no last name";
        defaultPasscode = "no passcode";
    }

    Customer() {
        this.firstName = defaultFirstName;
        this.lastName = defaultLastName;
        this.passcode = defaultPasscode;
    }

    Customer(final String firstName, final String lastName, final String passcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passcode = passcode;
    }

    public Account getAccount(final String clientId) {
//        for(BankAccount bankAccount: accountReferences) {
//            if (bankAccount.getAccountNumber().equalsIgnoreCase(accountNumber)) {
//                accountReferences.remove(accountNumber);
//            }
//        }
        return new Account();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setAccount(final Account account) {
        //
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setPasscode(final String passcode) {
        this.passcode = passcode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passcode='" + passcode + '\'' +
                '}';
    }
}
