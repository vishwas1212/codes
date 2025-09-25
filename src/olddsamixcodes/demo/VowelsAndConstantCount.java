package olddsamixcodes.demo;

public class VowelsAndConstantCount {

	public static void main(String[] args) {
		String str = "ramraja";
		char[] ch = str.toCharArray();
		int vowCount = 0;
		int conCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				System.out.println("Vowel: " + ch[i]);
				vowCount++;
			} else {
				System.out.println("Constant :" + ch[i]);
				conCount++;
			}
		}
		String s2 = String.valueOf(ch);
		System.out.println(s2);

		System.out.println("Vowel Count : " + vowCount);
		System.out.println("Constat Count : " + conCount);

	}

}
