package javatechie.map_reduce;

import java.util.List;

public class StreamDebuggingSession {
    public static void main(String[] args) {

       List<String> names =  EmployeeDatabase.getEmployees().stream()
                .filter(e -> e.getSalary() > 40000)
                .map(Employee::getName)
                .distinct()
               .sorted()
               .skip(0)
               .limit(3)
                .toList();

        System.out.println(names);
    }
}
