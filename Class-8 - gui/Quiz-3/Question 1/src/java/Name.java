public class Name {
    private final String firstName;
    private final String lastName;

    Name(final String firstName, final String lastName) {

        if(firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("The first name cannot be null or empty");
        }
        if(lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("The last name cannot be null or empty");
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return getFirstName().substring(0,1).toUpperCase() + getFirstName().substring(1) + " " +
                getLastName().substring(0,1).toUpperCase() + getLastName().substring(1);
    }
}
