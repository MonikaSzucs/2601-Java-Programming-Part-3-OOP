package ca.bcit.comp2601.lab5.monikaszucsdavood;

import java.io.*;
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

        FileReader reader;
        Scanner scanner;

        Scanner scannerTwo;
        FileReader readerTwo;
        FileReader readerThree;

        int count = 0;

        try{
            reader = new FileReader("firstnames.txt");
            scanner = new Scanner(reader);
            readerTwo = new FileReader("firstnames.txt");
            readerThree = new FileReader("fullnames.txt");
            scannerTwo = new Scanner(readerThree);

            String currentLine;

            File f1=new File("C:\\Users\\mszuc\\Desktop\\2601-Java-Programming-Part-3-OOP\\Class-6\\Lab-6-version-2\\firstnames.txt"); //Creation of File Descriptor for input file
            String[] words=null;  //Intialize the word Array
            FileReader fr = new FileReader(f1);  //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
            String s;

            String input="Jason";

            while(scanner.hasNextLine()) {
                FileWriter writer = null;
                String line;
                line = scanner.nextLine();
                //System.out.println(line);
                //System.out.println(line.length());
                writer = new FileWriter("C:\\Users\\mszuc\\Desktop\\2601-Java-Programming-Part-3-OOP\\Class-6\\Lab-6-version-2\\scanned\\" + line + ".txt", true);
                for(int i = 0; i < line.length(); i++) {
                    writer.write(line + "\n");
                }
                count++;
                writer.close();
            }

            System.out.println(count);
            while(( s = br.readLine()) != null) {
                FileWriter writer = null;
                String line;
                line = scannerTwo.nextLine();
                System.out.println(line);
                writer = new FileWriter("C:\\Users\\mszuc\\Desktop\\2601-Java-Programming-Part-3-OOP\\Class-6\\Lab-6-version-2\\output.txt", true);

                words = s.split("");
                System.out.println(s);
                if(line.contains(s)) {
                    System.out.println(s);
                    System.out.println(line);
                    writer.write(line + "\n");
                }
                //System.out.println("**************");
                //System.out.println(s);

//                while (scannerTwo.hasNextLine()) {
//
//                    // Now, check if this line contains our keyword. If it does, print the line
//                    if(line.contains(s)) {
//                        System.out.println(s);
//                        System.out.println(line);
//                        writer.write(line + "\n");
//                    }
//                }

                writer.close();
            }

        } catch (final IOException ex) {
            System.out.println(ex.getMessage());
        }  finally {
            //
        }

//        try{
//            readerTwo = new FileReader("fullnames.txt");
//            scannerTwo = new Scanner(readerTwo);
//
//            while(scannerTwo.hasNextLine()) {
//                String line;
//                line = scannerTwo.nextLine();
//                System.out.println(line);
//            }
//
//        } catch (final IOException ex) {
//            System.out.println(ex.getMessage());
//        }  finally {
//            //
//        }
    }
}
