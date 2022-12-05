import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner reader = new Scanner(System.in);

        int i = 0;
        boolean proceed = true;

        while(proceed) {
            System.out.println("Type 1 for GUI");
            System.out.println("Type 2 for Streams and Filters");
            System.out.println("Type 3 for Design Patterns");
            System.out.println("Type 4 for Concurrency");
            System.out.println("Type 5 for Quit");

            i = reader.nextInt();
            System.out.println(i);

            if(i == 1) {

            } else if(i == 2) {

            } else if(i == 3) {

            } else if(i == 4) {
                concurrentMain();
            } else if(i == 5) {
                proceed = false;
            } else {
                System.out.println("Please make sure you enter a number between 1 and 5 (inclusive)");
            }
        }
        reader.close();
    }

    public static void concurrentMain() {
        try (Scanner input = new Scanner(System.in)) {
            int rangeStart, rangeEnd, numberOfThreads;
            do {
                System.out.print("Enter the range start: ");
                rangeStart = input.nextInt();

                System.out.print("Enter the range end: ");
                rangeEnd = input.nextInt();

                System.out.print("Enter the number of threads: ");
                numberOfThreads = input.nextInt();

                if (rangeStart >= rangeEnd || numberOfThreads < 1) {
                    System.out.println("Warning: range start should be less then range end. Also number of threads should not be less then 1.");
                }
            } while (rangeStart >= rangeEnd || numberOfThreads < 1);


            int sum = DivideAndConquerSum.sum(rangeStart, rangeEnd, numberOfThreads);

            System.out.println(String.format("Sum of numbers in the range [%s, %s] found in %s threads is %s",
                    rangeStart, rangeEnd, numberOfThreads, sum));
        }
    }
}
