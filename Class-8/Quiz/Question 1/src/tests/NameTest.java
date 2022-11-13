import org.junit.jupiter.api.*;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {
    Name nameOne;
    Name nameTwo;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Starting the set up before class");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("Ending the set up before class");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Starting the test case");
        nameOne = new Name("monika", "szucs");
        nameTwo = new Name("john", "smith");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Ending the test case");
    }

    @Test
    void testConstructor() {
        assertEquals("monika", nameOne.getFirstName());
        assertEquals("john", nameTwo.getFirstName());

        assertEquals("szucs", nameOne.getLastName());
        assertEquals("smith", nameTwo.getLastName());
    }

    @Test
    void testGetFirstName() {
        Name name = new Name("Bob", "Joe");
        assertEquals("Bob", name.getFirstName());
    }

    @Test
    void testGetLastName() {
        Name name = new Name("Bob", "Joe");
        assertEquals("Joe", name.getLastName());
    }

    @Test
    void testGetName() {
        assertEquals("Monika Szucs", nameOne.getName());
        assertEquals("John Smith", nameTwo.getName());
    }

    @Test
    void constructorThrows_withNullFirstName() {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name(null, "szucs");
        });

        String expectedMessage = "The first name cannot be null or empty";
        String actualMessage = ex.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    void constructorThrows_withBlankFirstName() {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name("", "szucs");
        });

        String expectedMessage = "The first name cannot be null or empty";
        String actualMessage = ex.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    void constructorThrows_withNullLastName() {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name("monika", null);
        });

        String expectedMessage = "The last name cannot be null or empty";
        String actualMessage = ex.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    void constructorThrows_withBlankLastName() {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> {
            Name name = new Name("monika", "");
        });

        String expectedMessage = "The last name cannot be null or empty";
        String actualMessage = ex.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }
}