package concepts.java8.nonobjects.functional;

public class FunctionalInterfaceDriver implements FunctionalInterfaceExample {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }

    static void main() {
        FunctionalInterfaceDriver add = new FunctionalInterfaceDriver();

        // Calling abstract method implementation
        int result = add.operate(10, 20);

        // Calling default method from interface
        add.showResult(result);

        // Calling static method from interface
        FunctionalInterfaceExample.info();
    }
}
