package concepts.singleton;

import java.lang.reflect.Constructor;

public class CustomSingletonDestroyReflection {
    public static void main(String[] args) {
        CustomSingletonEager instanceOne = CustomSingletonEager.getInstance();
        CustomSingletonEager instanceTwo = null;

        try {
            Constructor[] constructors = CustomSingletonEager.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (CustomSingletonEager) constructor.newInstance();
                //    instanceTwo = CustomSingletonEager.getInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
