package olddsamixcodes.string;

public class DemoRepeat {

	public static void main(String[] args) {
		int[] a = { 2, 3, 2, 3, 4, 1, 1, 2, 1, 3, 1, 2, 3 };
		int j = 0;
		int k = 1;
		int count = 0;
		
		for(int i =0 ; i<= a.length; i++)
		{
			if(a[j] == a[k])
			{
				count = count+1;
				k++;
				System.out.println(count);
				
			}
			else
			{
				j = j+1;
			}
		}

	}

}
