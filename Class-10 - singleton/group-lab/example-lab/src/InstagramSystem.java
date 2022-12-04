public class InstagramSystem {
    public static void main(String[] args) {
        SocialMedia platform = new SocialMedia("Instagram");
        Follower followerOne = new Follower("Monika");
        Follower followerTwo = new Follower("john");

        platform.addFollower(followerOne);
        platform.addFollower(followerTwo);
        platform.sendNews("New merchandise for sale");
        platform.removeFollower(followerTwo);
        platform.sendNews("New post made");
    }
}
