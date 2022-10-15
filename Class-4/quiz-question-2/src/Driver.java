import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        List<Dog> dogs;
        dogs = new ArrayList<>();
        dogs.add(new Dog("Rex", 2020));
        dogs.add(new Dog("Bob", 2000));
        dogs.add(new Dog("Joe", 2000));

        System.out.println(dogs);

        Collections.sort(dogs);
        System.out.println(dogs);
    }
}
