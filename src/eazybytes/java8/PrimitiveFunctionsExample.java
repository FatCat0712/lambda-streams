package eazybytes.java8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.function.*;

public class PrimitiveFunctionsExample {
    public static void main(String[] args) {
//        problemWithNormalFunctionInterfaces();
//        predicatePrimitiveFunctions();
//        functionPrimitiveFunctions();
//        biFunctionPrimitiveFunctions();
//        consumerPrimitiveFunctions();
//        supplierPrimitiveFunctions();
//        unaryPrimitiveFunctions();
        binaryPrimitiveOperations();
    }

    private static void problemWithNormalFunctionInterfaces() {
/*
*   Creating a Function
*   1) First the input value provided will be converted to Integer using AutoBoxing
*   2) Second the input value provided to the method body will be converted to int
*   using AutoUnboxing during the business logic
*   3) Finally after business logic the return value has to be converted to Integer
*   using AutoBoxing
* */
        Function<Integer, Integer> doubleTheValue = input -> input * 2;
        int[] iparray = {1,2,3,4,5,6,7,8,9,10};
        int[] oparray = new int[iparray.length];

        for(int i = 0; i < iparray.length; i++) {
            oparray[i] = doubleTheValue.apply(iparray[i]);
        }

        System.out.println("The output array is: " + Arrays.toString(iparray));
        System.out.println("The output array is: " + Arrays.toString(oparray));
    }

    private static void predicatePrimitiveFunctions() {
        IntPredicate checkInt = a -> a %  2 == 0;
        System.out.println("Output from IntPredicate is: " + checkInt.test(10));

        DoublePredicate checkDouble = a -> a %  2 == 0;
        System.out.println("Output from DoublePredicate is: " + checkDouble.test(10.0));

        LongPredicate checkLong = a -> a % 2 == 0;
        System.out.println("Output from LongPredicate is: " + checkLong.test(1034497756));
    }

    private static void functionPrimitiveFunctions() {
        IntFunction<String> applyInt = a -> Integer.toString(a);
        System.out.println("Output from IntFunction is: " + applyInt.apply(10));

        DoubleFunction<String> applyDouble = a -> Double.toString(a);
        System.out.println("Output from DoubleFunction is: " + applyDouble.apply(10.0));

        LongFunction<String> applyLong = a -> Long.toString(a);
        System.out.println("Output from LongFunction is: " + applyLong.apply(1034497756));

        ToIntFunction<String> toInt = a -> Integer.parseInt(a);
        System.out.println("Output from ToIntFunction is: " + toInt.applyAsInt("10"));

        ToDoubleFunction<String> toDouble = a -> Double.parseDouble(a);
        System.out.println("Output from ToDoubleFunction is: " + toDouble.applyAsDouble("10.0"));

        ToLongFunction<String> toLong = a -> Long.parseLong(a);
        System.out.println("Output from ToLongFunction is: " + toLong.applyAsLong("1034497756"));

        IntToLongFunction intToLong = a -> (long)a;
        System.out.println("Output from IntToLongFunction is: " + intToLong.applyAsLong(10));

        IntToDoubleFunction intToDouble = a -> (double) a;
        System.out.println("Output from IntToDoubleFunction is: " + intToDouble.applyAsDouble(10));

        LongToIntFunction longToInt = a -> (int)a;
        System.out.println("Output from LongToIntFunction is: " + longToInt.applyAsInt(10344));

        LongToDoubleFunction longToDouble = a -> (double)a;
        System.out.println("Output from LongToDoubleFunction is: " + longToDouble.applyAsDouble(10344));

        DoubleToIntFunction doubleToInt = a -> (int)a;
        System.out.println("Output from DoubleToIntFunction is: " + doubleToInt.applyAsInt(10.0));

        DoubleToLongFunction doubleToLong = a -> (long)a;
        System.out.println("Output from DoubleToLongFunction is: " + doubleToLong.applyAsLong(10344.0));

    }

