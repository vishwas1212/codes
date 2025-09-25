package solid.principal;

import solid.principal.drivers.Eatable;
import solid.principal.drivers.Robot;
import solid.principal.drivers.Workable;
import solid.principal.drivers.Worker;

/*
   According to this no interface or method sholud be required to implement
   which is not going to be used.
     */
public class InterfaceSegregation {
    public static void main(String[] args) {
        Workable worker = new Worker();
        worker.work();
        ((Eatable) worker).eat();

        Workable robot = new Robot();
        robot.work();
    }
}
