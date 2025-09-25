package olddsamixcodes.demo;


class R{
	
	
	R()
	{
		System.out.println("Const R");
	}
	static {
		System.out.println("Static Block R");
	}
	public static void methodR()
	{
		System.out.println("Static R");
	}
	
	public void show1()
	{
		System.out.println("R");
	}
	
	void display()
	{
		System.out.println("Display R!");
	}
}


class S extends R{
	S()
	{
		System.out.println("Const S");
	}
	

	static {
		System.out.println("Static Block S");
	}
	
	public static void methodS()
	{
		System.out.println("Static S");
	}
	
	public void show()
	{
		System.out.println("S");
	}
	
	void display()
	{
		System.out.println("Display!");
	}
}

public class InheritanceImpl1 {

	public static void main(String[] args) {
		R s=new S();
		s.show1();
		s.display();

	}

}
