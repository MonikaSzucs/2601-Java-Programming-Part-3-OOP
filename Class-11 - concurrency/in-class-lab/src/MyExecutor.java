import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyExecutor {

    private static int number;
    private static ScheduledExecutorService executor;

    static {
        executor = Executors.newScheduledThreadPool(1);
    }

    public static void main(final String[] args) {
        executor.scheduleAtFixedRate(MyExecutor::perform, 0, 2, TimeUnit.SECONDS); // specify the units ourselves; very convenient
        System.out.println("Waiting to exit");  // prints immediately
    }

    public static void perform() {
        System.out.println("Hello from executor");
        number++;
        if (number >= 5) {
            executor.shutdown();
        }
    }
}
