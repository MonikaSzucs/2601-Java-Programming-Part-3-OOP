import java.util.Collection;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// imports
public class FutureNumberAdder {

    public static void main(final String[] args) {

        ExecutorService executor;
        Future<Integer> future;

        executor = Executors.newFixedThreadPool(1);
        future = executor.submit(new Sum(
                IntStream.rangeClosed(1, 100)
                        .boxed().collect(Collectors.toList())));

        System.out.println("Waiting to exit");
        try {
            long result;
            result = future.get(60, TimeUnit.SECONDS);
            System.out.println(result);
        } catch(InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    private static class Sum implements Callable<Integer>{

        private Collection<Integer> values;

        public Sum(Collection<Integer> values) {

            this.values = values;
        }

        @Override
        public Integer call() throws InterruptedException {

            int sum;

            System.out.println("Starting sum");
            Thread.sleep(2000);
            sum = values.stream().reduce(0, Integer::sum);
            System.out.println("Sum completed");

            return sum;
        }
    }
}
