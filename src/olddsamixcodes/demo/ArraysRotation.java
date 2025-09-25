package olddsamixcodes.demo;

public class ArraysRotation {

	public static void main(String[] args) {
		
		int[] a= {3, 98,76,0,14,45,0,0,87,0 };
		int n=a.length;
		int d=3;
		
		int p=1;
		
		while(p<=d)
		{
			int last=a[0];
			for(int i=0; i<n-1; i++)
			{
				a[i]=a[i+1];
			}
			a[n-1]=last;
			p++;
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
