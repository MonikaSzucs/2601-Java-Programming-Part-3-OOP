public class SaveTextFileOperation implements TextFileOperation {
    private TextFile textFile;

    // constructors
    // same field and constructor as above
    public SaveTextFileOperation(TextFile textfile) {
        this.textFile = textfile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}