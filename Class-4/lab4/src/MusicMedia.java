abstract class MusicMedia {
    private String songTitle;
    private String artist;

    MusicMedia(final String songTitle, final String artist) {
        if(songTitle == null || songTitle.isBlank()) {
            throw new IllegalArgumentException("Improper title entered");
        }
        if(artist == null || artist.isBlank()) {
            throw new IllegalArgumentException("Improper artist");
        }
        this.songTitle = songTitle;
        this.artist = artist;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "MusicMedia{" +
                "songTitle='" + songTitle + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
