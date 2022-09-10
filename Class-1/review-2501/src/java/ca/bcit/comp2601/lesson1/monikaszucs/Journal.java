package ca.bcit.comp2601.lesson1.monikaszucs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Journal {
    public static void main(final String[] args) {

        // write to file (in project folder)
        try {
            FileWriter f;
            f = new FileWriter("books.txt");
            f.write("The four-hour workweek");
            f.close();
        } catch(final IOException e) {
            System.out.println("NO");
        } finally {
            // nothing to do
        }

        // Good principle to add an else to an if statement even if you aren't planning to use it. Just say there is nothing to do.
        if(5 == 5) {

        } else if(5 > 6) {

        } else {
            // nothing to do
        }

        // read the file
        try {
            File    file;
            Scanner s;

            file    = new File("books.txt");
            s       = new Scanner(file);

            while(s.hasNext()) {
                String oneLine;
                oneLine = s.nextLine();
                System.out.println("Found a line " + oneLine);
            }
            s.close();
        } catch(final FileNotFoundException e) {
            System.out.println(":(");
        } finally {
            // close files, log errors, release resources ( to free memory up )
        }


    }
}
