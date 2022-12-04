import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyExecutorCurrentTime {

    private static int number;
    private static ScheduledExecutorService executor;

    static {
        executor = Executors.newScheduledThreadPool(1);
    }

    public static void main(final String[] args) {
        executor.scheduleAtFixedRate(MyExecutorCurrentTime::perform, 0, 1, TimeUnit.SECONDS); // specify the units ourselves; very convenient
        System.out.println("Waiting to exit");  // prints immediately
    }

    public static void perform() {
        System.out.println("Hello from executor");
        try {
            number++;
            if (number >= 5) {
                executor.shutdown();
            }
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
