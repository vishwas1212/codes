package solid.principal.drivers;

public class Robot implements Workable{
    @Override
    public void work() {
        System.out.println("The Robot is working!");
    }
}
