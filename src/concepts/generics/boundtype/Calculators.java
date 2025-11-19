package concepts.generics.boundtype;

public class Calculators<T extends Number> {

    public double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}
