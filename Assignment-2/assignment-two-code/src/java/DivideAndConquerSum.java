import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivideAndConquerSum {

    static int sum(int rangeStart, int rangeEnd, int numberOfThreads) {
        int numberOfSubRanges = Math.min(numberOfThreads, rangeEnd - rangeStart + 1);
        int numbersPerSubRange = findNumbersPerSubRanges(rangeStart, rangeEnd, numberOfThreads);

        ExecutorService executorPool = Executors.newFixedThreadPool(numberOfSubRanges);

        List<CompletableFuture<Integer>> subRanges = IntStream.range(0, numberOfSubRanges)
                .mapToObj(subRangeIndex -> {
                    int lower = rangeStart + (subRangeIndex * numbersPerSubRange);
                    int upper = (subRangeIndex == numberOfThreads - 1) ? rangeEnd : lower + numbersPerSubRange - 1;
                    return CompletableFuture.supplyAsync(() -> IntStream.rangeClosed(lower, upper).sum(), executorPool);
                })
                .collect(Collectors.toList());

        return CompletableFuture.allOf(subRanges.toArray(new CompletableFuture[0]))
                .thenApply(v -> {
                            Integer total = subRanges.stream()
                                    .map(CompletableFuture::join)
                                    .reduce(0, Integer::sum);
                            executorPool.shutdownNow();
                            return total;
                        }
                ).join();
    }

    private static int findNumbersPerSubRanges(int rangeStart, int rangeEnd, int numberOfThreads) {
        if (numberOfThreads >= rangeEnd - rangeStart + 1) {
            return 1;
        } else {
            return (rangeEnd - rangeStart + 1) / numberOfThreads;
        }
    }

    public static void main(String[] args) throws InterruptedException {

    }
}
