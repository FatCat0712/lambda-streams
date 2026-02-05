package eazybytes.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        mapInStreams();
    }

    public static void mapInStreams() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.stream().map(word -> word.toUpperCase()).forEach(System.out::println);
    }


}
