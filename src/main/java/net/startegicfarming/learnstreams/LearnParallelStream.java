package net.startegicfarming.learnstreams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class LearnParallelStream {
    public static void main(String[] args) {
        // A type of stream that enables parallel processing of elements.
        // Allowing multiple threads to process parts of the stream simultaneously.
        // This can significantly improve performance for large data sets
        // workload is distributed across multiple threads.

        long startTime1 = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20_000).toList();
        List<Long> factList = list.stream().map(LearnParallelStream::factorial).toList();
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream : " + (endTime1-startTime1));

        long startTime2 = System.currentTimeMillis();
        List<Long> factList2 = list.parallelStream().map(LearnParallelStream::factorial).toList();
//        List<Long> factList2 = list.parallelStream().map(LearnParallelStream::factorial).sequential().toList();
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time taken with parallelStream : " + (endTime2-startTime2));

        // Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent.
        // They may add overhead for simple tasks or small datasets.

        // Cumulative Sum
        // [1, 2, 3, 4, 5] -> [1, 3, 6, 10, 15]
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = nums.parallelStream().map(sum::addAndGet).toList();
        System.out.println("ArrayList for cumulative sum : " + nums);
        System.out.println("Expected cumulative sum : [1, 3, 6, 10, 15]");
        System.out.println("Actual result with parallel stream : " + cumulativeSum);

    }

    private static long factorial(int n) {
        long result = 1;
        for (int i=2; i<=n; i++) {
            result *= i;
        }
        return result;
    }
}
