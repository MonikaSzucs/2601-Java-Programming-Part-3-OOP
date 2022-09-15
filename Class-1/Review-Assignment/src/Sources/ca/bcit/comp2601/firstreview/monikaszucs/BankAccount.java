package ca.bcit.comp2601.firstreview.monikaszucs;

/**
 * BankAccount.java
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * First Review
 *
 * @author Monika Szucs
 * @author Tian Lan
 *
 * @version 1.0
 *
 * Creating the BankAccount
 */
public class BankAccount {
    private double          amountUsd;
    private int             pinToMatch;
    private final String    client;
    private final String    accountNumber;
    private Date            accountOpened;
    private Date            accountClosed;

    private static final Integer ACCOUNT_NUMBER_LENGTH = 7;

    /**
     * The BankAccount constructor
     *
     * @param amountUsd the mount of money is USD dollars (double)
     * @param pinToMatch the pin number for the account (integer)
     * @param client the clients id (String)
     * @param accountNumber the account number (String)
     * @param accountOpened when the account was opened (Date Class)
     * @param accountClosed when the account was closed (Date Closed)
     * @throws IllegalArgumentException if the account number does not meet the minimum length requirement
     */
    BankAccount(final double amountUsd, final int pinToMatch, final String client, final String accountNumber,
                final Date accountOpened, final Date accountClosed) {
        setAmountUsd(amountUsd);
        setPinToMatch(pinToMatch);
        setAccountOpened(accountOpened);
        setAccountClosed(accountClosed);
        this.client = client;

        if(accountNumber.length() == ACCOUNT_NUMBER_LENGTH) {
            this.accountNumber = accountNumber;
        } else {
            throw new IllegalArgumentException("The client account");
        }
    }

    /**
     * The setter for the amout in US dollars (Double)
     *
     * @param amountUsd the amount in US dollars (Double)
     */
    public void setAmountUsd(final double amountUsd) {
        this.amountUsd = amountUsd;
    }

    /**
     * The setter to match the pin
     *
     * @param pinToMatch pin for the account (integer)
     */
    public void setPinToMatch(final int pinToMatch) {
        this.pinToMatch = pinToMatch;
    }

    /**
     *The setter for the account opened
     *
     * @param accountOpened when the account was opened in Date Class
     * @throws IllegalArgumentException if the date the account was opened is null
     */
    public void setAccountOpened(Date accountOpened) {
        if(accountOpened != null) {
            this.accountOpened = accountOpened;
        } else {
            throw new IllegalArgumentException("The account opened date cannot be null");
        }
    }

    /**
     * The setter for the account closed
     *
     * @param accountClosed when the account closed in Date value
     */
    public void setAccountClosed(Date accountClosed) {
        this.accountClosed = accountClosed;
    }

    /**
     * The getter amount in USD
     *
     * @return the amount of US dollars in double format
     */
    public double getAmountUsd() {
        return amountUsd;
    }

    /**
     * The getter pin for the account
     *
     * @return the pin number of the account in Integer value
     */
    public int getPinToMatch() {
        return pinToMatch;
    }

    /**
     * The getter client name
     *
     * @return the client name in string format
     */
    public String getClient() {
        return client;
    }

    /**
     * The getter for the account number
     *
     * @return the account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * The getter for when the account was opened
     *
     * @return the Date class for when the account was opened
     */
    public Date getAccountOpened() {
        return accountOpened;
    }

    /**
     * the getter for when the account is closed
     *
     * @return when the account is closed in Date Class format
     */
    public Date getAccountClosed() {
        return accountClosed;
    }

    /**
     * Depositing cash (double)
     *
     * @param depositing the amount that is deposited into the persons account
     * @return the amount that is now in the account
     */
    public double deposit(final double depositing) {
        return amountUsd + depositing;
    }

    /**
     * The amount being withdrawn from the account (double)
     *
     * @param withdrew the amount that has been withdrew
     * @return the amount left within the account after withdrawing money
     */
    public double withdraw(final double withdrew) {
        return amountUsd - withdrew;
    }

    /**
     * The amount of money to withdraw if the pin number entered matches correctly
     *
     * @param withdrew the amount withdrew in double format
     * @param pinEntered the pin entered
     * @return the amount left in the bank after the correct pin in entered
     * @throws IllegalArgumentException if the wrong pin is entered
     */
    public double withdraw(final double withdrew, final int pinEntered) {
        if(pinToMatch == pinEntered) {
            return amountUsd - withdrew;
        } else {
            throw new IllegalArgumentException("Wrong pin entered");
        }
    }
}
