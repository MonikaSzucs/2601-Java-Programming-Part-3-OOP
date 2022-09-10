package ca.bcit.comp2601.lesson1.monikaszucs;

class Person {
    private final String lastName;
    private final String firstName;

    /**
     * @param lastName the last name of the person
     */
    Person(final String lastName, final String firstName) {
        if(lastName != null) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Invalid last name");
        }

        if(firstName != null) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Invalid first name");
        }
    }

    String getLastName() {
        return lastName;
    }

    String getFirstName() {
        return firstName;
    }
}
