public class Dog {
    private final int       yearBorn;
    private final boolean   male;

    private double          weightKg;
    private String          name;

    public static final double MIN_WEIGHT_KG;
    public static final double PI;

    // this is static for the class
    static
    {
        MIN_WEIGHT_KG = 1.0;
        PI = 3.14;
    }

    // instance initializer blocks
    // instances or Objects
    {
        weightKg = MIN_WEIGHT_KG;
        name = "benji";
    }

    // constructor needs to validate the data with the if statement(s)
    public Dog(final double kg, final int born, final boolean male, final String name) {
        changeName(name);

        if(kg <= 0.0 || born == 0 || name.isBlank()) {
            throw new IllegalArgumentException("improper weight");
        }

        this.weightKg   = kg;
        this.yearBorn   = born;
        this.male       = male;
        this.name       = name;
    }

    // private means it cannot be overwritten
    // you have to go through here to do the checking
    // this is the boss - all dog names go through here
    private final void changeName(final String name) throws IllegalArgumentException {
        if (name.isBlank()) {
            throw new IllegalArgumentException("bad name");
        }
        this.name = name;
    }

    public void setName(final String newName) {
        changeName(newName);
    }
}
