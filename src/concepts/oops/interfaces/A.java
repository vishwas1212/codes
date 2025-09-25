package concepts.oops.interfaces;

public interface A {

    default void method() {
        System.out.println("default A");
    }
}
