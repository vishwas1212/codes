package olddsamixcodes.demo;

public class WithoutMain {

	static int count = 0;
	static int count1 = 0;

	static {
		count++;
		System.out.println("Inside Static " + count);

	}

	{
		count1++;
		System.out.println("Inside Non Static " + count1);

	}
	public static void main(String[] args) {
		
		WithoutMain w1=new WithoutMain();
		WithoutMain w2=new WithoutMain();
		WithoutMain w3=new WithoutMain();
		WithoutMain w4=new WithoutMain();
		
	

	}
}
