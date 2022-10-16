// abstract classes means you cannot make objects out of it
abstract class Mammal {
    private int weightKg;
    private final int yearBorn;

    public Mammal(final int weightKg, final int yearBorn) {
        this.weightKg = weightKg;
        this.yearBorn = yearBorn;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    // put these two below in this Parent Class
    public abstract void speak(final int numberOfTimes);

    public abstract void move();
}
