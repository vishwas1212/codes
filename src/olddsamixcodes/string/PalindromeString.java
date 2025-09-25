package olddsamixcodes.string;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "jahaj";
		int length = str.length();
		System.out.println(length / 2);

		boolean val = false;
		{
			for (int i = 0; i < length / 2; i++) {
				if (str.charAt(i) != str.charAt(length - i - 1)) {
					val = false;
				} else {
					val = true;
				}
			}
			System.out.println(val);
		}

		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb = sb.append(ch[i]);
		}
		if (str.equals("jahaj")) {
			System.out.println(sb + " " + str + " True");
		} else {
			System.out.println(sb + " " + str + " False");
		}

	}

}
