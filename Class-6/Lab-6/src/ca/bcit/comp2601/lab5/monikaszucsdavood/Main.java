package ca.bcit.comp2601.lab5.monikaszucsdavood;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Main.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Lab #5
 *
 * @author Monika Szucs
 * @author Davood
 * @version 1.1
 *
 */
public class Main {
    public static void main(final String[] args) throws IOException {
        FileWriter writer = null;
        FileReader reader;
        Scanner scanner;

        try{
            reader = new FileReader("firstnames.txt");
            scanner = new Scanner(reader);

            while(scanner.hasNextLine()) {
                String line;
                line = scanner.nextLine();
                System.out.println(line);
                writer = new FileWriter(line + ".txt", true);
                writer.write(line);
            }

        } catch (final IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            writer.close();
        }
    }
}
