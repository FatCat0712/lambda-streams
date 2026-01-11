package javatechie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public  static Customer getCustomerByEmailId(String email) throws Exception {
        List<Customer> customers =  EkartDatabase.getAll();
        return customers.stream().filter(customer -> customer.getEmail().equals(email)).findAny().orElseThrow(() -> new Exception("No customer present with this id"));
    }



    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(101, "john", "test@gmail.com", Arrays.asList("397937955", "21654725"));

//        empty
//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);

//        of
//        Optional<String> emailOptional = Optional.of(customer.getEmail());
//        System.out.println(emailOptional);

//        ofNullable
        Optional<String> emailOptional2 = customer.getEmail();
//        if(emailOptional2.isPresent()) {
//            System.out.println(emailOptional2.get());
//        }
//        System.out.println(emailOptional2.orElse("default@email.com"));

//        System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("Email not present")));

        System.out.println(emailOptional2.map(String::toUpperCase).orElse("default email ..."));

        getCustomerByEmailId("pqr");


    }
}
