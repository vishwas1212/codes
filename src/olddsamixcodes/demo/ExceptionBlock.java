package olddsamixcodes.demo;

public class ExceptionBlock {

	public static void main(String[] args) {
		int a=ExceptionBlock.checkBlock();
		System.out.println(a);
	}
	
	public static int checkBlock()
	{
		try {
			System.out.println("try");
			int c=1/0;
			return 1;
		}
		catch(Exception e){
			System.out.println("catch");
			return 2;
		}
//		finally {
//			System.out.println("finally");
//			return 3;
//		}
	}

}
