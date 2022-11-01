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
    public static void main(final String[] args) {

        System.out.println("The following arguments were passed with size " + args.length);
        for (String arg : args) {
            System.out.println(arg);
        }

        // output.txt
        // args[] = {"output.txt"}

        /**
         number of args = 1
         validation checks:
         if empty, more than one, extension, number of characters <= 20 chars

         split; .txt

         invalid file name exception if
         > 20 characters or
         not .txt extension

         Missin file exception if
         doesnt have a name
         */

        // Validation checks for command line args
        String param = args[0];
        if (!param.substring(param.length() - 4).equals(".txt")) {
            // throw an error
            throw new InvalidFileName("Extension of the given file is unsupported.");
        } // .txt
        if (param.length() > 20) throw new InvalidFileName("Filename should be 20 characters or less");

        try {
            validateMissingFile(args);
        } catch (final MissingFileName e) {
            System.out.println(e.getMessage());
        }
        // if empty before .txt

        // confirm with prof
        if(args.length > 1) {
            throw new InvalidFileName("There are too many file names entered");
        }

        System.out.println("*************");

        FileReader reader;
        Scanner scanner;

        Scanner scannerTwo;
        FileReader readerTwo;
        FileReader readerThree;

        int count = 0;

        // Part 1
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
        } catch (final IOException ex) {
            System.out.println(ex.getMessage());
        }  finally {
            //
        }

        // Part 2
        System.out.println("Executing part 2");

        FileWriter writerTwo;
        try {
            writerTwo = new FileWriter(args[0], true);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        try {
            File f1=new File("firstnames.txt"); //Creation of File Descriptor for input file
            FileReader fr = new FileReader(f1);  //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object

            String s;

            while(( s = br.readLine()) != null) {

                File f2=new File("fullnames.txt"); //Creation of File Descriptor for input file
                FileReader fr2 = new FileReader(f2);  //Creation of File Reader object
                BufferedReader br2 = new BufferedReader(fr2); //Creation of BufferedReader object
                String S2;

                String linePartTwo = br2.readLine(); // full name grabed from fullnames.txt
                //System.out.println("test");
                while(linePartTwo != null) {
                    String[] split = linePartTwo.split(("\t"));

                    System.out.println("the split is " + split[0]);

                    if(split[0].equalsIgnoreCase(s)) {
                        System.out.println("The line matched is : " + split[0]); // just a debugging output for console
                        // write this name to the file given by the user eg. output.txt
                        FileWriter writerOutput = null;
                        writerOutput = new FileWriter(args[0], true);
                        writerOutput.write(s + "\n");
                        writerOutput.close();
                        break;
                    }
                    // } else {
                    //     System.out.println("Could not match " + s);
                    // }

                    linePartTwo = br2.readLine();
                }
            }

        } catch (final IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            //
        }
    }

    private static void validateMissingFile(String args[]) throws MissingFileName {
        if (args.length < 1) {
            throw new MissingFileName("Filename is missing from command line arguments.");
        } // throw an error
        if(args[0].equals(".txt")) {
            throw new MissingFileName("The file name is missing. It only contains the extension.");
        }
        // eg. filename = .txt
        // size == 4 | if string.equals(".txt")
    }
}

/*
    1. Create files named by firsname as appears in firstname.txt
    2. Output names that only appear in BOTH firstname.txt AND fullnames.txt
        output to file provided by the user as an argument during runtime
        eg. java main.java output.txt
*/