package features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8FrequentProgrammingQA {
    public static void main(String[] args) {
        /*
        *   Java program to count the occurrence of each character in a string
        * Ex: ilovejavatechie
        * a = 1, c = 1, t = 1, e = 3, v = 2, h = 1, i = 2, j = 1, l = 1, o = 1
        * */
        String input = "ilovejavatechie";

        // find each char occurrence
        Map<String, Long> map =   Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        /*
        * Java program to find all duplicate element from a given string
        * a = 2, c = 1, t = 1, e = 3, v = 2, h = 1, i = 2, j = 1, l = 1, o = 1
        * */
        // find all duplicate elements from a given string
        List<String> duplicateElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(duplicateElements);

//        find unique elements
        List<String> uniqueElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(uniqueElements);

            /*
            *   Java program to find the first non-repeat element from a given string
            *   Ex: ilovejavatechie
            * a = 2, c = 1, t = 1, e = 3, v = 2, h = 1, i = 2, j = 1, l = 1, o = 1
            * */
            String firstNonRepeatElement = Arrays.stream(input.split(""))
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,  Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)
                    .findFirst()
                    .get()
                    .getKey();

        System.out.println("1st Non repeat element " + firstNonRepeatElement);

        /*
        * Java program to find second highest number from a given array
        * int[] numbers = {5, 9, 11, 2, 8, 21};
        * */
        int[] numbers = {5,9,11,2,1,8,21};
       Integer secondHighest = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
               .get();

        System.out.println(secondHighest);

        /*
        * Java program to find longest string from given array
        * String[] strArray = {"java", "techie", "spring boot", "microservice"};
        * */
        String[] strArray = {"java", "techie", "spring boot", "microservices", "dockerk8s amazonwebservice"};

        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) ->word1.length() > word2.length() ? word1 : word2)
                .get();

        System.out.println(longestString);

        /*
        * Java program to find all elements from array who starts with 1
        * int numbers = {5,9,11,2,8,21,1}
        * */
        int[] numbers1 = {5,9,11,2,8,21,1};
        List<String> stringList = Arrays.stream(numbers)
                .boxed()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .toList();

        System.out.println(stringList);

        // String.join method
        List<String> nos = Arrays.asList("1","2", "3", "4");
        // 1-2-3-4
        String results = String.join("-", nos);
        System.out.println(results);

//        Skip & limit method use case based example (2-9)
        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);

//        Sort a list & map
//            map() & flatMap()

















    }
}
