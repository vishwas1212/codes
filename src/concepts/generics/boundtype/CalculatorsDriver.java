package concepts.generics.boundtype;

public class CalculatorsDriver {
    static void main() {
        Calculators<Double> c = new Calculators<>();
        System.out.println(c.square(2.0));

        Calculators<Integer> c2 = new Calculators<>();
        System.out.println(c2.square(5));

       // Calculators<String> c3 = new Calculators<String>();
    }
}
