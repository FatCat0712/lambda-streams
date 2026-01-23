package javatechie.features;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamFeatures {
    public static void main(String[] args) {
//                   1. Stream.ofNullable
//                  2. Stream.iterate()
//                  3. Collectors.collectingAndThen
//                  4. Stream.takeWhile and Stream.dropWhile
//                  5. Collectors.teeing()
//                  6. Stream.concat()
//                  7. Collectors.partitioningBy()
//                  8. IntStream for Ranges
        List<String> names = Arrays.asList("Basant", "Santosh", null, "Vinod", null, "Sam", "John");
        List<String> result =   names.stream()
                .filter(name -> name != null)
                .toList();

        System.out.println(result);

//        1
        List<String> collect = names.stream()
                .flatMap(Stream::ofNullable)
                .toList();

        System.out.println(collect);

//        2
        Stream.iterate(0, n -> n + 2)
                .limit(5)
                .forEach(System.out::println);

//        3
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob",60000),
                new Employee("Charlie", 78000),
                new Employee("Sarah", 45000)
        );

//        calculate avg salary & round up to nearest integer
        Long employeeResult = employees.stream()
                .mapToDouble(Employee::getSalary)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.averagingDouble(Double::doubleValue),
                        Math::round));

        System.out.println(employeeResult);

//
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> num2 = numbers.stream()
                .dropWhile(num -> num < 5)
                .toList();
        System.out.println(num2);

        List<Integer> numResults = numbers.stream()
                .dropWhile(num -> num < 3)
                .takeWhile(num -> num < 7)
                .toList();

        System.out.println(numResults);

//        Collectors.teeing()
//        1 -> min
//        2 -> max
//        map
        Map<String, Integer> minMaxMap = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.maxBy(Integer::compareTo), // 1st collector
                        Collectors.minBy(Integer::compareTo), // 2st collector
                        (e1, e2) -> Map.of("max", e1.get(), "min", e2.get()))
                );

        System.out.println(minMaxMap);

        Stream<Integer> stream1= Stream.of(1,2,3);
        Stream<Integer> stream2 = Stream.of(4,5,6);

        Stream<Integer> concatStream = Stream.concat(stream1, stream2);
        long sum = concatStream.mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.partitioningBy(num->num% 2 == 0));

        System.out.println("odd number: " + map.get(Boolean.FALSE));
        System.out.println("even number: " + map.get(Boolean.TRUE));

        List<Integer> intStream1 = IntStream.range(1, 20).boxed().toList();
        System.out.println(intStream1);

        List<Integer> intStream2 = IntStream.rangeClosed(1, 20).boxed().toList();
        System.out.println(intStream2);






    }
}
