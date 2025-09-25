package concepts.custom.singleton;
/*
This class demonstrates the Static Block Initialization Singleton pattern.
The singleton instance is created in a static block,
 allowing exception handling during instantiation.
The instance is created when the class is loaded, ensuring thread safety.
Useful if the creation logic might throw a checked exception.
 */
public class CustomSingletonStatic {

    private static CustomSingletonStatic INSTANCE;

    private CustomSingletonStatic() {
    }

    static {
        try {
            INSTANCE = new CustomSingletonStatic();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static CustomSingletonStatic getInstance() {
        return INSTANCE;
    }
}
