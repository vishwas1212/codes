package concepts.oops;

public class Child extends Parent{

    @Override
    public void publicMethod() {
        System.out.println("publicMethodchild");
    }


    private void privateMethod() {
        System.out.println("privateMethodchild");
    }

    @Override
    void defaultMethod() {
        System.out.println("defaultMethodchild");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("protectedMethodchild");
    }
}
