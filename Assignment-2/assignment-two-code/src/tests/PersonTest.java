import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {

    Person personOne;
    Person personTwo;
    Person personThree;

    Date bornOne;
    Date bornTwo;
    Date bornThree;

    Date diedOne;
    Date diedTwo;

    Name nameOne;
    Name nameTwo;
    Name nameThree;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Starting the test case");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("Ending the test case");
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Starting a unit test");
        bornOne = new Date(30, 12, 1975);
        nameOne = new Name("tiger", "woods");
        personOne = new Person(bornOne, nameOne);

        bornTwo = new Date(25, 8, 1990);
        nameTwo = new Name("tim", "bern");
        personTwo = new Person(bornOne, nameOne);
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("Ending a unit test");
        personOne = null;
        personTwo = null;
        personThree = null;

        bornOne = null;
        bornTwo = null;
        bornThree = null;

        nameOne = null;
        nameTwo = null;
        nameThree = null;
    }

    @Test
    void testDefaultPersonConstructor() {
        Assertions.assertEquals("tiger", this.nameOne.getFirst());
        Assertions.assertEquals("tim", this.nameTwo.getFirst());

        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            nameOne = new Name(null, "woods");
            nameOne = new Name("", "woods");
            nameOne = new Name("   ", "woods");
            nameTwo = new Name(null, "bern");
            nameOne = new Name("", "bern");
            nameOne = new Name("   ", "bern");
        });
        Assertions.assertEquals("invalid first name", ex.getMessage());

        Assertions.assertEquals("woods", this.nameOne.getLast());
        Assertions.assertEquals("bern", this.nameTwo.getLast());

        IllegalArgumentException ex2 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            nameOne = new Name("tiger", null);
            nameOne = new Name("tiger", "");
            nameOne = new Name("tiger", "   ");
            nameTwo = new Name("tim", null);
            nameTwo = new Name("tim", "");
            nameTwo = new Name("tim", "   ");
        });
        Assertions.assertEquals("invalid last name", ex2.getMessage());
    }

    @Test
    void testGetDeath() {
        diedOne = null;
        diedTwo = new Date(12, 10, 2020);

        Assertions.assertEquals(diedOne, null);
        Assertions.assertEquals("2020-10-12", diedTwo.getYyyyMmDd());
    }

    @Test
    void testGetInitials() {
        Assertions.assertEquals("T.W.", this.nameOne.getInitials());
        Assertions.assertEquals("T.B.", this.nameTwo.getInitials());
    }

    @Test
    void testGetPrettyName() {
        Assertions.assertEquals("Tiger Woods", this.nameOne.getPrettyName());
        Assertions.assertEquals("Tim Bern", this.nameTwo.getPrettyName());
    }

    @Test
    void testGetFirstName() {
        Assertions.assertEquals("tiger", this.nameOne.getFirst());
        Assertions.assertEquals("tim", this.nameTwo.getFirst());
    }

    @Test
    void testGetLastName() {
        Assertions.assertEquals("woods", this.nameOne.getLast());
        Assertions.assertEquals("bern", this.nameTwo.getLast());
    }
}
