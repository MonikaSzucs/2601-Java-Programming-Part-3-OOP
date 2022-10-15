class CompactDisc extends MusicMedia {
    private int numberOfTracksOnTheCd;
    public static final String READING_METHOD;

    static
    {
        READING_METHOD = "laser";
    }

    CompactDisc(final String title, final String artist, final int numberOfTracksOnTheCd) {
        super(title, artist);
        if(numberOfTracksOnTheCd <= 0) {
            throw new IllegalArgumentException("The value is bad.");
        }
        this.numberOfTracksOnTheCd = numberOfTracksOnTheCd;
    }

    public int getNumberOfTracksOnTheCd() {
        return numberOfTracksOnTheCd;
    }

    public void setNumberOfTracksOnTheCd(int numberOfTracksOnTheCd) {
        this.numberOfTracksOnTheCd = numberOfTracksOnTheCd;
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "numberOfTracksOnTheCd=" + numberOfTracksOnTheCd +
                '}';
    }
}
