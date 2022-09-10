package ca.bcit.comp2601.lesson1.monikaszucs;

class Person {
    private final String lastName;

    /**
     * @param lastName the last name of the person
     */
    Person(final String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Invalid last name");
        }
    }

    String getLastName() {
        return lastName;
    }


    String getDetails() {
        return "I am a " + this.getClass().getSimpleName() +
                " and my last name is " + getLastName();
    }



}
