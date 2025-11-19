package concepts.designpatterns.creational;

public class Singleton {

    public static Singleton INSTANCE;

    private Singleton() {
        if (INSTANCE != null) {
            throw new RuntimeException("Instance is not null");
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

