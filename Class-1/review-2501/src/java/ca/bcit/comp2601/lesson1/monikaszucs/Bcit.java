package ca.bcit.comp2601.lesson1.monikaszucs;

public class Bcit {
    // array of five people
    private Person[] people;

    Bcit() {
        people = new Person[5];

        people[0] = new Person("Woods");
        people[1] = new BcitStudent("Fong", "A001111111");
        people[2] = new BcitStudent("Trevosam", "A0000002");

        try {
            people[2] = new BcitStudent(null, null);
        } catch (final IllegalArgumentException e) {
            throw new IllegalArgumentException("Error in student");
        }

        people[3] = new Person("Woods");

        for(int i = 0; i < people.length; i ++) {
            if(people[i] != null) {
                System.out.println(people[i].getDetails());
            }
        }
    }
}
