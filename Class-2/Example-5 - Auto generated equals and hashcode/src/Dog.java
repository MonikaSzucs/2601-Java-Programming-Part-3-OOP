import java.util.Objects;

class Dog {
    private final String name;
    private int weightKg;
    private final int yearBorn;

    Dog(final String name, final int weightKg, final int yearBorn) {
        this.name = name;
        this.weightKg = weightKg;
        this.yearBorn = yearBorn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return yearBorn == dog.yearBorn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearBorn);
    }

    public static void main(final String[] args) {
        Dog d1 = new Dog("rocky", 40, 2013);
        Dog d2 = new Dog("snoopy", 40, 2014);
        System.out.println(d1.equals(d2));

        double difference = d1.weightKg - d2.weightKg;

        if(difference < 0.000001) {
            System.out.println("Close enough to be called equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
