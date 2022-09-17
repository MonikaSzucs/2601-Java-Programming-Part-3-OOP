abstract class Mammal {
    private int weightKg;
    private final int yearBorn;

    Mammal(final int weightKg, final int yearBorn) {
        super(weightKg, yearBorn);
    }

    int getWeightKg() {
        return weightKg;
    }

    int getYearBorn() {
        return yearBorn;
    }

    public abstract void speak(final int numTimes);
    public abstract void move();
}
