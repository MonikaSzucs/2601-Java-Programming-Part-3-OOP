public class Celebrity
{
    private String id;
    private String occupation;
    private boolean alive;
    private String firstName;
    private String middleName;
    private String lastName;
    private String citizenship;


    public Celebrity(final String id, final String occupation, final boolean alive, final String firstName, final String middleName, final String lastName, final String citizenship)
    {
        this.id = id;
        this.occupation = occupation;
        this.alive = alive;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.citizenship = citizenship;
    }

    public String getId()
    {
        return id;
    }

    public String getOccupation()
    {
        return occupation;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getCitizenship()
    {
        return citizenship;
    }


    public String getFullName()
    {
        return firstName + " " + middleName + " " + lastName;
    }

    @Override
    public String toString()
    {
        return "Celebrity{" +
                "id='" + id + '\'' +
                ", occupation='" + occupation + '\'' +
                ", alive=" + alive +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }
}
