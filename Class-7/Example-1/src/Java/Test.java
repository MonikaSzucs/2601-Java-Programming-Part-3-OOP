public class Test {
    public static void main(final String[] args) {
        System.out.println(5.00000000000000000000000000123);
        // computer loses some percision after a while
        // dont ask if two doubles are equal to each other
        System.out.println(3.0000000000000000000000000123123 == 2.999999999999999999999999999999);
    }
}
