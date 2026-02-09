package eazybytes.java8.misc;

import java.util.*;

public class MiscellaneousExamples {
    public static void main(String[] args) {
//        listReplaceAll();
//        listSort();
//        spliterator();
//        forEachRemaining();
//        forEach();
//        stringJoin();
//        arrayMethods();
//        numberMethods();
//        mathMethods();
//        objectsNullCheck();
        booleanMethods();
    }

    private static void listReplaceAll() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.add("Insurance");
        departmentList.add("Security");
        departmentList.add("Finance");
        System.out.println("Before List: " + departmentList);
        departmentList.replaceAll(element -> element.toUpperCase());
        System.out.println("List after replaceAll operation: " + departmentList);
    }

    private static void listSort() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.add("Insurance");
        departmentList.add("Security");
        departmentList.add("Finance");
        System.out.println("Before List: " + departmentList);
        departmentList.sort(Comparator.naturalOrder());
        System.out.println("List after sort operation: " + departmentList);
    }

    private static void forEachRemaining() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.add("Insurance");
        departmentList.add("Security");
        departmentList.add("Finance");
        departmentList.iterator().forEachRemaining(System.out::println);
    }

    private static void forEach() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.add("Insurance");
        departmentList.add("Security");
        departmentList.add("Finance");
        departmentList.forEach(System.out::println);
    }

    private static void spliterator() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.add("Insurance");
        departmentList.add("Security");
        departmentList.add("Finance");

        ArrayList<String> newList = new ArrayList<>();
        Spliterator<String> splitr = departmentList.spliterator();
        while(splitr.tryAdvance(value -> newList.add(value.toUpperCase())));

        Spliterator<String> newSplitr = newList.spliterator();
        while(newSplitr.tryAdvance(System.out::println));
    }

    private static void stringJoin() {
        String departments = String.join(", ", "Supply", "HR", "Sales");
        System.out.println(departments);
    }

    private static void arrayMethods() {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Arrays.setAll(array, ele -> {
            return array[ele] = array[ele] * 2;
        });
        System.out.println(Arrays.toString(array));

        int[] unsortedArr = {3, 78, 7, 91, 20, 1, 8, 54};
        Arrays.parallelSort(unsortedArr);
        System.out.println(Arrays.toString(unsortedArr));

        Arrays.parallelPrefix(array, (first, second) -> {
            return first + second;
        });
        System.out.println(Arrays.toString(array));
    }

    private static void numberMethods() {
        int sum = Integer.sum(234, 4565);
        int max = Integer.max(234, 4565);
        int min = Integer.min(234, 4565);

        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
    }

    private static void mathMethods() {
        long sum = Math.addExact(1234, 45456);
        long sub = Math.subtractExact(1234, 45456);
        long mul = Math.multiplyExact(1234, 45456);
        long inc = Math.incrementExact(45456);
        long dec = Math.decrementExact(1234);
        long neg = Math.negateExact(1234);
        int toInt = Math.toIntExact(12346576);
        int floorDiv = Math.floorDiv(45456, 1234);
        int floorMod = Math.floorMod(45456, 1234);
        float nextDown = Math.nextDown(12);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(inc);
        System.out.println(dec);
        System.out.println(neg);
        System.out.println(toInt);
        System.out.println(floorDiv);
        System.out.println(floorMod);
        System.out.println(nextDown);
    }

    private static void objectsNullCheck() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.add("Insurance");
        departmentList.add("Security");
        departmentList.add("Finance");
        departmentList.add(null);

        long nullCount = departmentList.stream().filter(Objects::isNull).count();
        long nonNullCount = departmentList.stream().filter(Objects::nonNull).count();
        System.out.println("Total null values in the list are: " + nullCount);
        System.out.println("Total non-null values in the list are: " + nonNullCount);
    }

    private static void booleanMethods() {
        Boolean checkAnd = Boolean.logicalAnd(10 > 5, "Eazy".equals("Eazy"));
        Boolean checkOr = Boolean.logicalOr(10 > 5, "Eazy".equals("Eazy Bytes"));
        Boolean checkXor = Boolean.logicalXor(false, true);

        System.out.println(checkAnd);
        System.out.println(checkOr);
        System.out.println(checkXor);
    }
}
