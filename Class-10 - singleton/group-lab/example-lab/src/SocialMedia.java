import java.util.ArrayList;
import java.util.List;

class SocialMedia implements NewPost {
    private List<Observer> observers = new ArrayList<Observer>();
    private String username;
    private String news;

    SocialMedia(final String username) {
        super();
        this.username = username;
        this.news = " - From : " + username;
    }

    public String getUsername() {
        return username;
    }

    public void setName(final String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return news;
    }

    public void sendNews(final String news) {
        System.out.printf("\nUsername: %s, News: %s\n", username, news);
        notifyFollowers(news);
    }

    @Override
    public void addFollower(final Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeFollower(final Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyFollowers(final String n) {
        observers.forEach(observer -> observer.notification(news, n));
    }
}

