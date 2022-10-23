public class Person {
    private int weightKg;

    public Person(final int weightKg) {
        validateWeightKg(weightKg);
        this.weightKg = weightKg;
    }

    private static void validateWeightKg(final int weightKg) {
        if(weightKg <= 0.0) {
            throw new IllegalArgumentException("invalid weight: " + weightKg);
        }
    }

    public void setWeightKg(final int weightKg) {
        validateWeightKg(weightKg);
        this.weightKg = weightKg;
    }
}
