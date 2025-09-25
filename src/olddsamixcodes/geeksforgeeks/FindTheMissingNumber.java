package olddsamixcodes.geeksforgeeks;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int n = arr.length;
		int miss = missingnumber(arr, n);
		System.out.println(miss);

	}

	private static int missingnumber(int[] arr, int n) {
		int total=(n+1)*(n+2)/2;
		for(int i=0; i<n;i++)
		{
			total=total-arr[i];
		}
		return total;
	}

}
