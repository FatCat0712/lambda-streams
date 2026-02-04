package eazybytes.java8.lambda.util;

public class ArithmeticImplementation {
    public static void main(String[] args) {
        int firstInt = 10, secondInt =6;
        ArithmeticOperation oldSum = new ArithmeticOperation() {
            @Override
            public int performOperation(int a, int b) {
                return 0;
            }
        };

        System.out.println("The sum of two input integers without lambda is: " + oldSum.performOperation(firstInt, secondInt));

        ArithmeticOperation sum = (a,b) -> a + b;
        ArithmeticOperation multi = (a,b) -> a * b;
        ArithmeticOperation sub = (a,b) -> a - b;

        System.out.println("The sum of two input integers is : " + sum.performOperation(firstInt, secondInt));
        System.out.println("The multiplication of two input integers is : " + multi.performOperation(firstInt, secondInt));
        System.out.println("The substraction of two input integers is: " + sub.performOperation(firstInt, secondInt));
    }
}
