package solid.principal.drivers;

import solid.principal.OpenClose;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OpenCloseTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.0, 5.0);
        Shape circle = new Circle(6.6);
        Shape square = new Square(7.0);
        List<Shape> shapes = Arrays.asList(rectangle, circle, square);
        OpenClose openClose = new OpenClose();
        double totalArea = openClose.totalArea(shapes);
        System.out.println(totalArea);
    }
}
