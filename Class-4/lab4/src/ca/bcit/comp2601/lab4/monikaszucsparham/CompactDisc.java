package ca.bcit.comp2601.lab4.monikaszucsparham;

/**
 * CompactDisc.java
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
class CompactDisc extends MusicMedia {
    private int numberOfTracksOnTheCd;
    private static final String READING_METHOD;
    private static final int MIN_NUMBER_OF_TRACKS_ON_THE_CD;

    static
    {
        READING_METHOD                  = "laser";
        MIN_NUMBER_OF_TRACKS_ON_THE_CD  = 0;
    }

    /**
     * @param title the title of the song
     * @param artist the artist for the song
     * @param numberOfTracksOnTheCd the number of tracks on the CD
     */
    CompactDisc(final String title, final String artist, final int numberOfTracksOnTheCd) {
        super(title, artist);
        if(numberOfTracksOnTheCd <= MIN_NUMBER_OF_TRACKS_ON_THE_CD) {
            throw new IllegalArgumentException("The value is bad.");
        }
        this.numberOfTracksOnTheCd = numberOfTracksOnTheCd;
    }

    /**
     * @return setting the number of tracks on the CD
     */
    public int getNumberOfTracksOnTheCd() {
        return numberOfTracksOnTheCd;
    }

    /**
     * @param numberOfTracksOnTheCd getting the number of tracks on the CD
     */
    public void setNumberOfTracksOnTheCd(int numberOfTracksOnTheCd) {
        this.numberOfTracksOnTheCd = numberOfTracksOnTheCd;
    }

    /**
     * @return the to String of information of the compact disc
     */
    @Override
    public String toString() {
        return "CompactDisc{" +
                "numberOfTracksOnTheCd=" + numberOfTracksOnTheCd +
                '}';
    }

    /**
     * Playing the song on the compact disc
     */
    public void play() {
        System.out.println("The cd is being played");
    }
}
