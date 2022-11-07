class Account {
    private String accountNumber;
    private double balance;

    private static final String defaultAccountNumber;
    private static final double defaultBalance;

    static {
        defaultAccountNumber    = "111111";
        defaultBalance          = 0.00;
    }

    Account() {
        this.accountNumber = defaultAccountNumber;
        this.balance = defaultBalance;
    }

    Account(final String accountNumber, final double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addToBalance(final double amount) {

    }

    public String getAccountNumber() {
        return "";
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return true;
    }

    public void setActive(final boolean active) {

    }

    public void setBalance(final double balance) {

    }

    public void subtractFromBalance(final double amount) {

    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
