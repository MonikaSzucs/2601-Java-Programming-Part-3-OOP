import java.util.Arrays;
import java.util.List;

public class MainParallelStreamExampleTwo {

    public static void main(final String[] args) {

        List<String> list = Arrays.asList("Hello", "evil", "world", "I", "like", "soup");

        list.stream() //instead of list.stream()
                .filter((str) -> str.length() > 1)
                .forEach(System.out::println);
    }
}
