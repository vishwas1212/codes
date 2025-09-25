package concepts.custom.singleton;

// This class demonstrates the Bill Pugh Singleton pattern.
// The singleton instance is created only when getInstance() is called.
// The static inner class (SingletonHelper) holds the instance,
// ensuring thread safety and lazy initialization.
public class CustomSingletonBillPaugh {

    private CustomSingletonBillPaugh() {
    }

    private static class SingletonHelper {
        private static final CustomSingletonBillPaugh INSTANCE = new CustomSingletonBillPaugh();
    }

    public static CustomSingletonBillPaugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
