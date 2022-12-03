public class FirstThreadFourthExample {
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
