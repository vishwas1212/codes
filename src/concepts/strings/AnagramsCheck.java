package concepts.strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class AnagramsCheck {
    public static void main(String[] args) {
        String str1 = "ROBED";
        String str2 = "CORED";

        if (str1.length() == str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            Boolean flag = Arrays.equals(ch1, ch2);
            if(flag){
                System.out.println("Anagrams!");
            }else{
                System.out.println("Not Anagrams!");
            }
        } else {
            System.out.println("Not Anagrams!");
        }
    }
}
