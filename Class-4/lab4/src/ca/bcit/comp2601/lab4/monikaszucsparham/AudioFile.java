package ca.bcit.comp2601.lab4.monikaszucsparham;

/**
 * AudioFile.java
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
class AudioFile extends MusicMedia implements FileManager {
    private String  fileName;
    private int     fileSize;

    private static final int    EMPTY_FILE;
    public static final double  DEFAULT_FILE_SIZE_BPS;

    {
        fileName = "default_song_name.mp3"; // just an example (for demonstration purposes)
    }

    static
    {
        EMPTY_FILE            = 0;
        DEFAULT_FILE_SIZE_BPS = 320; // default value used if file size is unknown
    }

    /**
     * @param title the title of the song
     * @param artist the artist for the song
     * @param fileName the name of the file
     * @param fileSize the size of the file
     */
    AudioFile(final String title, final String artist, final String fileName, final int fileSize) {
        super(title, artist);
        if(fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("The file name is invalid");
        }
        if(fileSize <= EMPTY_FILE) {
            throw new IllegalArgumentException("The file size is invalid");
        }

        validateFileName(fileName);
        validateFileSize(fileSize);

        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    /**
     * @param fileName the name of the file
     */
    public void setFileName(final String fileName) {
        validateFileName(fileName);
        this.fileName = fileName;
    }

    /**
     * @param fileSize the size of the file
     */
    public void setFileSize(final int fileSize) {
        validateFileSize(fileSize);
        this.fileSize = fileSize;
    }

    /**
     * @return the name of the file
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @return the size of the file
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * @param fileName validating the name of the file
     */
    private static void validateFileName(final String fileName) {
        if(fileName == null || fileName.isBlank())
        {
            throw new IllegalArgumentException("Invalid file name: " + fileName);
        }
    }

    /**
     * @param fileSize validating the size of the file
     */
    private static void validateFileSize(final int fileSize) {
        if(fileSize < EMPTY_FILE)
        {
            throw new IllegalArgumentException("Invalid file size: " + fileSize);
        }
    }

    /**
     * @return the to String information of the audio file
     */
    @Override
    public String toString() {
        return "AudioFile{" +
                "title='" + super.getSongTitle() + '\'' +
                ", artist='" + super.getArtist() + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }

    /**
     * @param fileName saving the name of the music file
     */
    public void save(final String fileName) {
        System.out.println("Audio file for " + super.getArtist() +" is being saved as " + fileName + "; size = " + fileSize);
    }

    /**
     * @param fileName deleting the file name
     */
    public void delete(final String fileName) {
        System.out.println("Audio file for " + super.getArtist() +" is being deleted as " + fileName + "; size = " + fileSize);
    }

    /**
     * Playing the current song
     */
    public void play() {
        System.out.println(fileName + " is currently playing: " + super.getSongTitle() + "-" + super.getArtist());
    }
}