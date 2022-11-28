public class Follower implements Observer {
    protected String username;

    public Follower(final String username) {
        super();
        this.username = username;
    }

    @Override
    public void notification(final String handle, final String news) {
        System.out.printf("%s received news: %s 0 NEWS '%s'\n", username, handle, news);
    }
}
