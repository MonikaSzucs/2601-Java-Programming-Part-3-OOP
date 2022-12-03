import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintThreadTeacherExample {
    private static int num;

    public static void main(final String[] args) {
        Thread thread1 = new Thread(PrintThreadTeacherExample::printTime);
        Thread thread2 = new Thread(PrintThreadTeacherExample::printPrimes);
        thread1.start();
        thread2.start();
        System.out.println("The rest of the program will keep running");
        System.out.println("And the program will end only after the Thread is done");
    }

    // doesn't have to be called run for a lambda expression but the parameter but still be nothing
    public static void printPrimes() {
        int number = 3;
        boolean prime = true;
        while(number <= 1000) {
            prime = true;
            for(int i = 2; i < number; i++) {
                if(number % i == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                System.out.println("prime: " + number);
            }
            number++;
            try {
                Thread.sleep(700);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printTime() {
        SimpleDateFormat sdf;
        while(true) {
            sdf = new SimpleDateFormat("hh:mm:ss a");
            System.out.println(new Date(System.currentTimeMillis()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
