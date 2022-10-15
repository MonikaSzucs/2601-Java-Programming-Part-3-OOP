class AudioFile implements FileManager {
    private String fileName;
    private String fileSize;

    AudioFile(final String title, final String artist, final String fileName, final String fileSize) {
        super(title, artist);
        if(fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("The file name is invalid");
        }
        if(fileSize == null || fileSize.isBlank()) {
            throw new IllegalArgumentException("The file size is invalid");
        }
        this.fileName = fileName;
        this.fileSize = fileSize;
    }


}
