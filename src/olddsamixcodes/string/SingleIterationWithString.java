package olddsamixcodes.string;

import java.util.Arrays;

public class SingleIterationWithString {

	public static void main(String[] args) {
		String s="my name is vishwas";
		char[] ch=s.toCharArray();
		
		for(int i=0; i<ch.length-1; i++)
		{
			if(ch[i]>ch[i+1])
			{
				char temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
				i=-1;
			}
			else if (ch[i]==' ') {
				
			}
		}
		System.out.println(Arrays.toString(ch));
		
	}

}
