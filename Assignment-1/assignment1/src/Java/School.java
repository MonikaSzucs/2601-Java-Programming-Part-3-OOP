import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    private List<Person> person;

    School() {
        person = new ArrayList<>();

    }

    public void register(final Person p) throws IllegalPersonException {
        if(p == null) {
            throw new IllegalPersonException("cannot be null");
        }
        person.add(p);
    }

    public void printRoster(){
        System.out.println(toString());
    }

    public void printAgesAndYears() {
        System.out.println();
        File file = new File("test-writeable.txt");

        try {
            FileWriter w;
            w = new FileWriter("books.txt");
            w.write("The four-hour workweek");
            w.close();
        } catch(final IOException e) {
            System.out.println("NO");
        } finally {
            // nothing to do
        }
    }

    public void saveDetails() {

    }

    public void printData(final String description, final int min, final int max) {

        Writeable w = (d,mi,mx) -> {
            for(int i = mi; i < mx; i++){
                FileReader reader;
                FileWriter writer;
                Scanner scanner;

                try
                {
                    writer = new FileWriter("test-writeable.txt", true);
                    writer.write(description);
                    writer.close();
                }
                catch(final IOException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        };




//        printDate(()-> {
//            for(int i = min; i < max; i++)
//            {
//                FileReader reader;
//                FileWriter writer;
//                Scanner scanner;
//
//                try
//                {
//                    writer = new FileWriter("test-writeable.txt", true);
//                    writer.write(description);
//                    writer.close();
//                }
//                catch(final IOException e)
//                {
//                    System.out.println(e.getMessage());
//                }
//            }
//        });
    }
}
