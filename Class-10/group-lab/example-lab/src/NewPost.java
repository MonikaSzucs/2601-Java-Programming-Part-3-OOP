public interface NewPost {
    public void addFollower(Observer observer);
    public void removeFollower(Observer observer);
    public void notifyFollower(String email);
}
