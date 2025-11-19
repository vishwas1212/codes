package concepts.singleton;

import java.io.Serializable;
/*
This class demonstrates a thread-safe,
 lazy-initialized Singleton pattern that is also safe for serialization.
Implements Serializable to allow object serialization.
Uses double-checked locking for thread-safe, lazy initialization.
Implements readResolve() to ensure the same instance is returned during deserialization,
preventing multiple instances.
 */
public class CustomSngletonSerilizable implements Serializable {

    public static final long serialVersion = 1L;

    private static CustomSngletonSerilizable INSTANCE;

    private CustomSngletonSerilizable() {
    }

    public static CustomSngletonSerilizable getInstance() {
        if (INSTANCE == null) {
            synchronized (CustomSngletonSerilizable.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CustomSngletonSerilizable();
                }
            }
        }
        return INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
