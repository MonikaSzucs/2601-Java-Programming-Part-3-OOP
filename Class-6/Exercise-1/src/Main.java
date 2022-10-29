import java.sql.SQLOutput;

public class Main {
    public static void main(final String[] args) {

        Person p;
        try{
            p = new Person(100.0);
            System.out.println("enjoy");
            System.out.println(p);
        } catch( final IllegalWeightException e) {
            System.out.println(e.getMessage());
        } finally {
            //
        }

    }
}
