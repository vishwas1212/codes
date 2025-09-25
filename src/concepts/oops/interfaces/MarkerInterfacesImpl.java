package concepts.oops.interfaces;

import java.io.Serializable;

class Person implements Serializable, Cloneable {
    int i;

    Person() {
        System.out.println("Person created");
    }

    Person(int i) {
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Animal implements Cloneable{
    int i;

    Animal() {
        System.out.println("Animal Created");
    }

    public Animal(int i) {
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class MarkerInterfacesImpl {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Animal animal = new Animal();

        Animal a = new Animal(10);
        Person p = new Person(11);

        Animal b = (Animal) a.clone();
        Person q = (Person) p.clone();

        System.out.println(b.i + " : " + q.i);

        if (person instanceof Serializable) {
            System.out.println("Person Serializable");
        } else {
            System.out.println("Person Not Serialized");
        }

        if (animal instanceof Serializable) {
            System.out.println("Animal Serializable");
        } else {
            System.out.println("Animal Not Serialized");
        }
    }
}
