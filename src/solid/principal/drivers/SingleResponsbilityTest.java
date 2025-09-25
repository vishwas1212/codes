package solid.principal.drivers;

import solid.principal.SingleResponsibility;

public class SingleResponsbilityTest {
    public static void main(String[] args) {
        SingleResponsibility singleResponsibility = new SingleResponsibility();
        singleResponsibility.addEmployee("Ram Raja");
        singleResponsibility.addEmployee("Vishwas Vimal");
        singleResponsibility.addEmployee("Kashmira Bawankar");
        singleResponsibility.addEmployee("Vaibhav Vimal");
        singleResponsibility.addEmployee("Muskan");
        System.out.println(singleResponsibility.getEmployees());
    }
}
