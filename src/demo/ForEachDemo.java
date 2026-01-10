package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachDemo {
//    filter ----> conditional check


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Murrit");
        list.add("john");
        list.add("peter");
        list.add("marek");
        list.add("mac");

//     )

//        list.stream().forEach(t -> System.out.println(t));

        Predicate<String> predicate = t -> t.startsWith("m");

        list.stream().filter(predicate).forEach(t -> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

//        map.forEach((key, value) -> System.out.println(key + ": " + value));
        map.entrySet().stream()
                .filter(e -> e.getKey() % 2 == 0)
                .forEach(obj -> System.out.println(obj));
//
//        Consumer<String> consumer = (t) -> System.out.println(t);
//        consumer.accept("Java Techie");
//
//        list.forEach(consumer);
//
//        for (String s1 : list) {
//            consumer.accept(s1);
//        }




    }
}
