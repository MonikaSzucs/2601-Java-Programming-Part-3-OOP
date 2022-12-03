import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ClockNameTimer {
    private static int number;
    private static final String name;
    private static Timer timer;
    static {
        timer = new Timer();
        name = "Monika";
    }
    public static void main(final String[] args) {
        Thread thread1 = new Thread(ClockNameTimer::printTime);
        Thread thread2 = new Thread(ClockNameTimer::printNumber);

        thread1.start();
        thread2.start();

        timer.scheduleAtFixedRate(new ClockNameTimer.RunnableTimerTask(ClockNameTimer::perform), 0, 1200);
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Canceled after 5.1 seconds");
                // kill timer
                timer.cancel();
                // kill itself
                t.cancel();
            }
        }, 5100);
    }

    public static void perform() {
        System.out.println(name);
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

    public static void printTime() {
        SimpleDateFormat sdf;
        int count = 0;
        while(true) {
            if(count < 4) {
                sdf = new SimpleDateFormat("hh:mm:ss a");
                System.out.println(new Date(System.currentTimeMillis()));
            } else {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }

    public static void printNumber() {
        while(true) {
            if(number >= 1 && number <= 7) {
                System.out.println("Number is " + number);
            } else if(number > 7) {
                System.out.println("Stopping the number after 7 prints");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number++;
        }
    }
}
