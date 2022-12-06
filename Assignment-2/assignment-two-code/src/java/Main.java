import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(System.in);

        int i = 0;
        boolean proceed = true;

        while(proceed) {
            System.out.println("Type 1 for GUI");
            System.out.println("Type 2 for Streams and Filters");
            System.out.println("Type 3 for Design Patterns");
            System.out.println("Type 4 for Concurrency");
            System.out.println("Type 5 for Quit");

            i = reader.nextInt();
            System.out.println(i);

            if(i == 1) {
                Scanner file;
                file = new Scanner(new File("files\\countries-and-capitals.txt"));

                while(file.hasNextLine()) {
                    // Read a line
                    String line = file.nextLine();
                    System.out.println(line);

                    // Split the line string into tokens
                    String[] countryCapitalList = line.split(",");
                    System.out.println(countryCapitalList[0]);

                    String country =countryCapitalList[0];
                    String capital = countryCapitalList[1];


                    // Create an instance of Course and add to the array list
                    CountryList.newCountryCapitalList.add(new CountryCapital(country, capital));

                }

                // Close the file
                file.close();

                CountryList app = new CountryList();

            } else if(i == 2) {
                CountryProcessor cp;
                cp = new CountryProcessor("All the Countries and Capitals in the world");

                System.out.println();
                System.out.println("Printing the longest capital city");
                CountryProcessor.printLongestCapitalCity();

                System.out.println();
                System.out.println("Printing the shortest country name");
                CountryProcessor.printShortestCountryName();

                System.out.println();
                System.out.println("Printing all the countries starting with the letter a");
                CountryProcessor.printAllCountriesStartingWith("a");

                System.out.println();
                System.out.println("Printing the longest combination of country and capital name");
                CountryProcessor.printLongestCombination();

                System.out.println();
                System.out.println("Printing the number of letters in all country names put together");
                CountryProcessor.printHowManyLettersInCountries();

                System.out.println();
                System.out.println("Printing capitals with a certain number of letters");
                CountryProcessor.printCapitalsWithThisManyLetters(4, 5);

                System.out.println();
                System.out.println("Printing all countries that do not end with a certain letter");
                CountryProcessor.printAllCountriesThatDoNotEndWith('n');

                System.out.println();
                System.out.println("Printing all capitals that contain the letter into a single string with no space");
                CountryProcessor.printAllCapitalsThatContainLetterIntoASingleStringNoSpaces('z');
            } else if(i == 3) {
                Tester.test();
            } else if(i == 4) {
                concurrentMain();
            } else if(i == 5) {
                proceed = false;
            } else {
                System.out.println("Please make sure you enter a number between 1 and 5 (inclusive)");
            }
        }
        reader.close();
    }



    public static void concurrentMain() {
        try (Scanner input = new Scanner(System.in)) {
            int rangeStart, rangeEnd, numberOfThreads;
            do {
                System.out.print("Enter the range start: ");
                rangeStart = input.nextInt();

                System.out.print("Enter the range end: ");
                rangeEnd = input.nextInt();

                System.out.print("Enter the number of threads: ");
                numberOfThreads = input.nextInt();

                if (rangeStart >= rangeEnd || numberOfThreads < 1) {
                    System.out.println("Warning: range start should be less then range end. Also number of threads should not be less then 1.");
                }
            } while (rangeStart >= rangeEnd || numberOfThreads < 1);


            int sum = DivideAndConquerSum.sum(rangeStart, rangeEnd, numberOfThreads);

            System.out.println(String.format("Sum of numbers in the range [%s, %s] found in %s threads is %s",
                    rangeStart, rangeEnd, numberOfThreads, sum));
        }
    }
}
