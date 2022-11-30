import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CountryList.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Assignment 2
 *
 * @author Monika Szucs and Guilherme Trevisan
 * @version 1.1
 *
 */
class CountryList {
    private List<CountryProcessor> countryProcessor;

    CountryList() throws FileNotFoundException {
        countryProcessor = new ArrayList<>();

        Scanner scanner;
        scanner = new Scanner(new File("files\\data_lab09.csv"), StandardCharsets.ISO_8859_1.toString());

        while(scanner.hasNextLine()) {
            String line;
            CountryProcessor newCountryProcessor;
            line = scanner.nextLine();
            System.out.println(line);

            // if you just have only one if the just do if not an empty else
//            if (newCountryProcessor != null){
//                countryProcessor.add(newCountryProcessor);
//            }
            System.out.println();
            if(Integer.parseInt(line) == 1) {
                System.out.println("value of 1");
            }
        }
        scanner.close();
    }



}
