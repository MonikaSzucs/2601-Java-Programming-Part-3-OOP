import java.util.Locale;

public class Book {
    private String title;

    /**
     * @param title the title of the book
     * @param authorLastName the last name of the author
     * @param yearPublished the year in which teh book ish published
     * @param numberOfPages the number of pages in the book
     */
    public Book(final String title, final String authorLastName, final int yearPublished, final int numberOfPages) {
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
