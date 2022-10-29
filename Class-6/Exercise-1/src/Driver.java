import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(final String[] args) {
        FileWriter writer;
        FileReader reader;
        Scanner scanner;
        try{
            writer = new FileWriter("sports_teams.txt", true);
            System.out.println(System.getProperty("user.dir"));
            //writer.write("hello\nworld");
            writer.write("vancouver cunucks\nseattle kraken");
            writer.close();

            reader = new FileReader("firstnames.txt");
            scanner = new Scanner(reader);

            while(scanner.hasNextLine()) {
                String line;
                line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (final IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
        }
    }
}
