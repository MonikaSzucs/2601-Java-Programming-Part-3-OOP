public class Math {
    private static final int NUMERATOR;
    private static final int DENOMINATOR;
    private static final int DENOMINATOR_INVALID;

    static {
        NUMERATOR = 5;
        DENOMINATOR = 2;
        DENOMINATOR_INVALID = 0;
    }

    public static void main(final String[] args) {
        try {
            divide(NUMERATOR,DENOMINATOR);
            double calculation;
            calculation = (double)NUMERATOR / DENOMINATOR;
            System.out.println(String.format("%s divided by %s is %.1f", NUMERATOR, DENOMINATOR, calculation));
        } catch (IllegalDivisorException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Completed calculation");
        }
    }

    public static void divide(final int numerator, int denominator) throws IllegalDivisorException {
        if(denominator <= DENOMINATOR_INVALID) {
            throw new IllegalDivisorException("The denominator value is not valid");
        }
    }
}
