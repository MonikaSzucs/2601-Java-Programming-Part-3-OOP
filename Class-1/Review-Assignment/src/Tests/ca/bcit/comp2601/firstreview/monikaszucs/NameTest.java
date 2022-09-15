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

        Name nameTwo = new Name("eLoN", "MuSk");
        assertEquals("eLoN", nameTwo.getFirst());
    }

    @Test
    void getLast() {
        Name name = new Name("tigER", "wooDS");
        assertEquals("wooDS", name.getLast());

        Name nameTwo = new Name("eLoN", "MuSk");
        assertEquals("MuSk", nameTwo.getLast());
    }

    @Test
    void getInitials() {
        Name name = new Name("tigER", "wooDS");
        assertEquals("T.W.", name.getInitials());

        Name nameTwo = new Name("eLoN", "MuSk");
        assertEquals("E.M.", nameTwo.getInitials());
    }

    @Test
    void getFullName() {
        Name name = new Name("tigER", "wooDS");
        assertEquals("Tiger Woods", name.getFullName());

        Name nameTwo = new Name("eLoN", "MuSk");
        assertEquals("Elon Musk", nameTwo.getFullName());
    }

    @Test
    public void constructorThrows_withNullFirstName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name(null, "wooDS");
        });

        String expectedMessage = "The argument is not valid. The first cannot be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void constructorThrows_withNullLastName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name("tigER", null);
        });

        String expectedMessage = "The argument is not valid. The first cannot be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void constructorThrows_withBlankFirstName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name( "", "wooDS");
        });

        String expectedMessage = "The argument is not valid. The first cannot be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void constructorThrows_withBlankLastName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name( "tigER", "");
        });

        String expectedMessage = "The argument is not valid. The first cannot be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void constructorThrows_withAdminInFirstName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name( "helloadminhi", "wooDS");
        });

        String expectedMessage = "The first name has the word admin in it";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void constructorThrows_withAdminInLastName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name( "tigER", "helloadminhi");
        });

        String expectedMessage = "The last name has the word admin in it";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void constructorThrows_withFirstNameLengthGreaterThanFourtyFive() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name( "sfdsjlfjldkslkgdklgfdlkhjfdlkhjljhklfdjgroeedsf", "wooDS");
        });

        String expectedMessage = "The first name is longer than 45 characters";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void constructorThrows_withLastNameLengthGreaterThanFourtyFive() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name( "tigER", "sfdsjlfjldkslkgdklgfdlkhjfdlkhjljhklfdjgroeedsf");
        });

        String expectedMessage = "The last name is longer than 45 characters";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

}