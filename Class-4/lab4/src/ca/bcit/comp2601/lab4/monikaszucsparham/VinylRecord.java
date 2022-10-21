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

    private static final int EMPTY;

    private static final int VINYL_RECORD_SIZE_INCHES_LARGE = 12;
    private static final int VINYL_RECORD_SIZE_INCHES_MEDIUM = 10;
    private static final int VINYL_RECORD_SIZE_INCHES_SMALL = 7;

    private static final int VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_LARGE;
    private static final int VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_MEDIUM;
    private static final int VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_SMALL;

    private static final int VINYL_RECORD_SIZE_MEDIUM_WEIGHT_GRAMS;
    private static final int VINYL_RECORD_SIZE_SMALL_WEIGHT_GRAMS;

    static {
        EMPTY = 0;
        VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_LARGE = 200;
        VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_MEDIUM = 180;
        VINYL_RECORD_SIZE_LARGE_WEIGHT_GRAMS_SMALL = 140;
        VINYL_RECORD_SIZE_MEDIUM_WEIGHT_GRAMS = 100;
        VINYL_RECORD_SIZE_SMALL_WEIGHT_GRAMS = 100;
    }

    /**
     * @param title the title of the song
     * @param artist the artist of the song
     * @param numberOfTracks the number of tracks
     * @param sizeInches the size of the vinyl record
     * @param weightInGrams the weight of the vinyl record
     */
    VinylRecord(final String title, final String artist, final int numberOfTracks, final int sizeInches, final int weightInGrams) {
        super(title, artist);

        if(numberOfTracks <= EMPTY) {
            throw new IllegalArgumentException("The number of tracks is invalid");
        }

        validatedSizeInInches(sizeInches);
        validatedWeightInGrams(weightInGrams);

        this.weightInGrams = weightInGrams;
        this.sizeInches = sizeInches;
        this.numberOfTracks = numberOfTracks;
    }

    /**
     * @param sizeInches validating the size in inches
     */
    private void validatedSizeInInches(final int sizeInches) {
        if(sizeInches == 12 || sizeInches == 10 || sizeInches == 8) {
            this.sizeInches = sizeInches;
        } else {
            throw new IllegalArgumentException("Invalid file size: " + sizeInches);
        }
    }

    /**
     * @param weightInGrams validating the weight of the vinyl record in grams
     */
    private void validatedWeightInGrams(final int weightInGrams) {
        switch (this.sizeInches) {
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
                "title='" + super.getSongTitle() + '\'' +
                ", artist='" + super.getArtist() + '\'' +
                ", numberOfTracks=" + numberOfTracks +
                ", sizeInches=" + sizeInches +
                ", weightInGrams=" + weightInGrams +
                '}';
    }

    /**
     * Playing the vinyl record
     */
    public void play() {
        System.out.println("The track being played currently: " + super.getSongTitle() + "-"+ super.getArtist() + ". The number of tracks on the record is " + numberOfTracks);
    }
}
