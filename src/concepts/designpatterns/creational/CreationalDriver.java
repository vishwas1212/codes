package concepts.designpatterns.creational;
/*
Use Case: Logger, Configuration, DB Connections
 */
public class CreationalDriver {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
        if (s1.hashCode() == s2.hashCode() && s2.hashCode() == s3.hashCode()) {
            System.out.println("Singleton");
        }
    }
}
