package javatechie.map_reduce;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeDatabase {
    public static List<Employee> getEmployees() {
        return List.of(
                new Employee(101, "john", "A", 60000),
                new Employee(102, "peter", "B", 30000),
                new Employee(103, "mak", "A", 80000),
                new Employee(104, "json", "C", 15000)
        );
    }
}
