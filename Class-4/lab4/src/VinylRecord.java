class VinylRecord extends MusicMedia {
    private String title;
    private String artist;
    private int numberOfTracks;
    private int sizeInches;
    private int weightInGrams;


    VinylRecord(final String title, final String artist, final int numberOfTracks, final int sizeInches, final int weightInGrams) {
        super(title, artist);

        if(numberOfTracks <= 0) {
            throw new IllegalArgumentException("The number of tracks is invalid");
        }
        switch (sizeInches) {
            case 12:
                if(weightInGrams == 140 || weightInGrams == 180 || weightInGrams == 200) {
                    this.weightInGrams = weightInGrams;
                } else {
                    throw new IllegalArgumentException("This is not the correct weight for the disk size");
                }
                break;
            case 10:
                if(weightInGrams == 100) {
                    this.weightInGrams = weightInGrams;
                } else {
                    throw new IllegalArgumentException("This is not the correct weight for the disk size");
                }
                break;
            case 7:
                if(weightInGrams == 40) {
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

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    public void setSizeInches(int sizeInches) {
        this.sizeInches = sizeInches;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public int getSizeInches() {
        return sizeInches;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

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

    public void play() {
        System.out.println("The track being played currently: " + title + "-"+ artist + ". The number of tracks on the record is " + numberOfTracks);
    }
}

/*
main () {
    Human.numebrofeyes
}
*/