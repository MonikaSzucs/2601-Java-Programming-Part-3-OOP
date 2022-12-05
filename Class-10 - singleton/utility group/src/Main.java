/**
 * @author COMP2601 Utility Design Pattern Group
 * @version 1.0
 */
public class Main
{
    public static void main(final String[] args)
    {
        Name n;
        n = Name.getInstance("Tiger", "Woods");

        System.out.println(NameUtils.getNameInitializer(n));
        System.out.println(NameUtils.getNameUppercase(n));
        System.out.println(NameUtils.getNameLowercase(n));
        NameUtils.printNameFormal(n);
    }
}
