package olddsamixcodes.string;

import java.util.Arrays;

public class AnagramsWidOneLetterDifferent {

	public static void main(String[] args) {
		String str1 = "race";
		String str2 = "ddre";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		if (str1.length() != str2.length()) {
			System.out.println("False");
		} else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			int count = 0;

			str1 = String.valueOf(ch1);
			str2 = String.valueOf(ch2);
			
			System.out.println(str1 + " " + str2);

			for (int i = 0; i < str1.length(); i++) {
				
				if (ch1[i] != ch2[i]) {
					ch2[i] = ch1[i];
					count++;
				}

			}
			
			str1 = String.valueOf(ch1);
			str2 = String.valueOf(ch2);
			
			System.out.println(str1 + " " + str2);
			

			if (count > 1) {
				System.out.println("Cant be anagram " + count);
			} else {
				System.out.println("Can be anagram wid one different letter " + count);
			}
		}

	}

}
