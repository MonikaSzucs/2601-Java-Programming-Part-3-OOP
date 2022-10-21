package ca.bcit.comp2601.lab4.monikaszucsparham;

/**
 * Driver.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Lab #4
 *
 * @author Monika Szucs
 * @author Parham
 * @version 1.1
 *
 */
public class Driver {
    /**
     * @param args the main argument
     */
    public static void main(String[] args) {
        MusicMedia m1;
        MusicMedia m2;
        MusicMedia m3;
        MusicMedia m4;

        // difference between m2 and m3 is m3 demonstrates "constructor chaining"
        m1 = new CompactDisc("Hotel California", "Eagles", 10);
        m2 = new AudioFile("Hotel California", "Eagles", "Eagles-Hotel_California.mp3",
                640);
        //final String title, final String artist, final String fileName, final int fileSize
        m3 = new AudioFile("Hotel California", "Eagles", "Eagles-Hotel_California.mp3", 32);
        m4 = new VinylRecord("Hotel California", "Eagles", 10, 12,
                200);

        System.out.println(m1);
        m1.play();
        System.out.println();
        System.out.println(m2);
        m2.play();
        System.out.println();
        System.out.println(m3);
        m3.play();
        System.out.println();
        System.out.println(m4);
        m4.play();
        System.out.println();

        ((AudioFile) m2).save("sample_file");
        ((AudioFile) m2).delete("sample_file");
    }

}
