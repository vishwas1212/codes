package solid.principal.drivers;

public class Worker implements Workable, Eatable {
    @Override
    public void eat() {
        System.out.println("The Worker is eating!");
    }

    @Override
    public void work() {
        System.out.println("The Worker is working");
    }
}
