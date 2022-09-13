package ca.bcit.comp2601.firstreview.monikaszucs;

import java.util.ArrayList;

class Bank {
    private Person ceo;
    private ArrayList<BankAccount> accountReferences;

    Bank(final Person ceo, ArrayList accountReferences) {
        accountReferences = new ArrayList<String>();
    }

    public String getCeo() {
        return "current ceo";
    }

}
