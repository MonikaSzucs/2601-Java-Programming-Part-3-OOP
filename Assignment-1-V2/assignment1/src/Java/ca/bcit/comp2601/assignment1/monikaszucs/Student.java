package ca.bcit.comp2601.assignment1.monikaszucs;

/**
 * Student.java
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
public class Student extends Person {
    private String studentNumber;

    private static final int NEUTRAL_COMPARE_TO;
    private static final int STUDENT_NUMBER_MAX_LENGTH;

    static {
        NEUTRAL_COMPARE_TO = 0;
        STUDENT_NUMBER_MAX_LENGTH = 9;
    }

    /**
     * @param born when the person was born in Date format
     * @param name the name of the person in Name format
     * @param studentNumber the student number
     * @throws IllegalPersonException throwing an illegal person exception if there are any errors
     */
    Student(final Date born, final Name name, final String studentNumber) throws IllegalPersonException {
        super(born, name);
        if(born == null) {
            throw new IllegalPersonException("invalid date of birth");
        }
        if(name == null) {
            throw new IllegalPersonException("invalid name");
        }
        if(studentNumber == null || studentNumber.isBlank() || studentNumber.length() != STUDENT_NUMBER_MAX_LENGTH) {
            throw new IllegalPersonException("bad student number");
        }
        this.born = born;
        this.name = name;
        this.studentNumber = studentNumber;
    }

    /**
     * @return the student number
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * @return the toString
     */
    public String toString() {
        String returnString;

        returnString =  name.getPrettyName() +
                " (" +
                "student number: " + getStudentNumber() +
                ')' +
                " was born " + born.getYyyyMmDd();
        if(this.isAlive()){
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
    public int compareTo(Object o) {
        return NEUTRAL_COMPARE_TO;
    }
}
