package ca.bcit.comp2601.firstreview.monikaszucs;

public class BankAccount {
    private double amountUsd;
    private int pinToMatch;
    private final String client;
    private final String accountNumber;
    private Date accountOpened;
    private Date accountClosed;

    BankAccount(final double amountUsd, final int pinToMatch, final String client, final String accountNumber,
                final Date accountOpened, final Date accountClosed) {
        setAmountUsd(amountUsd);
        setPinToMatch(pinToMatch);
        setAccountOpened(accountOpened);
        setAccountClosed(accountClosed);
        this.client = client;

        if(accountNumber.length() == 7) {
            this.accountNumber = accountNumber;
        } else {
            throw new IllegalArgumentException("The client account");
        }


    }

    public void setAmountUsd(final double amountUsd) {
        this.amountUsd = amountUsd;
    }

    public void setPinToMatch(final int pinToMatch) {
        this.pinToMatch = pinToMatch;
    }

    public void setAccountOpened(Date accountOpened) {
        if(accountOpened != null) {
            this.accountOpened = accountOpened;
        } else {
            throw new IllegalArgumentException("The account opened date cannot be null");
        }

    }

    public void setAccountClosed(Date accountClosed) {
        this.accountClosed = accountClosed;
    }

    public double getAmountUsd() {
        return amountUsd;
    }

    public int getPinToMatch() {
        return pinToMatch;
    }

    public String getClient() {
        return client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Date getAccountOpened() {
        return accountOpened;
    }

    public Date getAccountClosed() {
        return accountClosed;
    }

    public double withdraw(final double withdrew) {
        return amountUsd - withdrew;
    }

    public double withdraw(final double withdrew, final int pinEntered) {
        if(pinToMatch == pinEntered) {
            return amountUsd - withdrew;
        } else {
            throw new IllegalArgumentException("Wrong pin entered");
        }
    }
}
