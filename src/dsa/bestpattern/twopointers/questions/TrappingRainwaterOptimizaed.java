package dsa.bestpattern.twopointers.questions;

public class TrappingRainwaterOptimizaed {
    static void main() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int lmax = 0, rmax = 0, total = 0;

        int l = 0, r = height.length - 1;

        while (l < r) {
            if (height[l] <= height[r]) {
                if (lmax > height[l]) {
                    total += lmax - height[l];
                } else {
                    lmax = height[l];
                }
                l++;
            } else {
                if (rmax > height[r]) {
                    total += rmax - height[r];
                } else {
                    rmax = height[r];
                }
                r--;
            }
        }
        System.out.println(total);
    }
}
