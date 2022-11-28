import java.util.ArrayList;
import java.util.List;
public class Store implements Subject {
    protected List<Observer> observers = new ArrayList<Observer>();
    protected String name;
    protected String news;
    public Store(String name) {
        super();
        this.name = name;
        this.news = " - FROM : " + name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEaddress() {
        return news;
    }
    public void sendNews(String news) {
        System.out.printf("\nName: %s, News : %s\n", name, news);
        notifySubscribers(news);
    }
    @Override
    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifySubscribers(String n) {
        observers.forEach(observer -> observer.notification(news, n));
    }
}