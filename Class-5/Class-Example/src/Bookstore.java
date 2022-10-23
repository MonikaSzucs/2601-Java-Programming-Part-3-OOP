import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class BookStore {
    public static void main(final String[] args) {
        List<String> titles;
        titles = new ArrayList<>();
        // Array of data
        String[] data = {"Anna Karenina", "Madame Bovary", "War and Peace", "The Great Gatsby",                                    "Lolita", "Middlemarch",  "The Adventures of Huckleberry Finn",
                "The Stories of Anton Chekhov", "In Search of Lost Time", "Hamlet"};
        titles = Arrays.stream(data).toList();
        titles.forEach(title -> {
            if(title.length() < 10) {
                System.out.println(title);
            }
        });
        titles.forEach(t -> {
            if(t.contains("of")) {
                System.out.println(t);
            }
        });
        // A lambda expression is a method
        // If you add the data type then you will need brackets around the parameter
        titles.forEach((String bookTitle) -> {
            System.out.println("hi " + bookTitle);
            // You cannot return something
        });
    }
}