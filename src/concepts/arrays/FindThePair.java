package concepts.arrays;


import java.util.stream.IntStream;

public class FindThePair {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 10 && arr[i] > arr[j]) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }

        IntStream.range(0, arr.length)
                .forEach(i -> IntStream.range(i + 1, arr.length)
                        .filter(j -> arr[i] + arr[j] == 10 && arr[i] > arr[j])
                        .forEach(j -> System.out.println("(" + arr[i] + "," + arr[j] + ")")));
    }
}
