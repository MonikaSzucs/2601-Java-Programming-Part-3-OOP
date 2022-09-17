import java.util.ArrayList;
import java.util.List;

public class Main {
    private final
    public static void main(final String[] args) {
        Dog d1 = new Dog("rocky", 50.0, 2013);
        Dog d2 = new Dog("snoopy", 40.0, 2003);
        //System.out.println(d1.equals(d2));
        System.out.println(5.0 == 5.0);

        System.out.println(d1 == d2); // compares the addresses

        double difference = d1.weightKg - d2.weightKg;
        System.out.println(difference);
        if(difference <= 0.001) {
            System.out.println("Close enough to be called equal");
        } else {
            System.out.println("not equal");
        }

        List<Mammal> mammals;
        mammals = new ArrayList<>();

        mammals.add(new Dog("rocky", 50, 2013));
        mammals.add(new Dolphin(250, 2001));

        for(Mammal m: mammals) {
            m.move();
            m.speak(3);
        }
    }
}
