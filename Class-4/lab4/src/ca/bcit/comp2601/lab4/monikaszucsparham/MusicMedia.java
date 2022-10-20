package ca.bcit.comp2601.lab4.monikaszucsparham;

/**
 * MusicMedia.java
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
abstract class MusicMedia {
    private String songTitle;
    private String artist;

    /**
     * @param songTitle the title of the song
     * @param artist the artist of the song
     */
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

    /**
     * @param songTitle setting the title of the song
     */
    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    /**
     * @param artist setting the artist of the song
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the song title
     */
    public String getSongTitle() {
        return songTitle;
    }

    /**
     * @return getting the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @return the string of music media
     */
    @Override
    public String toString() {
        return "MusicMedia{" +
                "songTitle='" + songTitle + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }

    abstract void play();
}
