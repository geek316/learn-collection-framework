package net.startegicfarming.learnstreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class LearningJava8 {
    public static void main(String[] args) {

        // Java 8 - minimal code, functional programming.
        // Java 8 - lambda expression, Streams, Date & Time API

        // Lambda Expressions   - An anonymous function (no name, no return type modifier, no access modifier)
        //                      - used to implement functional interface.
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });

        // Predicate            - Functional interface (Boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        // IntPredicate isEven = x -> x%2 == 0; // This is specially for int.
        System.out.println("isEven 4 : " + isEven.test(4));
        System.out.println("isEven 5 : " + isEven.test(5));
        System.out.println();
        System.out.println();


        System.out.println("Use of predicate");
        Predicate<String> isWordStartsWithS = x -> x.toLowerCase().startsWith("s");
        Predicate<String> isWordEndingWithI = x -> x.toLowerCase().endsWith("i");
        Predicate<String> and = isWordStartsWithS.and(isWordEndingWithI);
        System.out.println("Word Starts with S and ends with I ? - " + and.test("Summi"));
        System.out.println();
        System.out.println();


        // Function -> It Works for you - gives you some output.
        System.out.println("Use of Function");
        Function<Integer, Integer> add10 = x -> x+10;
        Function<Integer, Integer> substract10 = x -> x-10;
        Function<Integer, Integer> doubleIt = x -> x * 2;

        System.out.println("AndThen : " + add10.andThen(doubleIt.andThen(substract10)).apply(100)); // sequence of andThen : add10 -> doubleIt -> substract10
        System.out.println("compose : " + add10.compose(doubleIt.compose(substract10)).apply(100)); // sequence of compose : substract10 -> doubleIt -> add10

        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(5);
        System.out.println("Result for the identity is : " + res);
        System.out.println();
        System.out.println();

        // Consumer
        Consumer<Integer> print = (x) ->System.out.println("Consumer consumed : " + x);
        print.accept(3);
        List<Integer> list = List.of(1,2,3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);
        System.out.println();
        System.out.println();

        // Supplier
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println("Supplier : " + giveHelloWorld.get());
        System.out.println();
        System.out.println();

        // Combined Example
        System.out.println("Combined Example");
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }
        System.out.println();
        System.out.println();


        // BiPredicate, BiConsumer, BiFunction
        System.out.println("All Bi Examples");

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println("BiPredicate isSumEven : " + isSumEven.test(20, 5));

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept(1,2);

        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("Sum", "mi"));

        UnaryOperator<Integer> twoTimes = x -> 2 * x;
        System.out.println(twoTimes.apply(25));

        BinaryOperator<Integer> sumOfTwo = (x, y) -> x + y;
        System.out.println(sumOfTwo.apply(5,7));


        // Method reference -> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Summi", "Hemant", "Mukesh");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);

        // Constructor reference
        List<String> names = Arrays.asList("Mac","Windows","Android","iOs");
        List<OperatingSystems> operatingSystems = names.stream().map(OperatingSystems::new).collect(Collectors.toList());
        System.out.println(operatingSystems);

    }

}

class OperatingSystems {
    String name;

    public OperatingSystems(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OperatingSystems{" +
                "name='" + name + '\'' +
                '}';
    }
}
