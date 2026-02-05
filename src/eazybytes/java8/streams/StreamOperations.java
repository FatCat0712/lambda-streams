package eazybytes.java8.streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
//        mapInStreams();
//        flatMapInStreams();
//        filterInStreams();
//        limitInStreams();
//        skipInStreams();
//        traverseOnceInStreams();
        reduceInStreams();
    }

    public static void mapInStreams() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.stream().map(word -> word.toUpperCase()).forEach(System.out::println);
    }

    public static void flatMapInStreams() {
        String[] arrayOfWords = {"Eazy", "Bytes"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        /*streamOfWords
                .map(word -> word.split(""))
                .map(arr -> Arrays.stream(arr))
                .forEach(System.out::println);*/

        Stream<String[]> streamOflLetters = streamOfWords.map(word -> word.split(""));
        streamOflLetters.flatMap(Arrays::stream).forEach(System.out::println);

        List<List<String>> list = Arrays.asList(Arrays.asList("Eazy"), Arrays.asList("Bytes"));
        System.out.println(list);
        list.stream().map(Collection::stream).forEach(System.out::println);
        list.stream().flatMap(Collection::stream).forEach(System.out::println);
    }

    public static void filterInStreams() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        Stream<String> depStream = departmentList.stream();
        depStream.filter(word -> word.startsWith("S")).forEach(System.out::println);
    }

    public static void limitInStreams() {
        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
    }

    public static void skipInStreams() {
        Stream.iterate(1, n -> n +1).skip(10).limit(20).forEach(System.out::println);
    }

    public static void reduceInStreams() {
        System.out.println(Stream.iterate(1, n -> n + 1).limit(20).reduce(0, (a,b)-> a + b));
    }

    public static void traverseOnceInStreams() {
        try {
            List<String> departmentList = new ArrayList<>();
            departmentList.add("Supply");
            departmentList.add("HR");
            departmentList.add("Sales");
            departmentList.add("Marketing");
            Stream<String> depStream = departmentList.stream();
            depStream.forEach(System.out::println);
            depStream.forEach(System.out::println);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }




}
