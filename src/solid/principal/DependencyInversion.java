package solid.principal;

import solid.principal.drivers.MessageService;

/*
   It stated that rather than dependent on the real implementation we should
   use the abstraction for it (either interface or abstract class).
    */
public class DependencyInversion {
    private final MessageService messageService;

    public DependencyInversion(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }
}
