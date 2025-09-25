package olddsamixcodes.string;

public class FindTheReverseFromSecondString {

	public static void main(String[] args) {

		String str = "Vishwas Vimal";
		String[] words=str.split("\\s");
		String ans="";
		
		for(String i: words)
		{
			StringBuilder sb=new StringBuilder(i);
			sb.reverse();
			ans=ans+sb.toString()+" ";
		}
		System.out.println(ans);

	}

}
