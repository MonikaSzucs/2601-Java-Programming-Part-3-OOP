package ca.bcit.comp2601.lab8.monikaszucs;

/**
 * Cars.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Lab #8
 *
 * @author Monika Szucs
 * @version 1.1
 */
public class Cars {
    private int id;
    private String make;
    private String model;
    private int year;
    private boolean electric;

    public Cars(final int id, final String make, final String model, final int year, final boolean electric) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.electric = electric;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isElectric() {
        return electric;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", electric=" + electric +
                '}';
    }
}
