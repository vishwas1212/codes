package concepts.strings;

public class StringPermutation {
    public static void main(String[] args) {
        String str1 = "CAT";
        String str2 = "";
        findPermutatio(str1, str2);
    }

    private static void findPermutatio(String str1, String str2) {
        if (str1.isEmpty()) {
            System.out.println(str2 + "");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            String str3 = str1.substring(0, i) + str1.substring(i + 1);
            findPermutatio(str3, str2 + c);
        }
    }
}
