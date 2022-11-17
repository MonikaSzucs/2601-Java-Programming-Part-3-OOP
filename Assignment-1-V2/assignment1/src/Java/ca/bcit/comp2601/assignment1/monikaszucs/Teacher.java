package ca.bcit.comp2601.assignment1.monikaszucs;

/**
 * Teacher.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Assignment 1
 *
 * @author Monika Szucs
 * @version 1.2
 *
 * @extends the Person class
 */
public class Teacher extends Person {
    private String specialty;

    private static final int NEUTRAL_COMPARE_TO;

    static {
        NEUTRAL_COMPARE_TO = 0;
    }

    /**
     * @param born when the person was born in Date format
     * @param name the name of the person in Name format
     * @param specialty the speciality of the person
     * @throws IllegalPersonException throwing an Illegal Person Exception if there is an error
     */
    Teacher(final Date born, final Name name, final String specialty) throws IllegalPersonException {
        super(born, name);
        if(born == null) {
            throw new IllegalPersonException("invalid date of birth");
        }
        if(name == null) {
            throw new IllegalPersonException("invalid name");
        }
        if(specialty.isBlank()) {
            throw new IllegalPersonException("bad specialty");
        }
        this.born = born;
        this.name = name;
        this.specialty = specialty;
    }

    /**
     * @return the specialty of the person
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * @return the toString
     */
    public String toString() {
        String returnString;
        returnString =  name.getPrettyName() +
                " (" +
                "specialty: " + getSpecialty() +
                ')' +
                " was born " + born.getYyyyMmDd();
        if(this.isAlive()) {
            returnString += " and is still alive";
        }
        else{
            returnString += " and died ";
            returnString += died.getYyyyMmDd();
        }
        return returnString;
    }

    /**
     * @param o the object
     * @return the value of 0
     */
    @Override
    public int compareTo(final Object o) {
        return NEUTRAL_COMPARE_TO;
    }
}
