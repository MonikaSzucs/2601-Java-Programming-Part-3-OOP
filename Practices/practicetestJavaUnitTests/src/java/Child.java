public class Child extends Person implements Comparable<Child>{
    private String firstName;
    private String lastName;

    Child(final String firstName, final String lastName) {
        super(firstName, lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Child{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }

    public void speak() {
        System.out.println("Wawas");
    }

    @Override
    public int compareTo(Child o) {
        return 0;
    }
}
