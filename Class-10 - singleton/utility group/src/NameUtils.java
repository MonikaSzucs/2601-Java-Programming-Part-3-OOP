/**
 * @author COMP2601 Utility Design Pattern Group
 * @version 1.1
 * This class models a utility pattern for name.
 */
public abstract class NameUtils
{
    public static final int INITIAL_INDEX = 0;

    /**
     * @param name the given name parameter
     * @return the formatted initial of the given name
     */
    public static String getNameInitializer(final Name name)
    {
        return name.getFirstName().charAt(INITIAL_INDEX) + "." + name.getLastName().charAt(INITIAL_INDEX) + ".";
    }

    /**
     * @param name the given name parameter
     * @return the uppercase format of the given name
     */
    public static String getNameUppercase(final Name name)
    {
        return name.getFirstName().toUpperCase() + " " + name.getLastName().toUpperCase();
    }

    /**
     * @param name the given name parameter
     * @return the lowercase format of the given name
     */
    public static String getNameLowercase(final Name name)
    {
        return name.getFirstName().toLowerCase() + " " + name.getLastName().toLowerCase();
    }

    /**
     * This method prints out the name and initial in a formatted sentence.
     * @param name the given name parameter
     */
    public static void printNameFormal(final Name name)
    {
        System.out.printf("Hello, my name is %s %s (%s).\n", name.getFirstName(), name.getLastName(), getNameInitializer(name));
    }
}
