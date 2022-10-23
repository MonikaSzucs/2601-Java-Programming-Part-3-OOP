public class AudioBookTwo {
    private String title;
    private String authorLastName;
    private String isbn;
    private boolean fiction;
    private double priceCad;
    public static final double DEFAULT_PRICE_CAD = 14.99;

    // instance initializer block called by each AudioBook constructor automatically, right after super()
    {
        authorLastName = "anonymous";
        fiction = true;
        title = "untitled";
        priceCad = DEFAULT_PRICE_CAD;
        System.out.println("called by every constructor after super()"); // always executed by each constructor call
    }

    public AudioBookTwo(final String title, final String authorLastName, final String isbn, final boolean fiction, final double priceCad) {
        this.title = title;
        this.authorLastName = authorLastName;
        this.isbn = isbn;
        this.fiction = fiction;
        this.priceCad = priceCad;
    }

    public AudioBookTwo(final String title, final String authorLastName, final double priceCad) {
        this.title = title;
        this.authorLastName = authorLastName;
        this.priceCad = priceCad;
    }
}
