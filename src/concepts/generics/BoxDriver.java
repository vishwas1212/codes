package concepts.generics;

public class BoxDriver {
    static void main() {
        Box<String> box = new Box<>();
        box.set("String box");
        System.out.println(box.get());

        Box<Integer> box1 = new Box<>();
        box1.set(1);
        System.out.println(box1.get());
    }
}
