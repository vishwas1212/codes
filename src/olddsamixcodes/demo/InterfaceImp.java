package olddsamixcodes.demo;

interface A1 {

	void show();

	default void display() {
		System.out.println("Display A1");
	}

}

interface B1  {

	void show();
	
	default void display()
	{
		System.out.println("Display B1");
	}
}

class C1 implements A1,B1
{

	@Override
	public void show() {
		
	}

	@Override
	public void display() {
		A1.super.display();
		
	}
	
}

public class InterfaceImp  {

	public static void main(String[] args) {
		C1 c=new C1();
		c.show();
		c.display();

	}

}
