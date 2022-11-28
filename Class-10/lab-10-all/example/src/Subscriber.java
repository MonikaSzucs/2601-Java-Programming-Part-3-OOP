public class Subscriber implements Observer {
    protected String name;
    public Subscriber(String name) {
        super();
        this.name = name;
    }
    @Override
    public void notification(String handle, String news) {
        System.out.printf("%s received news: %s - NEWS: '%s'\n",name, handle, news);
    }
}