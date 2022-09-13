package ca.bcit.comp2601.firstreview.monikaszucs;

public class BankAccount {
    private final double amountUsd;
    private final int pinToMatch;
    private final String client;
    private final String accountNumber;
    private Date accountOpened;
    private Date accountClosed;

    BankAccount(final double amountUsd, final int pinToMatch, final String client, final String accountNumber, final Date accountOpened, final Date accountClosed) {
        this.amountUsd = amountUsd;
        this.pinToMatch = pinToMatch;
        this.client = client;
        this.accountNumber = accountNumber;
        this.accountOpened = accountOpened;
        this.accountClosed = accountClosed;
    }

    public double withdraw(final double amountUsd) {
        return amountUsd;
    }

    public double withdraw(final double amountUsd, final int pinToMatch) {
        return amountUsd + pinToMatch;
    }
}
