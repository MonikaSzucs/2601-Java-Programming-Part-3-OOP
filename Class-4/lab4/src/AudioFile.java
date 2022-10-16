class AudioFile extends MusicMedia implements FileManager {
    private String title;
    private String artist;
    private String fileName;
    private int fileSize;

    AudioFile(final String title, final String artist, final String fileName, final int fileSize) {
        super(title, artist);
        if(fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("The file name is invalid");
        }
        if(fileSize <= 0) {
            throw new IllegalArgumentException("The file size is invalid");
        }
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return "AudioFile{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }

    public void save(final String fileName) {
        System.out.println("Audio file for " + artist +" is being saved as " + fileName + "; size = " + fileSize);
    }
    
    public void delete(final String fileName) {
        System.out.println("Audio file for " + artist +" is being deleted as " + fileName + "; size = " + fileSize);
    }

    public void play() {
        System.out.println(fileName + " is currently playing: " + title + "-" + artist);
    }
}