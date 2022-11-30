public class DatabaseConnection {
    private static DatabaseConnection d;

    static {
        d = null; // singletons have 0 or 1 objects only
    }

    private DatabaseConnection(final String host, final String user, final String password) {
        // do normal constructor stuff here
    }

    public static DatabaseConnection getInstance(final String host, final String user, final String password) {
        if(d == null) { // there is no object yet, so let's make ONE
            d = new DatabaseConnection(host, user, password);
        }

        return d; // return a reference to the ONE AND ONLY DatabaseConnection object
    }
}
