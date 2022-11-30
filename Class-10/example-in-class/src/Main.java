public class Main {
    public static void main(String[] args) {
        DatabaseConnection d1;
        DatabaseConnection d2;
        DatabaseConnection d3;

//        d1 = new DatabaseConnection();
//        d2 = new DatabaseConnection();
//        d3 = new DatabaseConnection();

        d1 = DatabaseConnection.getInstance("my_host", "my_username", "my_password");
        d2 = DatabaseConnection.getInstance("my_host", "my_username", "my_password");
        d3 = DatabaseConnection.getInstance("my_host", "my_username", "my_password");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
