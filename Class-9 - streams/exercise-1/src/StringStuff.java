import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringStuff {
    public static void main(final String[] args) {
        List<String> list;
        list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        //Stream<String> stream = list.stream().filter(s -> s.contains("e"));
        boolean exists = list.stream().anyMatch(str -> str.contains("e"));
        System.out.println(exists);

        // anyMatch
        // allMatch (true for empty streams, since none do not match
        // noneMatch (false for empty streams)
    }
}
