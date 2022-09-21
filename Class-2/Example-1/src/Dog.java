
abstract class Dog extends Mammal{
    private final String name;

    Dog(final String name, final double weightKg, final int yearBorn) {
        super(weightKg, yearBorn);
        this.name = name;
    }

    @Override
    public void speak(final int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("woof");
        }
    }

    @Override
    public void move() {
        System.out.println("run");
    }

    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }
        if(this == o) { // same address i.e. same dog
            return true;
        }

        if(!(o instanceof Dog)) {
            return false;
        }
        Dog d = (Dog)o;
        //return (this.name == d.yearBorn);
        return(this.name.equalsIgnoreCase(d.name));

    }


//
//    @Override
//    public int hashCode() {
//        return 52; // equal objects must have equal hashcodes
//    }

//    @Override
//    public int hashCode() {
//        return Object.hash(yearBorn);
//    }


}
