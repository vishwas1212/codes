package concepts.collections.equalsandhashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeDriver {
    static void main() {
        Employee e1 = new Employee(101, "Ram");
        Employee e2 = new Employee(101, "Ram");

        Map<Employee, String> map = new HashMap<>();
        map.put(e1, "dummy");
        map.put(e2, "dummy");

        System.out.println(map + " " + map.size());

        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set + " " + set.size());
    }
}
