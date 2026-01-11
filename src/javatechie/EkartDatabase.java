package javatechie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EkartDatabase {
    public static List<Customer> getAll() {
        return List.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("3894662854", "3286487236")),
                new Customer(104, "kelly", "kely@gmail.com", Arrays.asList("3892468293664", "948609467"))
        );
    }
}
