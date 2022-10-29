/**
 * The Main class
 */
public class Main {
    public static void main(final String[] args) {
        Quizzable myString = (num1, num2, num3) -> {
            System.out.println("I am doing addition");
            return String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3);
        }; // lambda expression
        System.out.println(calculate(5,6,6, myString));

        Quizzable anotherString = (num1, num2, num3) -> {
            System.out.println("I am doing addition");
            return String.valueOf(num1 + num2 + num3);
        }; // lambda expression
        System.out.println(calculate(5,6,6, anotherString));
    }

    /**
     *
     * @param a the first value
     * @param b the second value
     * @param c the third value
     * @param q the functional interface reference
     * @return
     */
    public static String calculate(int a, int b, int c, Quizzable q) {
        return q.makeQuestion(a, b,c);
    }
}
