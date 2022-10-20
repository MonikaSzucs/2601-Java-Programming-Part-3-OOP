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
        //final String title, final String artist, final int numberOfTracksOnTheCd
        CompactDisc compactDiskOne = new CompactDisc("title 1", "artist", 3);

        compactDiskOne.play();
    }

}
