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
    void testDefaultConstructor() {
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
    void testGetInitials() {
        Assertions.assertEquals("T.W.", this.nameOne.getInitials());
        Assertions.assertEquals("T.B.", this.nameTwo.getInitials());
    }

    @Test
    void testGetPrettyName() {
        Assertions.assertEquals("Tiger Woods", this.nameOne.getPrettyName());
        Assertions.assertEquals("Tim Bern", this.nameTwo.getPrettyName());
    }




//    public static void testPerson()
//    {
//        Person p1;
//        try
//        {
//            Date born = new Date(30, 12, 1975);
//            Name name = new Name("tiGer", "woODs");
//            p1 = new Person(born, null);
//            // code should not continue running; should be an exception
//            System.out.println("Person class is wrong: code 1");
//            return;
//        }
//        catch(final IllegalPersonException e)
//        {
//            if(!e.getMessage().equals("invalid name"))
//            {
//                System.out.println("Person class is wrong: code 2");
//                return;
//            }
//        }
//        catch(final Exception e)
//        {
//            System.out.println("Person class is wrong: code 3");
//            return;
//        }
//
//
//        try
//        {
//            Date born = new Date(30, 12, 1975);
//            Date died = null;
//            Name name = new Name("tiGer", "woODs");
//            p1 = new Person(null, name);
//            // code should not continue running; should be an exception
//            System.out.println("Person class is wrong: code 4");
//            return;
//        }
//        catch(final IllegalPersonException e)
//        {
//            if(!e.getMessage().equals("invalid date of birth"))
//            {
//                System.out.println("Person class is wrong: code 5");
//                return;
//            }
//        }
//        catch(final Exception e)
//        {
//            System.out.println("Person class is wrong: code 6");
//            return;
//        }
//
//        try
//        {
//            Date born = new Date(30, 12, 1975);
//            Date died = null;
//            Name name = new Name("tiGer", "woODs");
//            p1 = new Person(born, name);
//
//            if(!p1.isAlive())
//            {
//                System.out.println("Person class is wrong: code 7");
//                return;
//            }
//            if(!p1.getDateOfBirth().getYyyyMmDd().equals("1975-12-30"))
//            {
//                System.out.println("Person class is wrong: code 8");
//                return;
//            }
//            p1.die(new Date(16, 10, 2020));
//            if(!p1.getDateOfDeath().getYyyyMmDd().equals("2020-10-16"))
//            {
//                System.out.println("Person class is wrong: code 9");
//                return;
//            }
//            if(p1.isAlive())
//            {
//                System.out.println("Person class is wrong: code 10");
//                return;
//            }
//
//        }
//        catch(final IllegalPersonException e)
//        {
//            if(!e.getMessage().equals("invalid date of birth"))
//            {
//                System.out.println("Person class is wrong: code 11");
//                return;
//            }
//        }
//        catch(final Exception e)
//        {
//            System.out.println("Person class is wrong: code 12");
//            return;
//        }
//
//
//        // Comparable:
//        Date date1 = new Date(13, 7, 1979);
//        Date date2 = new Date(13, 8, 1979);
//        Date date3 = new Date(13, 7, 1980);
//        Date date4 = new Date(12, 7, 1979);
//
//        Person person1 = new Person(date4, new Name("oldest", "oldest"));
//        Person person2 = new Person(date3, new Name("youngest","youngest"));
//        Person person3 = new Person(date2, new Name("young", "young"));
//        Person person4 = new Person(date1, new Name("older", "older"));
//        person4.die(new Date(31, 10, 2000));
//
//        List<Person> people = new ArrayList<>();
//        people.add(person1);
//        people.add(person2);
//        people.add(person3);
//        people.add(person4);
//
//        List<Person> sorted = new ArrayList<>();
//        sorted.add(person1);
//        sorted.add(person4);
//        sorted.add(person3);
//        sorted.add(person2);
//
//        Collections.sort(people);
//
//        if(!people.equals(sorted))
//        {
//            System.out.println("Person class is wrong: code 13");
//            return;
//        }
//
//        System.out.println("Person class looks good: +15 marks");
//        score += 15;
//
//    }
}
