package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (t) -> t % 2 == 0;
        System.out.println(predicate.test(7));

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(predicate).forEach(t -> System.out.println("Even number: " + t));
    }
}
