package olddsamixcodes.stack;

public class TestSkills {

	public static void main(String[] args) {
		String[] str = { "abcd", "abc", "abcdef", "abc" };
		String longestPrefix = getLongestPrefix(str);
		System.out.println(longestPrefix);
	}

	private static String getLongestPrefix(String[] str) {
		if (str.length == 0) {
			return "";
		}
		String minString = minString(str);
		int minStrLength = minString.length();
		for (int i = 0; i < str.length; i++) {
			int j;
			for (j = 0; j < minStrLength; j++) {
				if (minString.charAt(j) != str[i].charAt(j)) {
					break;
				}

			}
			if (j < minStrLength) {
				minStrLength = j;
			}
		}

		return minString.substring(0, minStrLength);
	}

	private static String minString(String[] str) {
		String minStr = str[0];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < minStr.length()) {
				minStr = str[i];
			}
		}
		return minStr;
	}

}
