package ca.bcit.comp2601.lesson1.monikaszucs;

import java.util.ArrayList;
import java.util.List;

public class School {
    private final List<Person> people;

    School() {
        people = new ArrayList<>();
        people.add(new Person("Woods"));
        people.add(new BcitStudent("Singer", "A00012345"));
        people.add(new BcitStudent("Nejad", "A2325892"));
        people.add(new Person("Smith"));

        for(Person person: people) {
            System.out.println(person.getDetails());


        }
    }
}
