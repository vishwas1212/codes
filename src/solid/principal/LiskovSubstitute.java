package solid.principal;

import solid.principal.drivers.Bird;
import solid.principal.drivers.Sparrow;

/*
   so this principal says that if a class A is being subclassed by class B, so the
   any point of time class B should replace the class A.
    */
public class LiskovSubstitute {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.fly();
    }
}
