package concepts.strings;

public class FindHighFreqCharWIthoutStream {
    public static void main(String[] args) {
        String input = "aaabbbcccccddddc";
        int[] count = new int[256];
        char maxFreq = '\0';
        int maxFre = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            count[ch]++;

            if (maxFre < count[ch]) {
                maxFre = count[ch];
                maxFreq = ch;
            }

        }
        for(int i = 0;i<maxFre; i++)
        System.out.print(maxFreq);
    }
}
