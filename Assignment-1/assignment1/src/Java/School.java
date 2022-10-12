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
            throw new IllegalPersonException("cannot register a non-person");
        }
        person.add(p);
    }

    public void printRoster(){

        for(Person p: person)
        {
            System.out.println(p.toString());
        }
    }

    public void printAgesAndYears() {
        //System.out.println();
        //Tiger Woods: 1975 (age 0)
        for(Person p: person)
        {
            int age =0;
            int currentYear;
            for(int i=p.born.getYear();i<=2022;i++){
                if(!p.isAlive()&&i>p.died.getYear()){
                    break;
                }
                currentYear= age+p.born.getYear();
                System.out.println(p.name.getPrettyName() + ": " + currentYear + " (age " + age+")");
                age++;

            }
        }

//        File file = new File("test-writeable.txt");
//
//        try {
//            FileWriter w;
//            w = new FileWriter("books.txt");
//            w.write("The four-hour workweek");
//            w.close();
//        } catch(final IOException e) {
//            System.out.println("NO");
//        } finally {
//            // nothing to do
//        }
    }

    public void saveDetails() {
        try {
            FileWriter f;
            f = new FileWriter("people.txt");
            for(Person p: person) {
                //"Albert Einstein (A.E.) was born on Friday 1879-03-14 and died on Monday 1955-04-18.
                String returnValue = p.name.getPrettyName() + " (" + p.name.getInitials() + ")";
                returnValue+=" was born on "+p.born.getDayOfTheWeek()+ " "+p.born.getYyyyMmDd();
                if(!p.isAlive()){
                    returnValue+=" and died on "+p.died.getDayOfTheWeek()+ " " + p.died.getYyyyMmDd();
                }
                returnValue+=".System.lineSeparator()";
                //p.name=
                f.write(returnValue);
            }
            f.close();
        } catch(final IOException e) {
            System.out.println("NO");
        } finally {
            // nothing to do
        }

//        Person temp;
//        if(p.getClass()!= Person.class){
//            temp = new Person(p.getDateOfBirth(),p.name);
//            if(!p.isAlive()) {
//                temp.die(p.getDateOfDeath());
//            }
//        }
//        else{
//            temp = p;
//        }
//        System.out.println(temp.toString());
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
    }
}
