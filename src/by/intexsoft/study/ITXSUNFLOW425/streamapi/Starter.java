package by.intexsoft.study.ITXSUNFLOW425.streamapi;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Starter {

    public static void main (String [] args){

        System.out.println("Print [0, 1)");
        IntStream integers = IntStream.range(0, 10);
        integers.forEach(System.out::println);

        System.out.println("Print sum for the IntStream");
        int sum = IntStream.iterate(1, n-> n+1)
                .filter(n -> n%5 == 0 && n%2 != 0)
                .limit(5)
                .map(n -> n*n)
                .sum();

        System.out.println(sum);


        System.out.println("Print factorial for the number of 4: " + factorial(4));
        System.out.println("Is string 'abba' is palindrome: "+isPalindrome("abba"));

        System.out.println("Print using forEach and filter");
        IntStream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x < 300)
                .map(x -> x + 11)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n");

        System.out.println("Generate infinity sequence of 16 and limit and distinct it");
        Stream.generate(() -> 16)
                .limit(6)
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n");

        System.out.println("Concatination of 2 streams (1,2,3) and (4,5,6)");
        Stream.concat(
                        Stream.of(1, 2, 3),
                        Stream.of(4, 5, 6))
                .forEach(System.out::println);

        System.out.println("\n");

        System.out.println("parse String to IntStream");
        Stream.of("1", "2", "3")
                .map(Integer::parseInt)
                .map(x -> x + 10)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("\n");

        System.out.println("format print for stream");
        Stream.of(120, 410, 85, 32, 314, 12)
                .forEach(x -> System.out.format("%s, ", x));

        System.out.println("\n");

        List<Integer> list = Stream.of(1, 2, 3)
                .collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("\n");

        String[] elements = Stream.of("a", "b", "c", "d")
                .toArray(String[]::new);
        System.out.println("Stream to String array");
        for(int i = 0; i <elements.length; i++){
            System.out.println(elements[i]);
        }

        int min = Stream.of(20, 11, 45, 78, 13)
                .min(Integer::compare).get();

        int max = Stream.of(20, 11, 45, 78, 13)
                .max(Integer::compare).get();

        System.out.println("Min " + min + " "+ "Max " + max);

        System.out.println("Mathes 1, 2, 3, 4, 5 with <=7");
        System.out.println(Stream.of(1, 2, 3, 4, 5)
                .allMatch(x -> x <= 7)  );

        System.out.println("None mathes 1, 2, 3, 4, 5 with ==7");
        System.out.println(Stream.of(1, 2, 3, 4, 5)
                .noneMatch(x -> x == 9));

        Long count = Stream.of("1", "2", "3", "4")
                .collect(Collectors.counting());
        System.out.println("Counting stream of 4 strings" + count);

        System.out.println("Sorted stream");
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.sorted().takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));
    }

    public static BigInteger factorial(int n){
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> BigInteger.valueOf(i))
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }

    public static boolean isPalindrome(String s){
        StringBuilder leftToright = new StringBuilder();

        s.chars().filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(leftToright::appendCodePoint);

        StringBuilder rightToLeft = new StringBuilder(leftToright).reverse();

        return leftToright.toString().equals(rightToLeft.toString());
    }
}
