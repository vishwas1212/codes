package concepts.oops;

public class Parent {
    public int a = 10;
    private int b = 10;
    int c = 10;
    protected int d = 10;

    public void publicMethod() {
        System.out.println("publicMethodParent"+a);
    }

    private void privateMethod() {
        System.out.println("privateMethodParent"+b);
    }

    void defaultMethod() {
        System.out.println("defaultMethodParent"+c);
    }

    protected void protectedMethod() {
        System.out.println("protectedMethodParent"+d);
    }

    static void printMessage() {

        System.out.println("Hello from static method!");

    }

}
