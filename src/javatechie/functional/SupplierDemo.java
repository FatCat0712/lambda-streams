package javatechie.functional;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {
    public static void main(String[] args) {
//        Supplier<String> supplier = new SupplierDemo();
//        System.out.println(supplier.get());

//        Supplier<String> supplier = () -> "Hello JavaTechie";
//        System.out.println(supplier.get());
//
//        List<String> list = Arrays.asList("a", "b");
        List<String> list = Arrays.asList();

        System.out.println(list.stream().findAny().orElseGet(() -> "Hi viewers"));

    }
}
