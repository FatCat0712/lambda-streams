package javatechie.map_reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
    public static List<Employee> getEmployees() {
        return Stream.of(new Employee(101, "Basant", "DEV", 50000),
                new Employee(102, "Santosh", "FS", 70000),
                new Employee(104, "John", "DEV", 80000),
                new Employee(105, "Ajay", "DEV", 90000),
                new Employee(103, "Sam", "QA", 40000),
                new Employee(101, "Basant", "DEV", 50000),
                new Employee(161, "Yugendra", "QA", 100000),
                new Employee(236, "Ram", "UI", 3000),
                new Employee(272, "Bikash", "ADMIN", 35000),
                new Employee(299, "Bala", "Mng", 20000))
                .collect(Collectors.toList());
    }
}
