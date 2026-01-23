package javatechie.functional;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {
    public static void main(String[] args) {
//            Consumer<Integer> consumer = n -> System.out.println("Printing numbers: " + n);
//
//            consumer.accept(5);
//            consumer.accept(1);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach((t-> System.out.println("Printing: " + t)));

    }
}
