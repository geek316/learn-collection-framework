package net.startegicfarming.learnstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LearningPrimitiveStreams {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        IntStream stream = Arrays.stream(numbers);

        Integer[] numbers1 = {1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> stream1 = Arrays.stream(numbers1);

        System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()));

        DoubleStream doubles = new Random().doubles(5);
        System.out.println(doubles.boxed().toList());

        IntStream ints = new Random().ints(5);
        System.out.println(ints.boxed().toList());



    }
}

