package concepts.arrays.set;

import java.util.ArrayList;
import java.util.List;

public class PowerSerIterative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> powerSet = subset(arr);
        System.out.println(powerSet);
        for(List<Integer> subset : powerSet){
            System.out.println(subset);
        }
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int ar : arr) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(ar);
                result.add(newSubset);
            }
        }
        return result;
    }
}