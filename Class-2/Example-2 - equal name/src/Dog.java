
class Dog {
    private final String name;
    private double weightKg;
    private final int yearBorn;

    Dog(final String name, final double weightKg, final int yearBorn) {
        this.name = name;
        this.weightKg = weightKg;
        this.yearBorn = yearBorn;
    }

    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }

        // Is this current object the same as the object we are in?
        if(this == o) {
            return true; // same added is the same dog
        }
        if(!(o instanceof Dog)) {
            return false; // if the objects are different from a Dog
        }

        // if it makes it past the checks it can now cast this Dog
        Dog d = (Dog)o;

        //dog name is the same
        return (this.name.equalsIgnoreCase(d.name));
    }

    @Override
    public int hashCode() {
        return 5; // equal objects should have equal hashcodes
    }

    public static void main(final String[] args) {
        Dog d1 = new Dog("rocky", 50.0, 2013);
        Dog d2 = new Dog("rocky", 40.0, 2014);
        System.out.println(d1.equals(d2));
    }
}
