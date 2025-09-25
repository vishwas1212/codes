package concepts.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 1};
        Set set = new HashSet();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);

    }
}
