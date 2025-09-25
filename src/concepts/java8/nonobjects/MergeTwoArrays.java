package concepts.java8.nonobjects;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 7, 1, 1, 2};

        int[] b = new int[]{8, 3, 9, 5, 8, 3};

        int[] array = IntStream
                .concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();

        System.out.println(Arrays.toString(array));

        int[] withoutDuplicated = IntStream
                .concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(withoutDuplicated));

        System.out.println("-------------------------");
        //find sum and average for the given array

        int[] arr = new int[]{45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        double average = Arrays.stream(arr).average().getAsDouble();
        System.out.println(average);

        System.out.println("-------------------");
        //find the sum of first 10 natural numbers

        int summed = IntStream.range(1, 11).sum();
        System.out.println(summed);

        System.out.println("------------");
        //reverse an integre array

        int[] ar = new int[]{5, 1, 7, 3, 9, 6};

        int[] ints = IntStream.rangeClosed(1, ar.length)
                .map(i -> ar[ar.length - i])
                .toArray();
        System.out.println(Arrays.toString(ints));

        System.out.println("---------------");
        //print first 10 even numbers

        IntStream.rangeClosed(1, 11).map(i -> i * 2)
                .forEach(System.out::println);
        System.out.println("------------");
        IntStream.range(1, 11).map(i -> i * 2)
                .forEach(System.out::println);
    }
}
