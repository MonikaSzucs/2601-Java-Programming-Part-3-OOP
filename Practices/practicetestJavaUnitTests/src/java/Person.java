import java.util.Locale;

public class Person implements Speakable {
    private final String firstName;
    private final String lastName;

    private static final String DEFAULT_FIRST_NAME;
    private static final String DEFAULT_LAST_NAME;

    static {
        DEFAULT_FIRST_NAME = "FirstName";
        DEFAULT_LAST_NAME = "LastName";
    }

//    public Person() {
//        this.firstName = DEFAULT_FIRST_NAME;
//        this.lastName = DEFAULT_LAST_NAME;
//    }

    public Person(final String firstName, final String lastName) {
        if(firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("The first name is invalid");
        }

        if(lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("The last name is invalid");
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Human is speaking now");
    }
}
