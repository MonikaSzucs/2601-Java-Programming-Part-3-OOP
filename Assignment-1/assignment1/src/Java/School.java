import java.io.File;
import java.util.ArrayList;
import java.util.List;

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

    public void printAgesAndYears(final String fullName, final int yearBoard, final int maxYear) {
        System.out.println();
        File file = new File("test-writeable.txt");
    }

    public void saveDetails() {

    }
}
