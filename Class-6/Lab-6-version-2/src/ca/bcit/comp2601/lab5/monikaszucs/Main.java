package ca.bcit.comp2601.lab5.monikaszucs;


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
 * @version 1.2
 *
 */
public class Main {

    private static final int        INITIAL_ARGUMENT;
    private static final int        IMPROPER_ARGUMENT_LENGTH;
    private static final int        LENGTH_OF_PARAMETER;
    private static final int        DOT_EXTENSION_LENGTH;
    private static final int        INITIAL_COUNT;
    private static final int        STARTING_FOR_LOOP_VALUE;
    private static final int        SPLIT_SENTENCE_INITIAL_POSITION;

    static {
        INITIAL_ARGUMENT                    = 0;
        IMPROPER_ARGUMENT_LENGTH            = 1;
        LENGTH_OF_PARAMETER                 = 20;
        DOT_EXTENSION_LENGTH                = 4;
        INITIAL_COUNT                       = 0;
        STARTING_FOR_LOOP_VALUE             = 0;
        SPLIT_SENTENCE_INITIAL_POSITION     = 0;
    }

    public static void main(final String[] args) {
        FileReader reader;
        Scanner scanner;

        Scanner scannerTwo;
        FileReader readerTwo;
        FileReader readerThree;

        int count;

        count = INITIAL_COUNT;

        System.out.println("The following arguments were passed with size " + args.length);

        for (String arg : args) {
            System.out.println(arg);
        }

        String param = args[INITIAL_ARGUMENT];
        if (!param.substring(param.length() - DOT_EXTENSION_LENGTH).equals(".txt")) {
            throw new InvalidFileName("Extension of the given file is unsupported.");
        }
        if (param.length() > LENGTH_OF_PARAMETER) throw new InvalidFileName("Filename should be 20 characters or less");

        try {
            validateMissingFile(args);
        } catch (final MissingFileName e) {
            System.out.println(e.getMessage());
        }

        if(args.length > IMPROPER_ARGUMENT_LENGTH) {
            throw new InvalidFileName("There are too many file names entered");
        }


        // Part 1
        try {
            reader = new FileReader("firstnames.txt");
            scanner = new Scanner(reader);

            while(scanner.hasNextLine()) {
                FileWriter writer = null;
                String line;
                line = scanner.nextLine();
                writer = new FileWriter("C:\\Users\\mszuc\\Desktop\\2601-Java-Programming-Part-3-OOP\\Class-6\\Lab-6-version-2\\scanned\\" + line + ".txt", true);

                for(int i = STARTING_FOR_LOOP_VALUE; i < line.length(); i++) {
                    writer.write(line + "\n");
                }
                count++;
                writer.close();
            }
        } catch(final IOException ex) {
            System.out.println(ex.getMessage());
        }  finally {
            //
        }

        // Part 2
        FileWriter writerTwo;

        try {
            writerTwo = new FileWriter(args[INITIAL_ARGUMENT], true);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        try {
            File fileOne;
            FileReader fileReaderOne;
            BufferedReader bufferReaderOne;
            String singleString;

            fileOne = new File("firstnames.txt"); //Creation of File Descriptor for input file
            fileReaderOne = new FileReader(fileOne);  //Creation of File Reader object
            bufferReaderOne = new BufferedReader(fileReaderOne); //Creation of BufferedReader object

            while(( singleString = bufferReaderOne.readLine()) != null) {
                File fileTwo;
                FileReader fileReaderTwo;
                BufferedReader bufferReaderTwo;
                String linePartTwo;

                fileTwo = new File("fullnames.txt"); //Creation of File Descriptor for input file
                fileReaderTwo = new FileReader(fileTwo);  //Creation of File Reader object
                bufferReaderTwo = new BufferedReader(fileReaderTwo); //Creation of BufferedReader object
                linePartTwo = bufferReaderTwo.readLine(); // full name grabed from fullnames.txt

                while(linePartTwo != null) {
                    String[] split;

                    split = linePartTwo.split(("\t"));

                    System.out.println("the split is " + split[SPLIT_SENTENCE_INITIAL_POSITION]);

                    if(split[SPLIT_SENTENCE_INITIAL_POSITION].equalsIgnoreCase(singleString)) {
                        System.out.println("The line matched is : " + split[SPLIT_SENTENCE_INITIAL_POSITION]); // just a debugging output for console

                        FileWriter writerOutput;
                        writerOutput = null;

                        writerOutput = new FileWriter(args[INITIAL_ARGUMENT], true);
                        writerOutput.write(singleString + "\n");
                        writerOutput.close();
                        break;
                    }

                    linePartTwo = bufferReaderTwo.readLine();
                }
            }

        } catch (final IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            //
        }
    }

    private static void validateMissingFile(String args[]) throws MissingFileName {
        if (args.length < IMPROPER_ARGUMENT_LENGTH) {
            throw new MissingFileName("Filename is missing from command line arguments.");
        }
        if(args[INITIAL_ARGUMENT].equals(".txt")) {
            throw new MissingFileName("The file name is missing. It only contains the extension.");
        }
    }
}