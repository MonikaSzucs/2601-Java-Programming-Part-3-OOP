import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount b;

    @BeforeEach
    void setUp() {
        b = new BankAccount("a1234567", 1000.00);

    }

    @AfterEach
    void tearDown() {
        b = null;
    }

    @Test
    void testContructor() {
        assertEquals(1000.00, b.getBalanceUsd(), 0.01);
        b.deposit(5);
        assertEquals(1005.00, b.getBalanceUsd(), 0.01);
        // constructor and mutators UPPERCASE letters in the account number upon storage
        assertEquals("a1234567", b.getAccountNumber());

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            b = new BankAccount("asdf", 1000.0);
        });
        assertEquals("account number musthave 10 alphanumberic characters", ex.getMessage());

    }
}