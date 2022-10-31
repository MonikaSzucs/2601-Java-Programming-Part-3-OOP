
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

        FileReader firstFileRead;
        FileReader secondFileRead;

        Scanner scannerOne;
        Scanner scannerTwo;

        int count = 0;

        try{
            firstFileRead = new FileReader("firstnames.txt");
            secondFileRead = new FileReader("fullnames.txt");
            scannerOne = new Scanner(firstFileRead);
            scannerTwo = new Scanner(secondFileRead);

            File f1=new File("C:\\Users\\mszuc\\Desktop\\2601-Java-Programming-Part-3-OOP\\Class-6\\Lab-6-version-2\\firstnames.txt"); //Creation of File Descriptor for input file
            FileReader fr = new FileReader(f1);  //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object

            String s;


            while(( s = br.readLine()) != null) {
                FileWriter writer;
                writer = new FileWriter("C:\\Users\\mszuc\\Desktop\\2601-Java-Programming-Part-3-OOP\\Class-6\\Lab-6-version-2\\output.txt", true);

                File f2=new File("C:\\Users\\mszuc\\Desktop\\2601-Java-Programming-Part-3-OOP\\Class-6\\Lab-6-version-2\\fullnames.txt"); //Creation of File Descriptor for input file
                FileReader fr2 = new FileReader(f2);  //Creation of File Reader object
                BufferedReader br2 = new BufferedReader(fr2); //Creation of BufferedReader object
                String s2;

                for (String item:  br2.readLine().split("\\s+")) {
                    //System.out.println(s);
                    //System.out.println(item);
                    if (item.equals(s)) {
                        System.out.println(s);
                        System.out.println(item);
                        writer.write(item + "\n");
                    }
                }

                writer.close();
                //System.out.println("**********************************************************");
            }


        } catch (final IOException ex) {
            System.out.println(ex.getMessage());
        }  finally {
            //
        }
    }
}
