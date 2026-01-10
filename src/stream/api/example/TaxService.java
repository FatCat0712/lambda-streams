package stream.api.example;

import java.util.List;

public class TaxService {
    public static List<Employee> evaluateTaxUsers(String input) {
        if (input.equalsIgnoreCase("tax")) {
            return Database.getEmployees().stream().filter(e -> e.getSalary() > 50000).toList();
        }
        else {
            return Database.getEmployees().stream().filter(e -> e.getSalary() <=  50000).toList();
        }
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("TAX"));
    }
}
