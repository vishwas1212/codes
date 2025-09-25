package concepts.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class Demo {
    private static String message = "Hello";

    public void print() {
        System.out.println(message);
    }

    public static void main(String[] args) throws Exception {
        Class<?> claaz = Demo.class;

        Object obj = claaz.getDeclaredConstructor().newInstance();

        //Access private fields
        Field field = claaz.getDeclaredField("message");
        field.setAccessible(true);
        field.set(obj, "Hello From Reflections");

        //call method
        Method method = claaz.getMethod("print");
        method.invoke(obj);
    }
}
