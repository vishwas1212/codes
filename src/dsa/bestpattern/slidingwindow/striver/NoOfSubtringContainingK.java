package dsa.bestpattern.slidingwindow.striver;

public class NoOfSubtringContainingK {
    static void main() {
        String string = "bbacba";
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            int[] hash = new int[3];
            for (int j = i; j < string.length(); j++) {
                hash[string.charAt(j) - 'a'] = 1;

                if (hash[0] + hash[1] + hash[2] == 3) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
