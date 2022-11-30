public interface NewPost {
    public void addFollower(Observer observer);
    public void removeFollower(Observer observer);
    public void notifyFollowers(String email);
}
