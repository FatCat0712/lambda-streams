package eazybytes.java8;

import eazybytes.java8.lambda.util.ArithmeticOperation;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        staticMethodReference();
        instanceMethodReference();
        instanceMethodWithClassName();
        constructorReference();
    }

    public static void constructorReference() {
        ProductInterface productUsingLambda = (name, price) -> new Product(name, price);
        Product prodSamsung = productUsingLambda.getProduct("Samsung Galaxy", 1000);
        System.out.println(prodSamsung.toString());

        ProductInterface productUsingRef = Product::new;
        Product prodApple = productUsingRef.getProduct("Apple Iphone", 1500);
        System.out.println(prodApple.toString());

    }

    public static void instanceMethodWithClassName() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.forEach(e -> System.out.println(e));

        departmentList.forEach(System.out::println);
    }

    public static void instanceMethodReference() {
        ArithmeticOperation operation = (a,b) -> {
            int sum = a + b;
            System.out.println("The sum of given input values " + "using lambda is: " + sum);
            return sum;
        };

        operation.performOperation(2,3);
        MethodReference methodRef = new MethodReference();
        ArithmeticOperation instanceMethod = methodRef::performInstanceAddition;
        instanceMethod.performOperation(2,3);
    }

    public int performInstanceAddition(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of given input values using instance: " + "method reference is: " + sum);
        return sum;
    }


    public static void staticMethodReference() {
        ArithmeticOperation operation = (a,b) -> {
            int sum = a + b;
            System.out.println("The sum of given input values using lambda is: " + sum);
            return sum;
        };

        operation.performOperation(2,3);
        ArithmeticOperation methodRef = MethodReference::performAddition;
        methodRef.performOperation(2,3);
    }

    public static int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of given input value using static method reference is: " + sum);
        return sum;
    }
}
