class VinylRecord {
    private int numberOfTracks;
    private int sizeInches;
    private int weightInGrams;

    VinylRecord(final int numberOfTracks, final int sizeInches, final int weightInGrams) {
        if(numberOfTracks <= 0) {
            throw new IllegalArgumentException("The number of tracks is invalid");
        }
        if(sizeInches == 12 || sizeInches == 10 || sizeInches == 7) {
            if(weightInGrams == 140 || weightInGrams == 180 || weightInGrams == 200) {
                this.weightInGrams = weightInGrams;
            } else {
                throw new IllegalArgumentException("The size in inches is invalid");
            }

            if(weightInGrams == 100) {
                this.weightInGrams = weightInGrams;
            } else {
                throw new IllegalArgumentException("The size in inches is invalid");
            }

            if(weightInGrams == 40) {
                this.weightInGrams = weightInGrams;
            } else {
                throw new IllegalArgumentException("The size in inches is invalid");
            }

            this.sizeInches = sizeInches;
        }

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
                "numberOfTracks=" + numberOfTracks +
                ", sizeInches=" + sizeInches +
                ", weightInGrams=" + weightInGrams +
                '}';
    }
}
