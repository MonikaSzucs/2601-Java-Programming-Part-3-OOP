import java.util.HashMap;
import java.util.Map;

public class Number {
    public static void main(final String[] args) {
        Map<Integer, String> numbers;
        numbers = new HashMap<>();

        numbers.put(1, "one");
        numbers.put(30, "thirty");
        numbers.put(1000000, "one million");
        numbers.put(67, "sixty seven");

        // no lambda
        for(Map.Entry<Integer, String> entry: numbers.entrySet()) {
            System.out.println(entry.getKey() + " is the key for " + entry.getValue());
        }

        numbers.forEach((k,v) -> System.out.println(k +  " is the key for " + v));
    }
}
