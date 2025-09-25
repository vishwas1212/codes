package concepts.custom.singleton;

// This class demonstrates the Eager Initialization Singleton pattern.
// The singleton instance is created when the class is loaded.
// This approach is thread-safe but may create the instance even if it is never used.
public class CustomSingletonEager {

    private CustomSingletonEager() {
    }

    private static final CustomSingletonEager INSTANCE = new CustomSingletonEager();

    public static CustomSingletonEager getInstance() {
        return INSTANCE;
    }

}
