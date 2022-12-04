import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

class FutureDemo {
    private static final ExecutorService threadPool;

    static {
        threadPool = Executors.newFixedThreadPool(1);
    }

    public static void main(final String[] args) throws Exception {
        FactorialCalculator task = new FactorialCalculator(10);
        System.out.println("Submitting Task ...");
        Future future = threadPool.submit(task);
        // Future future2 = threadPool.submit(task2);
        System.out.println("Task is submitted");
        while (!future.isDone())
        {
            System.out.println("Task is not completed yet....");
            Thread.sleep(100);  // sleep for 100 ms before checking again
        }
        System.out.println("Task is completed, let's check the result");
        long factorial = (long) future.get();
        System.out.println("Factorial of 10 is : " + factorial);
        threadPool.shutdown();
    }
    private static class FactorialCalculator implements Callable {
        private final int number;
        public FactorialCalculator(int number) {
            this.number = number;
        }
        @Override
        public Long call() {
            long output = 0;
            try {
                output = factorial(number);
            } catch (InterruptedException ex) {
                Logger.getLogger(FutureDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
            return output;
        }
        private long factorial(int number) throws InterruptedException {
            long result = 1;
            while (number > 0) {
                Thread.sleep(200);  // adding delay for example
                result = result * number;
                number--;
            }
            return result;
        }
    }
}
