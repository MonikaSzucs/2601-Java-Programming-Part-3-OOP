package ca.bc.bcit.comp2601.lab3.monikaszucsdavood;

import java.util.Objects;

/**
 * Professor.java
 *
 * A Professor Class
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * Lab 3
 * @author Monika Szucs
 * @author Davood Tabrizi
 *
 * @version 1.1
 */
public class Professor extends Employee implements Comparable<Professor> {
    private String teachingMajor;

    private static final String DRESS_CODE = "fancy";
    private static final Boolean PAID_SALARY = true;
    private static final Boolean EDUCATION_REQUIRED = true;
    private static final String WORK_VERB = "teach";
    private static final double OVERTIME_PAY_RATE = 2.0;
    private static final Integer POSITIVE_NUMBER = +120;
    private static final Integer NEGATIVE_NUMBER = -120;
    private static final Integer HASHCODE_RETURN = 0;

    /**
     * @param name the name of the professor
     * @param teachingMajor the major that the professor is teaching
     */
    Professor(final String name, final String teachingMajor) {
        super(name);
        this.teachingMajor = teachingMajor;
    }

    /**
     * @return the name of the professor
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * @return the dress code
     */
    @Override
    public String getDressCode() {
        return DRESS_CODE;
    }

    /**
     * @return if the professor has a paid salary or not
     */
    @Override
    public boolean isPaidSalary() {
        return PAID_SALARY;
    }

    /**
     * @return the over time pay rate
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    /**
     * @return if an education is required or not
     */
    @Override
    public boolean requiresPostSecondaryEducation() {
        return EDUCATION_REQUIRED;
    }

    /**
     * @return what the work verb is
     */
    @Override
    public String getWorkVerb() {
        return WORK_VERB;
    }

    /**
     * @return the major the teacher is teaching
     */
    public String getTeachingMajor() {
        return teachingMajor;
    }

    /**
     * @param professor object
     * @return the order of the professor based on the teaching major
     */
    @Override
    public int compareTo(final Professor professor) {
        if(this.teachingMajor.length() < professor.teachingMajor.length()) {
            return POSITIVE_NUMBER;
        } else {
            return NEGATIVE_NUMBER;
        }
    }

    /**
     * @return the string containing the information on the professor
     */
    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + super.getName() + '\'' +
                ", dressCode=" + DRESS_CODE +
                ", paidSalary=" + PAID_SALARY +
                ", educationRequired=" + EDUCATION_REQUIRED +
                ", workVerb=" + WORK_VERB +
                ", teachingMajor=" + teachingMajor +
                '}' + "\n";
    }

    /**
     * @param o is the value of the Object
     * @return if the teaching major compared to the Objects teaching major matches
     */
    @Override
    public boolean equals(final Object o) {
        if(this == o) return true;
        if(!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return teachingMajor.equals(professor.teachingMajor);
    }

    /**
     * @return the value of 0
     */
    @Override
    public int hashCode() {
        return HASHCODE_RETURN;
    }
}
