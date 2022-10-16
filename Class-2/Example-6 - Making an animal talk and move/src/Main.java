import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        Dog d1 = new Dog("rocky", 40, 2013);
        Dog d2 = new Dog("snoopy", 40, 2014);
        System.out.println(d1.equals(d2));

        double difference = d1.getWeightKg() - d2.getYearBorn();

        if(difference < 0.000001) {
            System.out.println("Close enough to be called equal");
        } else {
            System.out.println("Not equal");
        }

        List<Mammal> mammals;
        mammals = new ArrayList<>();
        mammals.add(new Dog("rocky", 40, 2012));
        mammals.add(new Dolphin(250, 2001));

        for(Mammal m: mammals) {
            m.move();
            m.speak(3);
        }
    }
}
