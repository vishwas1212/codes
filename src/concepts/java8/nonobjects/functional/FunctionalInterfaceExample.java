package concepts.java8.nonobjects.functional;

@FunctionalInterface
public interface FunctionalInterfaceExample {

    // 1. Abstract Method (must be implemented)
    int operate(int a, int b);

    // 2. Default Method
    default void showResult(int result) {
        validate(result);
        System.out.println("Result = " + result);
    }

    // 3. Static Method
    static void info() {
        System.out.println("Operations Interface - Utility Info");
        log("Static info call");
    }

    // 4. Private Method (used by default methods)
    private void validate(int result) {
        System.out.println("Validating result...");
    }

    // 5. Private Static Method (used by static methods)
    private static void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}
