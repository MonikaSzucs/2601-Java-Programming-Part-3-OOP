import java.util.Locale;

public class Book {
    public String title;

    /**
     *
     * @param title
     * @param authorLastName
     * @param yearPublished
     * @param numberOfPages
     */
    public Book(final String title, final String authorLastName,
                final int yearPublished, final int numberOfPages) {
        if(title == null) {
            throw new IllegalArgumentException("a book needs a title!!!");
        }
        this.title = title;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    int getYearPublished() {
        return 0;
    }
}
