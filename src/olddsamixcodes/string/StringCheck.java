package olddsamixcodes.string;

public class StringCheck {

	public static void main(String[] args) {
		String str1 = "ABC";
		String str2 = "DE";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int count;
		String opt1 = "";
		String opt2 = "";

		for (int i = 0; i < str1.length(); i++) {
			count = 0;
			for (int j = 0; j < str2.length(); j++) {
				if (ch1[i] == ch2[j]) {
					count = count + 1;
				}

			}
			if (count == 0) {
				opt1 = opt1 + ch1[i];
			}

		}

		for (int i = 0; i < str2.length(); i++) {
			count = 0;
			for (int j = 0; j < str1.length(); j++) {
				if (ch2[i] == ch1[j]) {
					count = count + 1;
				}

			}
			if (count == 0) {
				opt2 = opt2 + ch2[i];

			}

		}
		System.out.println(opt1 + "\n" + opt2);
		
	}

}
