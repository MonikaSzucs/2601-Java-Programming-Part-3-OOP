public class Person {
    private double weightKg;

    public static final double MIN_WEIGHT_KG;
    public static final double DEFAULT_WEIGHT_KG;

    static {
        MIN_WEIGHT_KG = 0.0;
        DEFAULT_WEIGHT_KG = 100.0;
    }
    /**
     *
     * @param weightKg
     * @throws IllegalWeightException if weight <= MIN_WEIGHT_KG
     */
    Person(final double weightKg)
            throws IllegalWeightException {
        if(weightKg <= MIN_WEIGHT_KG) {
            throw new IllegalWeightException("cannot weigh " + MIN_WEIGHT_KG);
        }
        this.weightKg = weightKg;
    }

    @Override
    public String toString() {
        return "Person{" +
                "weightKg=" + weightKg +
                '}';
    }
}
