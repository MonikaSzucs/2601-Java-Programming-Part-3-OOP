/**
 * @author COMP2601 Utility Design Pattern Group
 * @version 1.0
 * This class models a person's name.
 */
public class Name
{
    private static Name  name;
    private final String firstName;
    private final String lastName;

    static
    {
        name = null;
    }

    /**
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @throws IllegalArgumentException if the first name or the last name is null
     */
    private Name(final String firstName, final String lastName)
    {
        if(firstName != null && lastName != null)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        else
        {
            throw new IllegalArgumentException("Invalid name!");
        }
    }

    /**
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @return the single instance of the Name class
     */
    public static Name getInstance(final String firstName, final String lastName)
    {
        if(name == null)
        {
            name = new Name(firstName, lastName);
        }
        return name;
    }

    /**
     * @return the first name of the person
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return the last name of the person
     */
    public String getLastName()
    {
        return lastName;
    }
}
