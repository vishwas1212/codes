package olddsamixcodes.demo;

interface InterfaceImpl {
	public static final int a = 0;

	void show(int a);
}

public class Iimpl implements InterfaceImpl {

	public static void main(String[] args) {
		Iimpl i = new Iimpl();
		// InterfaceImpl.a=12;
		System.out.println(InterfaceImpl.a);
		i.show(11);
	}

	public void show() {
		System.out.println("aA");

	}

	@Override
	public void show(int a) {
		// a=15;
		System.out.println(a);

	}
}
