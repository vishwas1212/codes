package dsa.bestpattern.twopointers.questions;

public class TrappingRainwater {
    static void main() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int[] prefixMax = new int[height.length];
        int[] suffixMax = new int[height.length];
        int leftMax = 0, rightMax = 0, total = 0;

        prefixMax[0] = height[0];
        suffixMax[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }
        for (int i = 0; i < height.length; i++) {
            leftMax = prefixMax[i];
            rightMax = suffixMax[i];

            if (height[i] < leftMax && height[i] < rightMax) {
                total += Math.min(leftMax, rightMax) - height[i];
            }
        }
        System.out.println(total);
    }
}
