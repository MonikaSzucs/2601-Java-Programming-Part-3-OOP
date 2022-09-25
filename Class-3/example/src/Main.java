import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        List l;
        l = new ArrayList();

        Speakable s;
        s = new Dog("rocky", 2013);
        s = new Cat();
        s.speak();
        System.out.println(s.getMinDb());

        List<Dog> dogs;
        dogs = new ArrayList<>();
        dogs.add(new Dog("rocky", 2010));
        dogs.add(new Dog("a", 2011));
        dogs.add(new Dog("abcdef", 2012));
        dogs.add(new Dog("whatever whoever", 2013));
        dogs.add(new Dog("sc", 2009));
        dogs.add(new Dog("snoopy", 2020));
        dogs.add(new Dog("benji", 2015));
        System.out.println(dogs);

        Collections.sort(dogs);
        System.out.println(dogs);
    }
}
