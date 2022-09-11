package ca.bcit.comp2601.firstreview.monikaszucs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFirst() {
        Name name = new Name("tigER", "wooDS");
        assertEquals("tigER", name.getFirst());

        name = new Name("eLoN", "MuSk");
        assertEquals("eLoN", name.getFirst());
    }

    @Test
    void getLast() {
        Name name = new Name("tigER", "wooDS");
        assertEquals("wooDS", name.getLast());

        name = new Name("eLoN", "MuSk");
        assertEquals("MuSk", name.getLast());
    }

    @Test
    void getInitials() {
        Name name = new Name("tigER", "wooDS");
        assertEquals("T.W.", name.getInitials());

        name = new Name("eLoN", "MuSk");
        assertEquals("E.M.", name.getInitials());
    }

    @Test
    void getFullName() {
        Name name = new Name("tigER", "wooDS");
        assertEquals("Tiger Woods", name.getFullName());

        name = new Name("eLoN", "MuSk");
        assertEquals("Elon Musk", name.getFullName());
    }

    @Test
    public void constructorThrows_withBadArgument() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name(null, "wooDS");
        });

        String expectedMessage = "bad first name!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void constructorThrows_withBadArgumentTwo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name( "", "wooDS");
        });

        String expectedMessage = "Is blank";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void constructorThrows_withBadArgumenThree() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name( "admin", "wooDS");
        });

        String expectedMessage = "Has the word admin";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void checkingFirstNameLengthGreaterThanFourtyFive() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name( "sfdsjlfjldkslkgdklgfdlkhjfdlkhjljhklfdjgroeedsf", "wooDS");
        });

        String expectedMessage = "The first name is longer than 45 characters";
        String actualMessage = exception.getMessage();

        assertTrue(name.length() > 4, "5 is greater the 4");
    }

}