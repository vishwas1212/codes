package concepts.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person {
    private String name = "John";

    private void sayHello() {
        System.out.println("Hello," + name);
    }
}

public class ReflectionAccessExample {
    static void main() throws Exception {
        Person person = new Person();

        // 🔹 Load class dynamically
        Class<?> clazz = person.getClass();

        // 🔹 Access private field
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(person, "Vishwas");

        // 🔹 Access private method
        Method method = clazz.getDeclaredMethod("sayHello");
        method.setAccessible(true);
        method.invoke(person);

    }

}
