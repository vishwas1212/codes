package olddsamixcodes.string;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] str = { "abcd", "abc", "abcdef", "abc" };
		String longestPrefix = getLongestCommonPrefix(str);
		System.out.println(longestPrefix);
	}

	private static String getLongestCommonPrefix(String[] str) {
		if (str.length == 0) {
			return "";
		}

		String minStr = getMinString(str);
		int minStrLength = minStr.length();
		for (int i = 0; i < str.length; i++) {
			int j;
			for (j = 0; j < minStrLength; j++) {
				if (minStr.charAt(j) != str[i].charAt(j)) {
					break;
				}
			}
			if (j < minStrLength) {
				minStrLength = j;
			}
		}
		return minStr.substring(0,minStrLength);
	}

	private static String getMinString(String[] str) {
		String minStr = str[0];
		for (int i = 1; i < str.length; i++) {
			if (str[i].length() < minStr.length()) {
				minStr = str[i];
			}
		}
		return minStr;
	}
}
