public class Dog extends Mammals implements Comparable<Dog> {

    private String name;
    private int yearBorn;

    public Dog(String name, int yearBorn) {
        super();
        this.name = name;
        this.yearBorn = yearBorn;
    }


    @Override
    public int compareTo(final Dog d) {
        // dogs with longer names are bigger
        // if this is bigger return a +
        // if d is bigger return -
        // if this == d return 0

        // younger dogs are bigger
        return this.yearBorn - d.yearBorn;

//        if(this.name.length() > d.name.length()) {
//            return +120;
//        } else if(this.name.length() < d.name.length()) {
//            return -2;
//        } else {
//            return 0;
//        }

        // or if not name then return by birthday
//        if(this.name.length() > d.name.length()) {
//            return 1;
//        } else if(this.name.length() < d.name.length()) {
//            return -1;
//        } else {
//            return this.yearBorn - d.yearBorn;
//        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", yearBorn=" + yearBorn +
                '}' + "\n";
    }

    @Override
    public void speak() {
        System.out.println("WOOF");
        System.out.println(Speakable.MIN_DB);
    }

    @Override
    public void move() {
        System.out.println("run");
    }

    public void bark() {
        System.out.println("arf arf");
    }
}
