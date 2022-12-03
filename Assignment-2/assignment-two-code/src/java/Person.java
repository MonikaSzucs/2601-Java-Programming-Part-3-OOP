import java.util.Comparator;

/**
 * Person.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Assignment 1
 *
 * @author Monika Szucs
 * @version 1.2
 *
 * @Comparable implements a comparable
 */
class Person {


    Date born;
    Date died;
    Name name;

    private static final int DAY_DEFAULT;
    private static final int MONTH_DEFAULT;
    private static final int YEAR_DEFAUlT;

    static {
        DAY_DEFAULT = 1;
        MONTH_DEFAULT = 1;
        YEAR_DEFAUlT = 1;
    }

    /**
     * @param born when the person was born in Date format
     * @param name the name of the person in Name format
     * @throws IllegalPersonException throwing an illegal person exception if something is wrong
     */
    Person(final Date born, final Name name) throws IllegalPersonException {
        if(born == null) {
            throw new IllegalPersonException("invalid date of birth");
        }
        if(name == null) {
            throw new IllegalPersonException("invalid name");
        }
        this.born = born;
        this.name = name;
    }

    /**
     * @param dateOfDeath when the person died in Date format
     */
    public void die(final Date dateOfDeath) {
        died = dateOfDeath;
    }

    /**
     * @return when the person was born in Date format
     */
    public Date getDateOfBirth() {
        return new Date(born.getDay(), born.getMonth(), born.getYear());
    }

    /**
     * @return when or if the person has died
     */
    public Date getDateOfDeath() {
        Date newDate;
        if(died != null) {
            newDate = new Date( died.getDay(), died.getMonth(),died.getYear());
        } else {
            newDate = new Date(DAY_DEFAULT, MONTH_DEFAULT, YEAR_DEFAUlT);
        }
        return newDate;
    }

    /**
     * @return null for died if the person is still alive
     */
    public boolean isAlive() {
        return died == null;
    }

    /**
     * @param p comparing to the person to see if the date of birth matches
     * @return if the date of birth is the same
     */
    public int compareTo(final Person p) {
        return this.getDateOfBirth().compareTo(p.getDateOfBirth());
    }

    /**
     * @param o the object
     * @return if the person matches the object
     */
    public int compareTo(Object o) {
        if(o.getClass() != Person.class) {
            throw new IllegalArgumentException("Comparing Person object to an object of a different class.");
        }
        Person p = (Person) o;
        return compareTo(p);
    }

    /**
     * @return a String format of information about the person
     */
    @Override
    public String toString() {
        String returnValue;
        returnValue = name.getPrettyName();

        returnValue += " was born" + " " + born.getYyyyMmDd();
        if(!isAlive()) {
            returnValue += " and died on " + died.getYyyyMmDd();
        } else {
            returnValue += " and is still alive";
        }
        return returnValue;
    }
}
