import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {

    public static void testPerson()
    {
        Person p1;
        try
        {
            Date born = new Date(30, 12, 1975);
            Name name = new Name("tiGer", "woODs");
            p1 = new Person(born, null);
            // code should not continue running; should be an exception
            System.out.println("Person class is wrong: code 1");
            return;
        }
        catch(final IllegalPersonException e)
        {
            if(!e.getMessage().equals("invalid name"))
            {
                System.out.println("Person class is wrong: code 2");
                return;
            }
        }
        catch(final Exception e)
        {
            System.out.println("Person class is wrong: code 3");
            return;
        }


        try
        {
            Date born = new Date(30, 12, 1975);
            Date died = null;
            Name name = new Name("tiGer", "woODs");
            p1 = new Person(null, name);
            // code should not continue running; should be an exception
            System.out.println("Person class is wrong: code 4");
            return;
        }
        catch(final IllegalPersonException e)
        {
            if(!e.getMessage().equals("invalid date of birth"))
            {
                System.out.println("Person class is wrong: code 5");
                return;
            }
        }
        catch(final Exception e)
        {
            System.out.println("Person class is wrong: code 6");
            return;
        }

        try
        {
            Date born = new Date(30, 12, 1975);
            Date died = null;
            Name name = new Name("tiGer", "woODs");
            p1 = new Person(born, name);

            if(!p1.isAlive())
            {
                System.out.println("Person class is wrong: code 7");
                return;
            }
            if(!p1.getDateOfBirth().getYyyyMmDd().equals("1975-12-30"))
            {
                System.out.println("Person class is wrong: code 8");
                return;
            }
            p1.die(new Date(16, 10, 2020));
            if(!p1.getDateOfDeath().getYyyyMmDd().equals("2020-10-16"))
            {
                System.out.println("Person class is wrong: code 9");
                return;
            }
            if(p1.isAlive())
            {
                System.out.println("Person class is wrong: code 10");
                return;
            }

        }
        catch(final IllegalPersonException e)
        {
            if(!e.getMessage().equals("invalid date of birth"))
            {
                System.out.println("Person class is wrong: code 11");
                return;
            }
        }
        catch(final Exception e)
        {
            System.out.println("Person class is wrong: code 12");
            return;
        }


        // Comparable:
        Date date1 = new Date(13, 7, 1979);
        Date date2 = new Date(13, 8, 1979);
        Date date3 = new Date(13, 7, 1980);
        Date date4 = new Date(12, 7, 1979);

        Person person1 = new Person(date4, new Name("oldest", "oldest"));
        Person person2 = new Person(date3, new Name("youngest","youngest"));
        Person person3 = new Person(date2, new Name("young", "young"));
        Person person4 = new Person(date1, new Name("older", "older"));
        person4.die(new Date(31, 10, 2000));

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        List<Person> sorted = new ArrayList<>();
        sorted.add(person1);
        sorted.add(person4);
        sorted.add(person3);
        sorted.add(person2);

        Collections.sort(people);

        if(!people.equals(sorted))
        {
            System.out.println("Person class is wrong: code 13");
            return;
        }

        System.out.println("Person class looks good: +15 marks");
        score += 15;

    }
}
