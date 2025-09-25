package olddsamixcodes.demo;

public class InheritanceImpl {

	public static void main(String[] args) {

		A b = new B();
		int rest=C.sum(5);
		System.out.println(rest);

	}

}

class A {

	int x = 10;

	A() {
		int y = 10;
		System.out.println(this.hashCode());
	}

	public void varShow() {
		x = 12;
		System.out.println(x);
	}

	public Object methodOne() {
		return 10;
	}

	public void methodTwo() {
		System.out.println(10);
	}

	public static void methodThree() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("method three:" + c);
	}

}

class B extends A {

	B() {
		int y = 10;
		System.out.println(this.hashCode());
	}

	public void varShow() {
		x = 13;
		System.out.println(x);
	}

	@Override
	public Integer methodOne() {
		return 10;
	}

	public final void methodTwo() {
		System.out.println(20);
	}

	public static void methodThree() {
		int a = 14;
		int b = 15;
		int c = a + b;
		System.out.println("method three B:" + c);
	}
}

class C {

	public static int sum(int k) {
		System.out.println(k);
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}
}
