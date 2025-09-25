package solid.principal.drivers;

import solid.principal.DependencyInversion;

public class DependencyInversionTest {
    public static void main(String[] args) {
        MessageService messageService = new EmailService();
        DependencyInversion inversion = new DependencyInversion(messageService);
        inversion.processMessage("Hi Joe, How are you doing?","joe@email.com");
    }
}
