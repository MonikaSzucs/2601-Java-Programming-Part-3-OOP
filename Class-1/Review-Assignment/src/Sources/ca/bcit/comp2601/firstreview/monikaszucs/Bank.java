package ca.bcit.comp2601.firstreview.monikaszucs;

import java.util.ArrayList;
import java.util.List;

/**
 * Bank.java
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * First Review
 *
 * @author Monika Szucs
 * @author Tian Lan
 *
 * @version 1.0
 *
 * Creating the Bank
 */
class Bank {
    private Person ceo;
    private List<BankAccount> accountReferences;

    private static final Integer MINIMUM_BALANCE = 0;
    private static final Integer ONE_LESS_NUMBER_ACCOUNTS = 1;
    private static final Integer INITIAL_START = 0;

    /**
     * The bank constructor
     *
     * @param ceo the ceo of the bank
     */
    Bank(final Person ceo) {
        this.ceo = ceo;
        accountReferences = new ArrayList<>();
    }

    /**
     * Adding an account to the bank
     *
     * @param newAccountAdding adding a new account member
     * @throws IllegalArgumentException if the account has already been added
     */
    public void addAccount(final BankAccount newAccountAdding) {
        if(newAccountAdding != null) {
            if(accountReferences.contains(newAccountAdding)) {
                throw new IllegalArgumentException("The account is already in the bank collection!");
            } else {
                accountReferences.add(newAccountAdding);
            }
        }
    }

    /**
     * Removing an account from the bank
     *
     * @param accountNumber removing an account based on the account number
     */
    public void removeAccount(final String accountNumber) {
        for(BankAccount bankAccount: accountReferences) {
            if (bankAccount.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                accountReferences.remove(accountNumber);
            }
        }
    }

    /**
     * getting all the accounts in the bank
     *
     * @return an Array containing all the clients joined in the bank
     */
    public BankAccount[] getAllAccounts() {
        int numberOfAccounts = accountReferences.size();
        BankAccount[] allAccounts = new BankAccount[numberOfAccounts - ONE_LESS_NUMBER_ACCOUNTS];

        for(int i = INITIAL_START; i < numberOfAccounts; i++) {
            allAccounts[i] = accountReferences.get(i);
        }
        return allAccounts;
    }

    /**
     * Finding the account that has the most money
     *
     * @return the bank account with the highest balance
     */
    public BankAccount getMaxAccount() {
        double maximumBalance = MINIMUM_BALANCE;
        BankAccount maxAccount = null;

        for(BankAccount bankAccount: accountReferences) {
            if(bankAccount.getAmountUsd() > maximumBalance) {
                maximumBalance = bankAccount.getAmountUsd();
                maxAccount = bankAccount;
            }
        }
        return maxAccount;
    }

    /**
     * The method to get an account based on the client id
     *
     * @param clientId the clients ID for the bank account
     * @return the clients bank account information
     */
    public BankAccount getAccountFor(final int clientId) {
        return accountReferences.get(clientId);
    }

    /**
     * The method to get the CEO
     * @return the Person class who is the ceo
     */
    public Person getCeo() {
        return ceo;
    }
}
