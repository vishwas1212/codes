package dsa.bestpattern.slidingwindow.bestproblems;

import java.util.*;

public class SlidingWindowProblems {
    static void main() {
        int[] arr = {1, 2, -1, 2, 3, -2, 4, 5};
        String str = "ababababcdeffg";

        System.out.println("1. Max Sum Subarray of Size K: " + maxSumSubarray(arr, 3));
        System.out.println("2. Longest Substring K Distinct: " + longestSubstringKDistinct("eceba", 2));
        System.out.println("3. Count Subarrays Sum=3: " + subarraysWithSumK(new int[]{1, 0, 1, 0, 1}, 2));
        System.out.println("4. First Negative in Window: " + firstNegativeInWindow(new int[]{12, -1, -7, 8, -15, 30, 16, 28}, 3));
        System.out.println("5. Sliding Window Max: " + slidingWindowMax(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        System.out.println("6. Longest Unique Substring: " + longestUniqueSubstring(str));
        System.out.println("7. Subarray Product < 100: " + subarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
        System.out.println("8. Min Window Substring: " + minWindowSubstring("ADOBECODEBANC", "ABC"));
        System.out.println("9. Longest Ones After Flips: " + longestOnesAfterFlips(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println("10. Smallest Subarray ≥ S: " + smallestSubarrayWithSum(new int[]{2, 3, 1, 2, 4, 3}, 7));
        System.out.println("11. Fruit Into Baskets: " + totalFruit(new int[]{1, 2, 1, 2, 3}, 2));
        System.out.println("12. Count Anagrams: " + countAnagrams("cbaebabacd", "abc"));
        System.out.println("13. Longest Substring Replacement: " + characterReplacement("AABABBA", 1));
        System.out.println("14. Longest Substring Binary Ones: " + longestOnesAfterFlips(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0}, 2));
        System.out.println("15. Distinct Subarrays with K: " + subarraysWithKDistinct(new int[]{1, 2, 1, 2, 3}, 2));
    }

    private static int subarraysWithKDistinct(int[] arr, int k) {
        getExactSubArrays(arr, k);
        return distinctAtMost(arr, k) - distinctAtMost(arr, k - 1);
    }

    private static void getExactSubArrays(int[] arr, int k) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < arr.length; j++) {
                set.add(arr[j]);
                if (set.size() == k) {
                    list.add(Arrays.copyOfRange(arr, i, j + 1));
                }
            }
        }
        for (int[] ar : list) {
            System.out.println(Arrays.toString(ar));
        }

    }

    private static int distinctAtMost(int[] arr, int k) {
        int l = 0, r = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (r < arr.length) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            while (map.size() > k) {
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }

    private static int characterReplacement(String str, int k) {
        int l = 0, r = 0, maxCount = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (r < str.length()) {
            char c = str.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);

            maxCount = Math.max(maxCount, map.get(c));

            if ((r - l + 1) - maxCount > k) {
                char left = str.charAt(l);
                map.put(left, map.get(left) - 1);
                l++;
            }
            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1;
            }
            r++;
        }
        return maxLen;
    }

