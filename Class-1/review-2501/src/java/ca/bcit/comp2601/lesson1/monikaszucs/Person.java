package ca.bcit.comp2601.lesson1.monikaszucs;
// A package is like a folder that is created

// Package private. This is when you just make it class Person so only
// what code you have specified in this package can use this class
// If you put public class Person that means that anything anywhere can
// acceses this class
class Person {
    private final String lastName;

    /**
     * We are making this constructor package private as well
     *
     * @param lastName the last name of the person
     */
    Person(final String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Invalid last name");
        }
    }

    /**
     *
     * @return the last name
     */
    String getLastName() {
        return lastName;
    }

    String getDetails() {
        return "I am a " + this.getClass().getSimpleName() +
                " and my last name is " + getLastName();
    }
}
