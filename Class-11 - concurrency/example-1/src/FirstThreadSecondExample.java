/**
 * This is the alterative way with extends Thread instead of extends Runnable
 * and override run()
 */
public class FirstThreadSecondExample extends Thread {
    private static int num;

    public static void main(final String[] args) {
        Thread t;
        t = new Thread(new FirstThread());
        t.start();
        System.out.println("None of this gets blocked");
    }

    @Override
    public void run() {
        for(;;) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace(); // don't do this
            }
            System.out.println("num is " + num);
            num++;

            if(num > 10) {
                System.out.println("Thread is all done.");
                return;
            }
        }

    }
}
