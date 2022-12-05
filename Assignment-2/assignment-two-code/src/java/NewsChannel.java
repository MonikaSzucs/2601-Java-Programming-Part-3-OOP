import java.io.IOException;
import java.nio.channels.Channel;

public class NewsChannel implements Channel {
    private String news;

    // ??????????????????????????????
    //@Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public void close() throws IOException {

    }

    // standard getter and setter

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}