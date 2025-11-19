package concepts.arrays;

public interface FindMissingNumber {
    static void main() {
        int[] arr = {1, 2, 3, 5, 6};
        int n = arr.length + 1;
        int expSum = 0, actSum = 0, missingNum = 0;

        expSum = n * (n + 1) / 2;

        for (int num : arr) {
            actSum += num;
        }

        missingNum = expSum - actSum;
        System.out.println(missingNum);
    }
}