    private static void biFunctionPrimitiveFunctions() {
        ToIntBiFunction<String, String> toIntBiFunction =(input1, input2) -> (Integer.parseInt(input1) + Integer.parseInt(input2));
        System.out.println("Output from ToIntBiFunction is: " + toIntBiFunction.applyAsInt("10", "20"));

        ToLongBiFunction<String, String> toLongBiFunc = (input1, input2) -> (Long.parseLong(input1) + Long.parseLong(input2));
        System.out.println("Output from toLongBiFunction is: " + toLongBiFunc.applyAsLong("1045556", "2065767"));

        ToDoubleBiFunction<String, String> toDoubleBiFunction = (input1, input2) -> (Double.parseDouble(input1) + Double.parseDouble(input2));
        System.out.println("Output from ToDoubleBiFunction is: " + toDoubleBiFunction.applyAsDouble("10.0", "2.0"));
    }

    private static void consumerPrimitiveFunctions() {
        IntConsumer intCons = a -> System.out.println("Output from IntConsumer:" + a);
        intCons.accept(10);

        LongConsumer longCons = a -> System.out.println("Output from LongConsumer:" + a);
        longCons.accept(1004345);

        DoubleConsumer doubleCons = a -> System.out.println("Output from DoubleConsumer:" + a);
        doubleCons.accept(10.0);

        ObjIntConsumer<String> objInt = (input, a) -> System.out.println("Output from ObjIntConsumer:" + input + a);
        objInt.accept("Ten", 10);

        ObjLongConsumer<String> objLong = (input,a) -> System.out.println("Output from ObjLongConsumer:" + input + a);
        objLong.accept("Thousand", 1000);

        ObjDoubleConsumer<String> objDouble = (input, a) -> System.out.println("Output from ObjDoubleConsumer: " + input + a);
        objDouble.accept("Ten", 10.0);
    }

    private static void supplierPrimitiveFunctions() {
        IntSupplier inSupp = () -> {
            Random rand = new Random();
            return rand.nextInt(1000);
        };
        System.out.println("Output from IntSupplier is: " + inSupp.getAsInt());

        LongSupplier longSupp = () -> {
            Random rand = new Random();
            return rand.nextLong();
        };
        System.out.println("Output from LongSupplier is: " + longSupp.getAsLong());


        DoubleSupplier doubleSupplier = () -> {
          Random random = new Random();
          return random.nextDouble();
        };

        System.out.println("Output from DoubleSupplier is: " + doubleSupplier.getAsDouble());

        BooleanSupplier booleanSupp = () -> LocalDate.now().isLeapYear();
        System.out.println("Output from BooleanSupplier is: " + booleanSupp.getAsBoolean());
    }

    private static void unaryPrimitiveFunctions() {
        IntUnaryOperator intUnary = a -> a * 2;
        System.out.println("Output from IntUnaryOperator is: " + intUnary.applyAsInt(24));

        LongUnaryOperator longUnary = a -> a * 2;
        System.out.println("Output from LongUnaryOperator is: " + longUnary.applyAsLong(456767));

        DoubleUnaryOperator doubleUnary = a -> a * 2;
        System.out.println("Output from DoubleUnaryOperator is: " + doubleUnary.applyAsDouble(4.5));
    }

    private static void binaryPrimitiveOperations() {
        IntBinaryOperator intBinary = (a,b) -> a + b;
        System.out.println("Output from IntBinaryOperator is: " + intBinary.applyAsInt(24,46));

        LongBinaryOperator longBinary = (a,b) -> a + b;
        System.out.println("Output from LongBinaryOperator is: " + longBinary.applyAsLong(456767, 5768787));

        DoubleBinaryOperator doubleBinary = (a,b) -> a + b;
        System.out.println("Output from DoubleBinaryOperator is: " + doubleBinary.applyAsDouble(4.5, 45.45));
    }




}
