package concepts.oops;

public class StaticMethods {
    public static void main(String[] args) {
        System.out.println("main");
        method1();
        method2();
    }

    static void method1() {
        System.out.println("static method 1");
    }

    static void method2() {
        System.out.println("static method 2");
    }
}
