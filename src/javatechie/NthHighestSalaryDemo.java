package javatechie;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryDemo {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("anil", 1000);
        map1.put("bhvana", 1300);
        map1.put("micael", 1500);
        map1.put("tom", 1600);
        map1.put("ankit", 1200);
        map1.put("daniel", 1700);
        map1.put("james", 1400);

        System.out.println(getNthHighestSalary(1, map1));

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("anil", 1000);
        map2.put("ankit", 1200);
        map2.put("bhavna", 1200);
        map2.put("james", 1200);
        map2.put("micael", 1000);
        map2.put("tom", 1300);
        map2.put("daniel", 1300);

//        System.out.println(getNthHighestSalary(2, map2));
            Map.Entry<Integer, List<String>>  map =  map2.entrySet().stream()
                    .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                    .entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                    .toList()
                    .get(1);

        System.out.println(map);

        System.out.println(getDynamicNthHighestSalary(3, map1));

    }

    public static Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map) {
            return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList()
                .get(num - 1);
    }

    public static Map.Entry<Integer, List<String>> getDynamicNthHighestSalary(int number, Map<String, Integer> map) {
        return map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(number - 1);
    }

}
