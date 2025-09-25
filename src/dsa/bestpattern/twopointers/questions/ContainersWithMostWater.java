package dsa.bestpattern.twopointers.questions;

public class ContainersWithMostWater {
    static void main() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int l = 0, r = height.length - 1, maxArea = 0;

        while (l < r) {
            int wid = r - l;
            int minHeight = Math.min(height[l], height[r]);
            int area = wid * minHeight;

            maxArea = Math.max(maxArea, area);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println(maxArea);
    }
}
