package concepts.arrays;

public class FindTheClosestValue {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        int target = 1;

        int num1 = arr[0];
        int num2 = arr[1];
        int closestSum = num1 + num2;
        int diff = closestSum - target;

        if (diff < 0) {
            diff = -diff;
        }
        int minDiff = diff;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                int currDiff = sum - target;

                if (currDiff < 0) {
                    currDiff = -currDiff;
                }
                if (currDiff < minDiff) {
                    minDiff = currDiff;
                    closestSum = sum;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println(num1 + " " + num2 + " closest value: " + closestSum + " for target: " + target);
    }
}
