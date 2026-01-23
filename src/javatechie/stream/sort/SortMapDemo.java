package javatechie.stream.sort;

import javatechie.stream.api.example.Employee;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> Math.toIntExact(o1.getSalary() - o2.getSalary()));
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);

//        System.out.println(employeeMap);

//        employeeMap.entrySet().javatechie.stream().forEach(System.out::println);

       /* List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        for(Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.entrySet().javatechie.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("**********************");
        map.entrySet().javatechie.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);*/

        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);




    }
}
