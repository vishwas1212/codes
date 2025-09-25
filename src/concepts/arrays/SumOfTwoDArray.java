package concepts.arrays;

import java.util.Arrays;

public class SumOfTwoDArray {
    static void main() {
        int[][] arr1 = {{1, 2}, {4, 6}};
        int[][] arr2 = {{5, 7}, {5, 8}};

        int[][] sum = getSum(arr1, arr2);
        System.out.println(Arrays.deepToString(sum));

        int[][][] ar1 = {
                {   // Block 0
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {   // Block 1
                        {7, 8, 9},
                        {10, 11, 12},
                        {13, 14, 15}
                }
        };

        int[][][] ar2 = {
                {   // Block 0
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {   // Block 1
                        {7, 8, 9},
                        {10, 11, 12},
                        {13, 14, 15}
                }
        };
        int[][][] threeDSum = get3DSum(ar1, ar2);
        System.out.println(Arrays.deepToString(threeDSum));
        for (int i = 0; i < threeDSum.length; i++) {
            System.out.println("Block " + i + ":");
            for (int j = 0; j < threeDSum[i].length; j++) {
                for (int k = 0; k < threeDSum[i][j].length; k++) {
                    System.out.print(threeDSum[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    private static int[][][] get3DSum(int[][][] ar1, int[][][] ar2) {
        int[][][] res = new int[ar1.length][ar1[0].length][ar1[0][0].length];

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                for (int k = 0; k < res[i][j].length; k++) {
                    res[i][j][k] = ar1[i][j][k] + ar2[i][j][k];
                }
            }
        }
        return res;
    }

    private static int[][] getSum(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }
}
