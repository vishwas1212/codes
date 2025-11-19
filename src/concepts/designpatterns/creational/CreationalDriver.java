package concepts.designpatterns.creational;

import java.util.Objects;

/*
Use Case: Logger, Configuration, DB Connections
 */
public class CreationalDriver {
    public static void main(String[] args) {
        System.out.println("Singleton Starts");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + s3.hashCode());
        if (s1.hashCode() == s2.hashCode() && s2.hashCode() == s3.hashCode()) {
            System.out.println("Singleton");
        }
        System.out.println("Singleton Ends");
        System.out.println("FactoryMethod Starts");
        FactoryMethodNotification fmn = NotificationFactory.createNotification("email");
        fmn.notifyUser();
        System.out.println("FactoryMethod Ends");
        System.out.println("AbstractFactoryPattern Starts");
        AbstractFactoryPattern.GUIFactory macFactory = new AbstractFactoryPattern.Macfactory();
        AbstractFactoryPattern.Button macbutton = macFactory.createButton();
        macbutton.paint();

        AbstractFactoryPattern.GUIFactory winFactory = new AbstractFactoryPattern.WinFactory();
        AbstractFactoryPattern.Button winFactoryButton = winFactory.createButton();
        winFactoryButton.paint();
        System.out.println("AbstractFactoryPattern Ends");
        System.out.println("UserBuilder Starts");
        UserBuilder user = new UserBuilder.Builder()
                .name("Ramraja")
                .age(32)
                .email("ramraja@gmail.com")
                .build();
        System.out.println(user);
        System.out.println("UserBuilder Ends");
        System.out.println("PrototypeEmployee Starts");
        PrototypeEmployee pemp1 = new PrototypeEmployee(1, "Ram");
        PrototypeEmployee pemp2 = pemp1.clone();
        System.out.println(pemp1 + " " + pemp2);
        System.out.println(pemp1.hashCode());
        System.out.println(pemp2.hashCode());
        System.out.println(Objects.equals(pemp1, pemp2));
        System.out.println(pemp1 == pemp2);
        System.out.println(pemp1.equals(pemp2));
        System.out.println("PrototypeEmployee Ends");
    }
}