    private static int countAnagrams(String s, String p) {
        Map<Character, Integer> need = new HashMap<>();
        for (char c : p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int l = 0, r = 0, match = 0, count = 0, k = p.length();
        Map<Character, Integer> window = new HashMap<>();

        while (r < s.length()) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && need.get(c).intValue() == window.get(c).intValue()) {
                match++;
            }

            if (r - l + 1 > k) {
                char left = s.charAt(l);

                if (need.containsKey(left) && need.get(left).intValue() == window.get(left).intValue()) {
                    match--;
                }
                window.put(left, window.get(left) - 1);
                if (window.get(left) == 0) {
                    window.remove(left);
                }
                l++;
            }
            if (match == need.size())
                count++;
            r++;
        }
        return count;
    }

    private static int totalFruit(int[] fruits, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0, max = 0;

        while (r < fruits.length) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            if (map.size() > k) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;
            }

            if (max < r - l + 1) {
                max = r - l + 1;
            }
            r++;
        }
        return max;
    }

    private static int smallestSubarrayWithSum(int[] arr, int k) {
        int l = 0, sub = 0, minSub = Integer.MAX_VALUE;

        for (int r = 0; r < arr.length; r++) {
            sub += arr[r];
            while (sub >= k) {
                minSub = Math.min(r - l + 1, minSub);
                sub = sub - arr[l];
                l++;
            }
        }
        return minSub;
    }

    private static int longestOnesAfterFlips(int[] arr, int k) {

        int l = 0, r = 0, maxLen = 0, zeros = 0;
        int[] idx = {-1, -1};

        while (r < arr.length) {
            if (arr[r] == 0)
                zeros++;

            if (zeros > k) {
                if (arr[l] == 0)
                    zeros--;
                l++;
            }
            if (maxLen < r - l + 1) {
                maxLen = r - l + 1;
                idx[0] = l;
                idx[1] = r;
            }
            r++;
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, idx[0], idx[1] + 1)));
        return maxLen;
    }

    private static String minWindowSubstring(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> window = new HashMap<>();
        int l = 0, have = 0, needCount = need.size();
        int[] ans = {-1, -1};
        int minLen = Integer.MAX_VALUE;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && need.get(c) == window.get(c).intValue()) {
                have++;
            }

            while (have == needCount) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    ans[0] = l;
                    ans[1] = r;
                }
                char d = s.charAt(l);
                window.put(d, window.get(d) - 1);
                if (need.containsKey(d) && need.get(d) > window.get(d)) {
                    have--;
                }
                l++;
            }
        }
        return ans[0] == -1 ? "" : s.substring(ans[0], ans[1] + 1);
    }

    private static int subarrayProductLessThanK(int[] arr, int k) {
        getEaxctProdArrays(arr, k);
        int l = 0, r = 0, mul = 1, count = 0;

        while (r < arr.length) {
            mul = mul * arr[r];
            while (mul >= k) {
                mul = mul / arr[l];
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }

    private static void getEaxctProdArrays(int[] arr, int k) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = i; j < arr.length; j++) {
                prod = prod * arr[j];
                if (prod == k) {
                    list.add(Arrays.copyOfRange(arr, i, j + 1));
                }
            }
        }
        for (int[] ar : list) {
            System.out.println(Arrays.toString(ar));
        }
    }

    private static int longestUniqueSubstring(String str) {
        int l = 0, r = 0, maxLen = 0, idx = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (r < str.length()) {
            char ch = str.charAt(r);
            if (map.containsKey(ch)) {
                if (map.get(ch) >= l) {
                    l = map.get(ch) + 1;
                }
            }
            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1;
                idx = l;
            }
            map.put(ch, r);
            r++;
        }
        System.out.println(str.substring(idx, idx + maxLen));
        return maxLen;
    }

    private static List<Integer> slidingWindowMax(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
            if (dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }
        return result;
    }

    private static List<Integer> firstNegativeInWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                dq.addLast(i);

            if (i >= k - 1) {
                while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                    dq.pollFirst();
                }
                result.add(dq.isEmpty() ? 0 : arr[dq.peekFirst()]);
            }
        }

        return result;
    }

    private static int subarraysWithSumK(int[] arr, int k) {
        getEaxctSubArrays(arr, k);
        return atMost(arr, k) - atMost(arr, k - 1);
    }

    private static void getEaxctSubArrays(int[] arr, int k) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    list.add(Arrays.copyOfRange(arr, i, j + 1));
                }
            }
        }
        for (int[] a : list) {
            System.out.println(Arrays.toString(a));
        }
    }

    private static int atMost(int[] arr, int k) {
        int l = 0, r = 0, count = 0, sum = 0;

        while (r < arr.length) {
            sum += arr[r];
            while (sum > k) {
                sum = sum - arr[l];
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }

    private static String longestSubstringKDistinct(String str, int k) {
        int l = 0, r = 0, maxLen = 0, idx = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < str.length()) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);

            if (map.size() > k) {
                map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
                if (map.get(str.charAt(l)) == 0) {
                    map.remove(str.charAt(l));
                }
                l++;
            }
            if (maxLen < r - l + 1) {
                maxLen = r - l + 1;
                idx = l;
            }
            r++;
        }
        System.out.println(str.substring(idx, idx + maxLen));
        return String.valueOf(maxLen);
    }

    private static String maxSumSubarray(int[] arr, int k) {
        int l = 0, r = k - 1, maxSum = 0, sum = 0, idx = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = sum;

        while (r < arr.length - 1) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            if (maxSum < sum) {
                maxSum = sum;
                idx = l;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, idx, r + 1)));
        return String.valueOf(maxSum);
    }
}
