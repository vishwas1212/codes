package olddsamixcodes.string;

public class Alphabets {

	public static void main(String[] args) {

		int a = 64;
		int b = 1;
		int temp = a;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				temp = temp + b;
				System.out.print((char)temp + "\t");
			}
			b++;
			temp = a;
			System.out.println("");

		}

	}

}
