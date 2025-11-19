package concepts.designpatterns.creational;

public interface FactoryMethodNotification {
    void notifyUser();
}

class SMSNotification implements FactoryMethodNotification {

    @Override
    public void notifyUser() {
        System.out.println("SMS");
    }
}

class EMAILNotification implements FactoryMethodNotification {

    @Override
    public void notifyUser() {
        System.out.println("EMAIL");
    }

}

class NotificationFactory {
    public static FactoryMethodNotification createNotification(String type) {
        if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }
        return new EMAILNotification();
    }
}
