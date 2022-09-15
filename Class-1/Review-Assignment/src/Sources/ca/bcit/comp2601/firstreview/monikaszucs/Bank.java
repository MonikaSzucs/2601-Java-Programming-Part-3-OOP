package ca.bcit.comp2601.firstreview.monikaszucs;

import java.util.ArrayList;

class Bank {
    private Person ceo;
    private ArrayList<BankAccount> accountReferences;

    Bank(final Person ceo, ArrayList accountReferences) {
        this.ceo = ceo;
        accountReferences = new ArrayList<String>();
        Name personOneName = new Name("Elon", "Musk");
        Date firstPersonAccountOpened = new Date(1990, 4, 10);
        BankAccount firstPersonBankAccount = new BankAccount(3000, 9876543, personOneName.getFirst(), "1234567", firstPersonAccountOpened, null);

        if(!accountReferences.contains(firstPersonBankAccount.getAccountNumber())) {
            accountReferences.add(firstPersonBankAccount);
        }
        System.out.println(firstPersonBankAccount);
        //final double amountUsd, final int pinToMatch, final String client, final String accountNumber,
        //                final Date accountOpened, final Date accountClosed

    }

    public String getCeo() {
        return "current ceo";
    }

}
