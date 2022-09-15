package ca.bcit.comp2601.firstreview.monikaszucs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void withdraw() {
        //final double amountUsd, final int pinToMatch, final String client, final String accountNumber,
        //final Date accountOpened, final Date accountClosed
        Name nameOne = new Name("Monika", "Szucs");
        Date accountOpenedOne = new Date(1879, 3, 14);
        BankAccount accountOne = new BankAccount(200.00,1234567, nameOne.getFirst(),"123djb1", accountOpenedOne, null);

        assertEquals(190.00, accountOne.withdraw(10));


        Name nameTwo = new Name("Fred", "George");
        Date accountOpenedTwo = new Date(1879, 3, 14);
        BankAccount accountTwo = new BankAccount(200.00,1234567, nameTwo.getFirst(),"123djb1", accountOpenedTwo, null);

        assertEquals(150.00, accountOne.withdraw(50, 1234567));
    }

}