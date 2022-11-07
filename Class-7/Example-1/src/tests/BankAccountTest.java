import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount b;

    @BeforeEach
    void setUp() {
        b = new BankAccount("a123456bc7", 1000.00);
    }

    @AfterEach
    void tearDown() {
        b = null;
    }

    @Test
    void testConstructor() {
        assertEquals(1000.00, b.getBalanceUsd(), 0.01);
        b.deposit(5);
        assertEquals(1005.00, b.getBalanceUsd(), 0.01);
        // constructor and mutator UPPERCASE letters in the account number upon storage
        assertEquals("A123456BC7", b.getAccountNumber());

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            b = new BankAccount("asdf", 1000);
        });
        assertEquals("account number must have 10 alphanumeric characters", ex.getMessage());
    }
}