package javatechie;

import java.util.List;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EkartDatabase.getAll();

//        List<Customer> convert List<String> -> Data transformation
//        mapping: customer -> customer.getEmail()
//       customer -> customer.getEmail() one to one mapping
//        List<String> emails = customers.stream()
//                .map(Customer::getEmail)
//                .toList();
//        System.out.println(emails);

//        customer -> customer.getPhoneNumbers() -> one to many mapping
        List<List<String>> phoneNumbers = customers.stream().map(Customer::getPhoneNumbers).toList();

        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .toList();

        System.out.println(phoneNumbers);
        System.out.println(phones);





    }
}
