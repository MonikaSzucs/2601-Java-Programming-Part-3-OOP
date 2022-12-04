import java.util.Arrays;
import java.util.List;

public class MainParallelStream {

    public static void main(final String[] args) {

        List<String> list = Arrays.asList("Hello", "evil", "world", "I", "like", "soup");

        list.parallelStream() //instead of list.stream()
                .filter((str) -> str.length() > 1)
                .forEach(System.out::println);
    }
}
