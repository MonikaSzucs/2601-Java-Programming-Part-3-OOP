package ca.bcit.comp2601.assignment1.monikaszucs;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * School.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Assignment 1
 *
 * @author Monika Szucs
 * @version 1.1
 *
 */
public class School {
    private List<Person> person;

    /**
     * The school constructor
     */
    School() {
        person = new ArrayList<>();
    }

    /**
     * @param p the person
     * @throws IllegalPersonException throwing an illegal person exception if there is an error
     */
    public void register(final Person p) throws IllegalPersonException {
        if(p == null) {
            throw new IllegalPersonException("cannot register a non-person");
        }
        person.add(p);
    }

    /**
     * The print roster that prints out the individuals information
     */
    public void printRoster(){
        for(Person p: person)
        {
            System.out.println(p.toString());
        }
    }

    /**
     * Method to print out the age and years of the person
     */
    public void printAgesAndYears() {

        Writeable w = (name,yearWasBorn,maxYear) -> { 
            for (int i = yearWasBorn; i <= maxYear; i++) {
                int age = i - yearWasBorn;
                // year born = 2000
                // i = 2001
                // i - year born = 1
                //Tiger Woods: 1975 (age 0)
                // System.out.println(name + ": " + i + " (age " + age + ")");
                System.out.print(name + ": " + i + " (age " + age + ")" + System.lineSeparator());

                // TODO: print above sout to a file
                
                // FileReader reader;
                // FileWriter writer;
                // Scanner scanner;

                // try
                // {
                //     writer = new FileWriter("testing-output2.txt", true);
                //     writer.write(name + ": " + i + " (age " + age + ")" + System.lineSeparator());
                //     writer.close();
                // }
                // catch(final IOException e)
                // {
                //     System.out.println(e.getMessage());
                // }
                
            }
            // System.out.println(name + ": " + yearWasBorn + " (age " + age + ")");
        };

        for(Person p: person) {
            /*int age;
            int currentYear;

            age = 0;

            for(int i = p.born.getYear(); i <= 2022; i++){
                if(!p.isAlive() && i > p.died.getYear()){
                    break;
                }
                currentYear = age + p.born.getYear();
                w.printData(p.name.getPrettyName(), i, currentYear);
                
                //w(p.name.getPrettyName(), i, 2022);
                // System.out.println(p.name.getPrettyName() + ": " + currentYear + " (age " + age + ")");
                age++;
            }
            */
            int yearToPass = p.isAlive() ? 2022 : p.getDateOfDeath().getYear();
            w.printData(p.name.getPrettyName(), p.getDateOfBirth().getYear(), yearToPass);
        }
    }

    /**
     * The method that saves the details of the people in a text file
     */
    public void saveDetails() {
        try {
            FileWriter f;
            f = new FileWriter("people.txt");
            for(Person p: person) {
                String returnValue;

                returnValue = p.name.getPrettyName() + " (" + p.name.getInitials() + ")";
                returnValue += " was born on " + p.born.getDayOfTheWeek()+ " " + p.born.getYyyyMmDd();

                if(!p.isAlive()){
                    returnValue += " and died on " + p.died.getDayOfTheWeek() + " " + p.died.getYyyyMmDd();
                }

                returnValue += "." + System.lineSeparator();
                // returnValue += "\n";

                f.write(returnValue);
            }
            f.close();
        } catch(final IOException e) {
            System.out.println("NO");
        } finally {
            // nothing to do
        }
    }

    /**
     * @param fullName the first and last name of the person
     * @param yearBorn the year when the person was born
     * @param maximumYear to the current date the person died or current year
     */
    public void printData(final String fullName, final int yearBorn, final int maximumYear) {
        
        Writeable w = (name,yearWasBorn,maxYear) -> {
            for(int i = yearWasBorn; i < maxYear; i++){
                FileReader reader;
                FileWriter writer;
                Scanner scanner;

                try
                {
                    writer = new FileWriter("test-writeable.txt", true);
                    writer.write(fullName);
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
