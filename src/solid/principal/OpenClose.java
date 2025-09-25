package solid.principal;

import solid.principal.drivers.Shape;

import java.util.List;

/*
   A class should be created in such a way that it does its job perfectly without having that fear that
   it will be changed in the future.
   It should be closed for the alteration but open for extends.
    */
public class OpenClose {
    public double totalArea(List<Shape> shapes) {
        return shapes.stream().mapToDouble(Shape::area).sum();
    }
}
