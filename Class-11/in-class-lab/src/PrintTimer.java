import java.util.Timer;
import java.util.TimerTask;

public class PrintTimer {
    private static int number;
    private static Timer timer;
    static {
        timer = new Timer();
    }
    public static void main(final String[] args) {
        timer.scheduleAtFixedRate(new RunnableTimerTask(PrintTimer::perform), 0, 2000);
    }
    public static void perform() {
        System.out.println("The number is now " + number);
        number++;
        if(number >= 10) {
            timer.cancel(); // stop at 10; without cancel(), it will never stop; canceling a Timer is much simpler than canceling a Thread
        }
    }
    private static class RunnableTimerTask extends TimerTask {
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
