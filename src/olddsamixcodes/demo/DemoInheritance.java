package olddsamixcodes.demo;

 class DemoInheritance {

	public DemoInheritance() {
		System.out.println("A");
	}
}

 class DemoInheritanceB extends DemoInheritance {

	public DemoInheritanceB() {
		System.out.println("B");
	}
}

 class DemoInheritanceC extends DemoInheritanceB {

	public DemoInheritanceC() {
		System.out.println("C");
	}
}

 class Main1
 {
	 public static void main(String[] args) {
		 DemoInheritance c=new DemoInheritanceC();
	}
 }