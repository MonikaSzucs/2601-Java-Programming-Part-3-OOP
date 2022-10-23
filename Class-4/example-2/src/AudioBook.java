public class AudioBook {
    public static final double DEFAULT_PRICE_CAD = 14.99;
    private final String title;
    private double priceCad;

    public AudioBook(final String title, final double priceCad) {
        // the following line calls java.land.Object constructor with no parameters
        // and is (inivisbly) inserted by java even if you do not write it
        super();
        this.title = title;
        this.priceCad = priceCad;
    }

    public AudioBook(final String title) {
        // do NOT call super() in this one and only case.. when this() is called
        // this() is calling the matching constructor in this calld: the one which takes
        // a String title and a double price
        this(title, DEFAULT_PRICE_CAD);
    }
}
