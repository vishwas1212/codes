package concepts.oops;

public class ParentChildDriver {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.publicMethod();
        parent.defaultMethod();
        parent.protectedMethod();
        System.out.println("--------------------");
        Parent parent1 = new Child();
        parent1.a = 11;
        // parent1.b = 11;
        parent1.c = 11;
        parent1.d = 11;

        parent1.publicMethod();
        parent1.defaultMethod();
        parent1.protectedMethod();
        System.out.println(parent1.a + " " + parent1.c + " " + parent1.d);
        System.out.println("---------------------");

        Child child = new Child();
        child.publicMethod();
        child.defaultMethod();
        child.protectedMethod();
        child.a = 12;
        child.c = 12;
        child.d = 12;
        System.out.println(child.a + " " + child.c + " " + child.d);

        Parent par = new Parent();
        par.printMessage();
    }

}
