package concepts.strings;

public class StringCompressionConsecutive {
    static void main() {
        String input = "aaabbc";

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        System.out.println(sb.toString());
    }
}
