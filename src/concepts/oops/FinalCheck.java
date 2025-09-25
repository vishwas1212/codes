package concepts.oops;

public class FinalCheck {
    final int a = 10;
    static int b = 10;

    public void something() {
        System.out.println("Something");
    }

    final void finalMethod() {
        System.out.println("final method");
    }

    {
        System.out.println("final Block");
    }
}
