import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintThread {
    private static int num;

    public static void main(final String[] args) {
        Thread t;
        t = new Thread(() -> run());
        t.start();
        System.out.println("None of this gets blocked");
    }

    // doesn't have to be called run for a lambda expression but the parameter but still be nothing
    public static void run() {

        for(;;) {
            int n = num;
            int count = 0;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace(); // don't do this
            }

            if(num > 1) {
                for(int i = 1; i <= n / 2; i++) {
                    if(n % i == 0) {
                        count++;
                    }
                }
                if(count == 1) {
                    System.out.println("prime:" + n);
                } else {
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                    System.out.println(new Date(System.currentTimeMillis()));
                }
            }
            num++;
        }
    }
}
