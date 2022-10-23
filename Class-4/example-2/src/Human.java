public class Human {
    private static int numberOfEyes;
    private static long population;
    private final int eyeColor;
    public static final int DEFAULT_NUM_EYES;

    // static initializer block called once, when the Human class is loaded
    static {
        DEFAULT_NUM_EYES    = 2;
        numberOfEyes        = DEFAULT_NUM_EYES;
        population          = 7897288495L;
    }

    public Human(final int eyeColor) {
        this.eyeColor = eyeColor;
    }

    public static void main(final String[] args) {
        // note these calls are without creating Human objects
        System.out.println(Human.population);
        System.out.println(Human.numberOfEyes);
    }
}
