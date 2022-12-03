import java.util.Arrays;
import java.util.List;

public class ParallelStreamListOfNovels {

    public static void main(final String[] args) {

        List<String> list = Arrays.asList("Francis Crick: Discoverer of the Genetic Code", "The Da Vinci Code", "Cracking the Code", "Code");

        list.parallelStream() //instead of list.stream()
                .filter((str) -> str.length() < 14)
                .forEach(System.out::println);
    }
}
