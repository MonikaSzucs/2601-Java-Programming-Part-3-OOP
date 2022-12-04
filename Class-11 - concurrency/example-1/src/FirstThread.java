public class FirstThread implements Runnable {
    private static int num;

    public static void main(final String[] args) {
        Thread t;
        t = new Thread(new FirstThread());
        t.start();
        System.out.println("None of this gets blocked");
    }

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
