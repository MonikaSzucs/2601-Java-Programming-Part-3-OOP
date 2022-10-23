
public class ScientificCalculator {
    // nested interface. This can also be outside this class
    // Adding the @FunctionalInterface gives it help from the compiler in case you do anything wrong
    // It will check if you have too many or not enough
    @FunctionalInterface
    interface Mathable {
        double performArithmetic(int x, int y);
        // function interface has one abstract method
    }

    public static double calculate(int a, int b, Mathable m) {
        return m.performArithmetic(a, b);
    }

    public static void main(final String[] args) {
        Mathable add = (num1, num2) -> {
            System.out.println("I am doing addition");
            return num1 + num2;
        }; // lambda expression
        System.out.println(calculate(5,6,add));

        //Mathable add = (int num1, int num2) -> (return num1 + num2;); // lambda expression
        //System.out.println(calculate(5,6,add));
        Mathable power = (x, num2) -> Math.pow(x, num2); // lambda expression
        System.out.println(calculate(5,6,power));

        Mathable multiplication = (x, z) -> x*z; // lambda expression
        System.out.println(calculate(5,6,multiplication));

        System.out.println(100/6);
        Mathable division = (a,b) -> {return Double.valueOf(a)/b;}; // lambda expression
        System.out.printf("%.2f", calculate(100,6,division));
    }
}
