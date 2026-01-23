package javatechie.stream.sort;

import javatechie.stream.api.example.Database;
import javatechie.stream.api.example.Employee;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        List<Employee> employees = Database.getEmployees();

//        Collections.sort(employees, new MyComparator());

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return Math.toIntExact((int) o1.getSalary() - o2.getSalary());
//            }
//        });

//        Collections.sort(employees, (e1, e2) -> Math.toIntExact(e1.getSalary() - e2.getSalary()));
//
//        System.out.println(employees);

//        employees.javatechie.stream()
//                .sorted((o1, o2) -> (int)(o2.getSalary() - o1.getSalary()))
//                .forEach(System.out::println);

//        employees.javatechie.stream()
//                .sorted(Comparator.comparing(e -> e.getSalary()))
//                .forEach(System.out::println);

        employees.stream()
                .sorted(Comparator.comparing(Employee::getDept))
                .forEach(System.out::println);




/*        Collections.sort(list); // ASCENDING
        Collections.reverse(list);

        System.out.println(list);

//        list.javatechie.stream().sorted().forEach(t -> System.out.println(t)); // ASCENDING
        list.javatechie.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);*/
    }

    static class MyComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Math.toIntExact(o1.getSalary() - o2.getSalary()); // ASCENDING
        }
    }
}
