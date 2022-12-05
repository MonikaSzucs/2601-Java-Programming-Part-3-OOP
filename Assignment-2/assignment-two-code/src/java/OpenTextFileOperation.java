public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    // constructors
    public OpenTextFileOperation(TextFile textfile) {
        this.textFile = textfile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}