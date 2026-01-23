package javatechie.method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

//        Lambda
        EmployeeManager manager = ()->new Employee();
        manager.getEmployee().getEmployeeInfo();

        EmployeeManager manager1 = Employee::new;
        manager1.getEmployee().getEmployeeInfo();

        service.loadEmployeesFromDB()
                .stream()
                .map(Employee::getId)
                .map(ArrayList::new)
                .forEach(System.out::println);

////        anonymous implementation
//        service.loadEmployeesFromDB()
//                .forEach(new Consumer<Employee>() {
//                    @Override
//                    public void accept(Employee employee) {
//                        System.out.println(employee);
//                    }
//                });
//
//        System.out.println("==========================");
//
////        lambda expression
//        service.loadEmployeesFromDB()
//                .forEach(e -> System.out.println(e));
//
//        System.out.println("==========================");
//
////        Method reference with custom type
//        service.loadEmployeesFromDB()
//                .forEach(MethodReferenceDemo::print);
//
//        System.out.println("==========================");
//
////        Method reference with predefined class
//        service.loadEmployeesFromDB()
//                .forEach(System.out::println);
//
//        System.out.println("==========================");


//        List<EmployeeDO> employeeDOS = service.loadEmployeesFromDB()
//                .javatechie.stream()
//                .map(new Function<Employee, EmployeeDO>() {
//                    @Override
//                    public EmployeeDO apply(Employee employee) {
//                        return EmployeeMapper.convert(employee);
//                    }
//                })
//                .toList();

        EmployeeMapper employeeMapper = new EmployeeMapper();
        List<EmployeeDO> employeeDOS = service.loadEmployeesFromDB()
                .stream()
                .map(employeeMapper::convert) // instance method reference
                .toList();

        System.out.println(employeeDOS);


        List<String> nameList = service.loadEmployeesFromDB()
                .stream()
//                if the object method does not receive any input. It can be considered as static method reference
                .map(Employee::getName)
                .toList();

        System.out.println(nameList);






    }

    public static void print(Employee employee) {
        System.out.println(employee);
    }

//    reference : constructor -> new
//    EmployeeDO::new

}
