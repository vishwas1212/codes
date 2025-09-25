package solid.principal.drivers;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recipeient) {
        System.out.println("The Message sent to " + recipeient + ": " + message);
    }
}
