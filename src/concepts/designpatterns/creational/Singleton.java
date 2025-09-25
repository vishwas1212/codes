package concepts.designpatterns.creational;

public class Singleton {
    private static Singleton INSTANCE;

    public Singleton() {
        if (INSTANCE != null) {
            throw new RuntimeException("SINGLETON ALREADY INSTANTIATED");
        }
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
