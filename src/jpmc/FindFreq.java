package jpmc;

public class FindFreq {
    public static void main(String[] args) {
        String input = "aabbezcdeff";
        Character result = findFirstNonRepeating(input);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    private static Character findFirstNonRepeating(String input) {

        int[] count = new int[256];

        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }

        for (int i = 0; i < input.length(); i++) {
            if (count[input.charAt(i)] == 1) {
                return input.charAt(i);
            }
        }
        return null;
    }
}
