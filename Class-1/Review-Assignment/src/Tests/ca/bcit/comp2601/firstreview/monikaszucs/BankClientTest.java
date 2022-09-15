package ca.bcit.comp2601.firstreview.monikaszucs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankClientTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDetails() {
        Name nameOne = new Name("Tiger", "Woods");
        Date birthdateOne = new Date(1879, 3, 14);
        Date deathDateOne = new Date(1955, 4, 18);
        Date dateJoinedBank = new Date(2020, 9, 3);
        BankClient tigerWoods = new BankClient(nameOne, birthdateOne, deathDateOne, dateJoinedBank, "12345");

        assertEquals("Tiger Woods client #12345 (alive) joined the bank on thursday, September 3, 2020!", tigerWoods.getDetails());
    }
}