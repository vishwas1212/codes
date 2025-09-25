package concepts.java8.lambda;

public class Driver {
    public static void main(String[] args) {

        FunctionInterfcae addOps = (a, b) -> a + b;
        System.out.println(addOps.operations(5, 5));

        FunctionInterfcae subOps = (a, b) -> a - b;
        System.out.println(subOps.operations(5, 5));

        FunctionInterfcae mulOps = (a, b) -> a * b;
        System.out.println(mulOps.operations(5, 5));

        FunctionInterfcae divOps = (a, b) -> a / b;
        System.out.println(divOps.operations(5, 5));

        FunctionInterfcae powerOps = (a, b) -> a ^ b;
        System.out.println(powerOps.operations(5, 5));

        FunctionInterfcae perOps = (a, b) -> a % b;
        System.out.println(perOps.operations(5, 5));
    }
}
