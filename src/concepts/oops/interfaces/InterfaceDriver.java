package concepts.oops.interfaces;

public class InterfaceDriver implements A,B{
    @Override
    public void method() {
       B.super.method();
    }

    public static void main(String[] args) {
        InterfaceDriver driver = new InterfaceDriver();
        driver.method();
    }
}
