package olddsamixcodes.demo;

public class FindTheMinMaxInRow {
	
	static
	{
		System.out.println("FindTheMinMaxInRow");
	}

	public static void main(String[] args) {
		int[][] data = { { 3, 4, 5, 10 }, 
						 { 8, 7, 2, 11 }, { 2, 1, 9, 12 } };
		System.out.println("row " + "min " + "max");
		getMaxValue(data);
		getMinValue(data);
		getMaxAndMin(data);

	}

	private static int getMinValue(int[][] data) {
		int min = data[0][0];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (min > data[i][j]) {
					min = data[i][j];
				}
			}

		}
		return min;
	}

	private static int getMaxValue(int[][] data) {

		int max = data[0][0];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] > max) {
					max = data[i][j];

				}

			}

		}
		return max;
	}

	public static void getMaxAndMin(int[][] data) {
		int max = data[0][0];
		int min = data[0][0];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (max < data[i][j]) {
					max = data[i][j];
				}
				if (min > data[i][j]) {
					min = data[i][j];
				}
			}

			System.out.println(i  + "    " + min + "    " + max);
		}
	}

}
