import java.util.Timer;
import java.util.TimerTask;
public class TimerCancel {
    private static int number;
    private static Timer timer;
    static {
        timer = new Timer();
    }
    public static void main(final String[] args) {
        timer.scheduleAtFixedRate(new RunnableTimerTask(TimerCancel::perform), 0, 850);
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Canceled after 4 seconds");
                // kill timer
                timer.cancel();
                // kill itself
                t.cancel();
            }
        }, 4000);
    }
    public static void perform() {
        System.out.println("The number is now " + number);
        number++;
    }
    static class RunnableTimerTask extends TimerTask {
        private Runnable runnable;
        public RunnableTimerTask(Runnable runnable) {
            this.runnable = runnable;
        }
        @Override
        public void run() {
            runnable.run();
        }
    }
}
