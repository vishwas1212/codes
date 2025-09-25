package olddsamixcodes.demo;

public class FIndSumOfDigitInGivenString {

	public static void main(String[] args) {

		String str = "1111abc2222";
		char[] ch = str.toCharArray();
		int cur = 0;
		int sum = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				
				cur = cur * 10 + ch[i] - '0';
				
			} else {
				sum = sum + cur;
				
				cur = 0;
			}
		}
		sum = sum + cur;
		System.out.println(sum);

	}

}
