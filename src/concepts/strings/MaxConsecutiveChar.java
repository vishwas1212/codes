package concepts.strings;

public class MaxConsecutiveChar {
    public static void main(String[] args) {
        String input = "aaabbbcccccccccccddddccccccccccccccccccccccc";
        char maxChar = input.charAt(0);
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = input.charAt(i);
            }
        }

        for (int i = 0; i < maxCount; i++) {
            String strRes = Character.toString(maxChar);
            System.out.print(strRes);
        }
    }
}
