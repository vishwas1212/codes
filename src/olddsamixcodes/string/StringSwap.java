package olddsamixcodes.string;

public class StringSwap {

	public static void main(String[] args) {
		  String s1="xyz";
		     String s2="abc";
		     
		     
		     s1=s1+s2;
		     s2=s1.substring(0,3);
		     s1=s1.substring(s2.length());
		     
		     System.out.println(s1);
		     System.out.println(s2);
	}

}
