package eazybytes.java8.streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
//        mapInStreams();
        flatMapInStreams();
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


}
