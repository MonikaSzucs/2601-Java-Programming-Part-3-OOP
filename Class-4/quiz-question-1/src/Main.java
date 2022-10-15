public class Main {
    public static void main(String[] args) {
        Bcit student1 = new Bcit("A12345");
        Bcit student2 = new Bcit("A01234");

        Boolean check = student1.equals(student2);

        if(check == true) {
            System.out.println("These students are equal");
        } else {
            System.out.println("These students are not equal");
        }

    }
}
