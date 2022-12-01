import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    private static final int STARTING_LOOP;

    static {
        STARTING_LOOP  = 0;
    }

    public static void main(final String[] args) {

//        for (String arg : args) {
//            System.out.println(arg);
//        }

        FileWriter writerOne;
        int argsLength = args.length;
        //System.out.println(argsLength);

        try {
            writerOne = new FileWriter("data.txt", true);

            for(int i = STARTING_LOOP; i < argsLength; i++) {
                writerOne.write(args[i] + "\n");
            }
            writerOne.close();

        } catch(final Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //
        }

        File fileOne;
        FileReader reader;
        Scanner scanner;

        try {
            fileOne = new File("data.txt");
            scanner = new Scanner(fileOne);

            while(scanner.hasNextLine()) {
                String line;
                line = scanner.nextLine();
                System.out.println(line.toUpperCase());
            }

        } catch(final Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
