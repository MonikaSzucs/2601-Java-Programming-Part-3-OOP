package ca.bc.bcit.comp2601.lab3.monikaszucsdavood;

/**
 * Employee.java
 *
 * A Employee Class
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * Lab 3
 * @author Monika Szucs
 * @author Davood Tabrizi
 *
 * @version 1.1
 */
public abstract class Employee implements Employable {
    private final String name;
    private static final Integer DEFAULT_OVER_TIME_PAY_RATE = 0;

    /**
     * @param name the name of the employee
     */
    public Employee(final String name) {
        this.name = name;
    }

    /**
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * @return the value of the pay rate
     */
    @Override
    public double getOverTimePayRate() {
        return DEFAULT_OVER_TIME_PAY_RATE;
    }

    /**
     * @param o is the value of the Object
     * @return if the Object is really an Employee or not
     */
    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }

        if(this == o) return true;

        if(!(o instanceof Employee)) {
            return false;
        }

        Employee employee = (Employee) o;
        return (this.name.equals(employee.name));
    }
}
