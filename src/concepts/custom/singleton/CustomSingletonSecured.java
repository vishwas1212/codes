package concepts.custom.singleton;

import java.io.Serializable;
/*
This class demonstrates a thread-safe, lazy-initialized Singleton pattern with enhanced security.
Prevents instance creation via reflection by throwing an exception in the constructor
 if an instance already exists.
Overrides clone() to prevent cloning.
Implements readResolve() to ensure the same instance during deserialization.
Uses double-checked locking for thread-safe, lazy initialization.
Implements Serializable for safe serialization.
 */
public class CustomSingletonSecured implements Serializable {

    public static final Long serialVersionUUID = 1L;

    private static CustomSingletonSecured INSTANCE;

    private CustomSingletonSecured() {
        if (INSTANCE != null) {
            throw new RuntimeException("SINGLETON ALREADY INSTANTIATED!");
        }
    }

    public static CustomSingletonSecured getInstance() {
        if (INSTANCE == null) {
            synchronized (CustomSingletonSecured.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CustomSingletonSecured();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return getInstance();
    }
}
