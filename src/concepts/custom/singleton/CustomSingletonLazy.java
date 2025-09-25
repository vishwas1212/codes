package concepts.custom.singleton;

// This class demonstrates the Lazy Initialization Singleton pattern with double-checked locking.
// The singleton instance is created only when getInstance() is called for the first time.
// The use of volatile and synchronized ensures thread safety and prevents multiple instantiations.
public class CustomSingletonLazy {

    private static volatile CustomSingletonLazy INSTANCE;

    private CustomSingletonLazy() {
    }

    public static CustomSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (CustomSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CustomSingletonLazy();
                }
            }
        }
        return INSTANCE;
    }
}