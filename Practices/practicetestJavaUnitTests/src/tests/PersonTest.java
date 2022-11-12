import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    //Person personOne;
    Person personTwo;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Starting to setup before class");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("Tearing down after the Class");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Setting up the unit test");
        //personOne = new Person();
        personTwo = new Person("monika", "szucs");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down the tests");
    }

    @Test
    void testGetFirstName() {
        //assertEquals("Firstname", personOne.getFirstName());
        //assertEquals("Lastname", personOne.getLastName());
        assertEquals("Monika", personTwo.getFirstName());
        assertEquals("Szucs", personTwo.getLastName());
    }

    @Test
    public void constructorThrows_withNullFirstName() {
        Exception exception;
        exception = assertThrows(IllegalArgumentException.class, () -> {
           Person person = new Person(null, "Szucs");
        });

        String expectedMessage = "The first name is invalid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    @Test
    public void constructorThrows_withNullLastName() {
        Exception exception;
        exception = assertThrows(IllegalArgumentException.class, () -> {
            Person person = new Person("Monika", null);
        });

        String expectedMessage = "The last name is invalid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }
}