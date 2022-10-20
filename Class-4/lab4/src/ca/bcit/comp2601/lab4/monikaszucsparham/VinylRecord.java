package ca.bcit.comp2601.lab4.monikaszucsparham;

/**
 * VinylRecord.java
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
class VinylRecord extends MusicMedia {
    private String title;
    private String artist;
    private int numberOfTracks;
    private int sizeInches;
    private int weightInGrams;

    private static final int MIN_NUMBER_OF_TRACKS = 0;

    private static final int VINYL_RECORD_SIZE_INCHES_LARGE = 12;
    private static final int VINYL_RECORD_SIZE_INCHES_MEDIUM = 10;
    private static final int VINYL_RECORD_SIZE_INCHES_SMALL = 7;

    private static final int VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_LARGE = 200;
    private static final int VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_MEDIUM = 180;
    private static final int VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_SMALL = 140;

    private static final int VINYL_RECORD_SIZE_MEDIUM_WEIGHT_GRAMS = 100;
    private static final int VINYL_RECORD_SIZE_SMALL_WEIGHT_GRAMS = 100;

    /**
     * @param title the title of the song
     * @param artist the artist of the song
     * @param numberOfTracks the number of tracks
     * @param sizeInches the size of the vinyl record
     * @param weightInGrams the weight of the vinyl record
     */
    VinylRecord(final String title, final String artist, final int numberOfTracks, final int sizeInches, final int weightInGrams) {
        super(title, artist);

        if(numberOfTracks <= MIN_NUMBER_OF_TRACKS) {
            throw new IllegalArgumentException("The number of tracks is invalid");
        }
        switch (sizeInches) {
            case VINYL_RECORD_SIZE_INCHES_LARGE:
                if(weightInGrams == VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_SMALL || weightInGrams == VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_MEDIUM || weightInGrams == VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_LARGE) {
                    this.weightInGrams = weightInGrams;
                } else {
                    throw new IllegalArgumentException("This is not the correct weight for the disk size");
                }
                break;
            case VINYL_RECORD_SIZE_INCHES_MEDIUM:
                if(weightInGrams == VINYL_RECORD_SIZE_MEDIUM_WEIGHT_GRAMS) {
                    this.weightInGrams = weightInGrams;
                } else {
                    throw new IllegalArgumentException("This is not the correct weight for the disk size");
                }
                break;
            case VINYL_RECORD_SIZE_INCHES_SMALL:
                if(weightInGrams == VINYL_RECORD_SIZE_SMALL_WEIGHT_GRAMS) {
                    this.weightInGrams = weightInGrams;
                } else {
                    throw new IllegalArgumentException("This is not the correct weight for the disk size");
                }
                break;
            default:
                throw new IllegalArgumentException("The size of 12, 10, or 7 was not found");
        }
        this.sizeInches = sizeInches;
        this.numberOfTracks = numberOfTracks;
    }

    /**
     * @param numberOfTracks setting the number of tracks on the vinyl record
     */
    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    /**
     * @param sizeInches setting the size of the vinyl record
     */
    public void setSizeInches(int sizeInches) {
        this.sizeInches = sizeInches;
    }

    /**
     * @param weightInGrams setting the weight of the vinyl record
     */
    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    /**
     * @return getting the number of tracks on the vinyl record
     */
    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    /**
     * @return getting the size of the vinyl record
     */
    public int getSizeInches() {
        return sizeInches;
    }

    /**
     * @return getting weight of the vinyl record in grams
     */
    public int getWeightInGrams() {
        return weightInGrams;
    }

    /**
     * @return the to string containing information of the vinyl record
     */
    @Override
    public String toString() {
        return "VinylRecord{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", numberOfTracks=" + numberOfTracks +
                ", sizeInches=" + sizeInches +
                ", weightInGrams=" + weightInGrams +
                '}';
    }

    /**
     * Playing the vinyl record
     */
    public void play() {
        System.out.println("The track being played currently: " + title + "-"+ artist + ". The number of tracks on the record is " + numberOfTracks);
    }
}

/*
main () {
    Human.numebrofeyes
}
*/