package olddsamixcodes.demo;

public class ExceptionClass {

	public static void main(String[] args) {
		
		ExceptionClass.getBlock();
	}
	
	
	public static int getBlock()
	{
		try {
			System.out.println("try");
			return 1;
		} catch (Exception e) {
			System.out.println("catch");
			return 2;
		} finally {
			System.out.println("finally");
			return 3;
		}
	}

}
