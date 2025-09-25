package solid.principal;

import java.util.ArrayList;
import java.util.List;

/*
    single responsibility per class
    Each class should have only one functionality. multiple functionality
    in the same class creates mashup the hole class.
     */
public class SingleResponsibility {


    private final List<String> employees = new ArrayList<>();

    // Adds an employee name to the list
    public void addEmployee(String name) {
        employees.add(name);
    }

    // Returns the list of employee names
    public List<String> getEmployees() {
        return new ArrayList<>(employees);
    }
}
