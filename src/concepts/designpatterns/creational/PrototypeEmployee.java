package concepts.designpatterns.creational;

import java.util.Objects;

public class PrototypeEmployee implements Cloneable {
    int id;
    String name;

    public PrototypeEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public PrototypeEmployee clone() {
        return new PrototypeEmployee(this.id, this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PrototypeEmployee that = (PrototypeEmployee) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "PrototypeEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
