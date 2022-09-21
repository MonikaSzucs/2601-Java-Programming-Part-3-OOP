abstract class Mammal {
    private double weightKg;
    private final int yearBorn;

    Mammal(final double weightKg, final int yearBorn) {
        this.weightKg = weightKg;
        this.yearBorn = yearBorn;
    }

    double getWeightKg() {
        return weightKg;
    }

    int getYearBorn() {
        return yearBorn;
    }

    // no body when you use abstract
    // you can have parameters
    public abstract void speak(final int numTimes);
    public abstract void move();
}
