import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        //Dog d1 = new Dog("rocky", 50.0, 2013);
        //Dog d2 = new Dog("snoopy", 40.0, 2003);
        //System.out.println(d1.equals(d2));
        //System.out.println(5.0 == 5.0);

        //System.out.println(d1 == d2); // compares the addresses

        //double difference = d1.getWeightKg() - d2.getWeightKg();
        //if(difference <= 0.001) {
        //    System.out.println("Close enough to be called equal");
        //} else {
        //    System.out.println("not equal");
        //}

        List<Mammal> mammals;
        mammals = new ArrayList<>();

        mammals.add(new Pitbull("rocky", 50, 2013));
        mammals.add(new Dolphin(250, 2001));
        //mammals.add(new Mammal()) // cannot do this - mammel is abstract cannot be instantiated
        // you cant just have a mammal you can only have subtypes of mammals
        // mammal is an idea or thing - its something we made up
        for(Mammal m: mammals) {
            m.move();
            m.speak(3);
        }
    }
}
