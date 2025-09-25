package dsa.bestpattern.twopointers.bestproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointersProblems {
    static void main() {
        int[] arr = {2, 7, 11, 15};
        int[] numsDup = {1, 1, 2, 2, 3, 3};
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] rain = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] nums3 = {-1, 0, 1, 2, -1, -4};
        int[] nums4 = {1, 0, -1, 0, -2, 2};
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("1. Reverse String: " + reverseString("hello"));
        System.out.println("2. Palindrome Check: " + isPalindrome("madam"));
        System.out.println("3. Two Sum Sorted: " + twoSumSorted(arr, 9));
        System.out.println("4. Remove Duplicates: " + removeDuplicates(numsDup));
        System.out.println("5. Container With Most Water: " + containerWithMostWater(height));
        System.out.println("6. Trapping Rain Water: " + trapRainWater(rain));
        System.out.println("7. 3Sum: " + threeSum(nums3));
        System.out.println("8. 4Sum: " + fourSum(nums4, 0));
        System.out.println("9. Move Zeroes:: " + moveZeroes(nums));
    }

    private static String moveZeroes(int[] nums) {
        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
        return Arrays.toString(nums);
    }

    private static String fourSum(int[] nums4, int target) {
        Arrays.sort(nums4);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums4.length - 3; i++) {
            if (i > 0 && nums4[i] == nums4[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums4.length - 2; j++) {
                if (j > i + 1 && nums4[j] == nums4[j - 1]) {
                    continue;
                }
                int l = j + 1;
                int r = nums4.length - 1;

                while (l < r) {
                    int sum = nums4[i] + nums4[j] + nums4[l] + nums4[r];
                    if (sum == target) {
                        result.add(Arrays.asList(nums4[i], nums4[j], nums4[l], nums4[r]));
                        while (l < r && nums4[l] == nums4[l + 1]) {
                            l++;
                        }
                        while (l < r && nums4[r] == nums4[r - 1]) {
                            r--;
                        }
                        l++;
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return result.toString();
    }

    private static String threeSum(int[] nums3) {
        Arrays.sort(nums3);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums3.length - 2; i++) {
            if (i > 0 && nums3[i] == nums3[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums3.length - 1;

            while (l < r) {
                int sum = nums3[i] + nums3[l] + nums3[r];
                if (sum == 0) {
                    result.add(Arrays.asList(nums3[i], nums3[l], nums3[r]));
                    while (l < r && nums3[l] == nums3[l + 1]) {
                        l++;
                    }
                    while (l < r && nums3[r] == nums3[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result.toString();
    }

    private static String trapRainWater(int[] rain) {
        int lmax = 0, rmax = 0, total = 0;
        int l = 0, r = rain.length - 1;

        while (l < r) {
            if (rain[l] <= rain[r]) {
                if (lmax > rain[l]) {
                    total += lmax - rain[l];
                } else {
                    lmax = rain[l];
                }
                l++;
            } else {
                if (rmax > rain[r]) {
                    total += rmax - rain[r];
                } else {
                    rmax = rain[r];
                }
                r--;
            }
        }
        return String.valueOf(total);
    }

    private static String containerWithMostWater(int[] height) {
        int l = 0, r = height.length - 1, mostWater = 0;

        while (l < r) {
            int width = r - l;
            int minHeight = Math.min(height[l], height[r]);
            int area = width * minHeight;

            mostWater = Math.max(mostWater, area);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return String.valueOf(mostWater);
    }

    private static String removeDuplicates(int[] numsDup) {
        int l = 0, r = 1;
        while (r < numsDup.length) {
            if (numsDup[l] != numsDup[r]) {
                l++;
                numsDup[l] = numsDup[r];
            }
            r++;
        }
        return Arrays.toString(Arrays.copyOfRange(numsDup, 0, l + 1));
    }

    private static String twoSumSorted(int[] arr, int target) {
        int l = 0, r = arr.length - 1, sum = 0;

        while (l < r) {
            sum = arr[l] + arr[r];

            if (sum == target) {
                return "(" + l + "," + r + ")";
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return "Nothing Found";
    }

    private static boolean isPalindrome(String madam) {
        int l = 0, r = madam.length() - 1;
        while (l < r) {
            if (madam.charAt(l) != madam.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private static String reverseString(String hello) {
        char[] chars = hello.toCharArray();
        int l = 0, r = hello.length() - 1;
        while (l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        return new String(chars);
    }
}
