package concepts.arrays.sort;

public class DutchFlagChar {
    public static void main(String[] args) {
        char[] input = {'a','c', 'b', 'c', 'a', 'b', 'c', 'b', 'b', 'c'};

        int idx = 0, mid = 0;
        int lastIdx = input.length - 1;

        while (mid <= lastIdx) {
            if (input[mid] == 'a') {
                char temp = input[idx];
                input[idx] = input[mid];
                input[mid] = temp;
                idx++;
                mid++;

            } else if (input[mid] == 'b') {
                mid++;
            } else if (input[mid] == 'c') {
                char temp = input[lastIdx];
                input[lastIdx] = input[mid];
                input[mid] = temp;
                lastIdx--;
            }
        }
        for (char ch : input) {
            System.out.print(ch + " ");
        }
    }
}
