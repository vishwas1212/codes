package olddsamixcodes.demo;

public class ArrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 6, 2, 4, 1, 8, 9, 1 };
		/*
		 * int j = 1;
		 * 
		 * for(int i = 0; i<= a.length; i++) { if(a[i] < a[j]) { j++;
		 * System.out.print(a[i]); } else if(a[i]>a[j]) { i = j; System.out.print(a[i]);
		 * } else {
		 * 
		 * }
		 * 
		 * }
		 */
		int min=a[0];
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
