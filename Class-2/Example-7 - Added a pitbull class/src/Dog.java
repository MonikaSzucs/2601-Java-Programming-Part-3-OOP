import java.util.Objects;

// Dog is abstract it is an idea
class Dog extends Mammal {
    private final String name;


    Dog(final String name, final int weightKg, final int yearBorn) {
        super(weightKg, yearBorn);
        this.name = name;
    }

    public void speak(final int times) {
        for(int i = 0; i < times; i++) {
            System.out.println("woof ");
        }
    }

    @Override
    public void move() {
        System.out.println("run");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return this.getYearBorn() == dog.getYearBorn();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getYearBorn());
    }
}
