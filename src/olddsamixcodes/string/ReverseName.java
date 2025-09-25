package olddsamixcodes.string;

public class ReverseName {

	public static void main(String[] args) {
		String str = "Vishwas Vimal";
		str = str.replaceAll("\\s", "");
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = str.length()-1; i >= 0; i--) {
			sb=sb.append(ch[i]);
		}
		System.out.println(sb.toString());
	}

}
