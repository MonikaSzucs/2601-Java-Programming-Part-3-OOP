
import java.io.*;
import java.util.Arrays;
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

        FileReader firstFileRead;
        FileReader secondFileRead;

        Scanner scannerOne;
        Scanner scannerTwo;

        int count = 0;
        FileWriter writer;
        writer = new FileWriter("output.txt", true);

        try{
            firstFileRead = new FileReader("firstnames.txt");
            secondFileRead = new FileReader("fullnames.txt");
            scannerOne = new Scanner(firstFileRead);
            scannerTwo = new Scanner(secondFileRead);

            File f1=new File("firstnames.txt"); //Creation of File Descriptor for input file
            FileReader fr = new FileReader(f1);  //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object

            String s;

            while(( s = br.readLine()) != null) {

                File f2=new File("fullnames.txt"); //Creation of File Descriptor for input file
                FileReader fr2 = new FileReader(f2);  //Creation of File Reader object
                BufferedReader br2 = new BufferedReader(fr2); //Creation of BufferedReader object
                String S2;

                String line = br2.readLine();

                while(line != null) {
                    String[] split = line.split(("\\s"));

                    for(int i=0; i < split.length; i++) {

                        if(split[i].equalsIgnoreCase(s)) {
                            System.out.println(split[i]);
                        }
                    }

                    line = br2.readLine();
                }
            }


        } catch (final IOException ex) {
            System.out.println(ex.getMessage());
        }  finally {
            //
        }
    }
}
