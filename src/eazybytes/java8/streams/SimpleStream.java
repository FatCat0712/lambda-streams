package eazybytes.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        Stream<String> depStream = departmentList.stream();
        depStream.forEach(System.out::println);

        Stream<String> inStream = Stream.of("Eazy", "Bytes", "Java");
        inStream.forEach(System.out::println);

        Stream<String> parallelStream = departmentList.parallelStream();
        parallelStream.forEach(System.out::println);

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);

    }
}
