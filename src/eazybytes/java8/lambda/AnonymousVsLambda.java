package eazybytes.java8.lambda;

import eazybytes.java8.lambda.util.ArithmeticOperation;

public class AnonymousVsLambda {
    int sum = 0;
    public void sum() {
        int tempSum = 0;
        ArithmeticOperation sumOperation = (a,b) -> {
            int sum = 0;

//            as local variable are saved in stack memory and may go out of scope while lambda is executing
//            tempSum = 0; // compilation error
            this.sum = a + b;
            System.out.println("The value of sum inside lambda is: " + sum);
            return this.sum;
        };
        System.out.println("The sum of given 2 numbers is: " + sumOperation.performOperation(10,20));
    }

    public static void main(String[] args) {
        AnonymousVsLambda lambda = new AnonymousVsLambda();
        lambda.sum();
    }
}
