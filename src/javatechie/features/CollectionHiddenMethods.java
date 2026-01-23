package javatechie.features;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionHiddenMethods {
    public static void main(String[] args) {
//        Collections.nCopies()
        List<String> names =  Collections.nCopies(5, "JavaTechie"); // immutable list
        System.out.println(names);

        try {
            names.set(0, "Youtube");
        }catch (UnsupportedOperationException e) {
            System.out.println("List is immutable, it can't be modified");
        }

//        Collections.frequency()
            List<Integer> numbers = Arrays.asList(1,2,3,4,3,1,2,4,5,6,7,4, 3,6,1,2,6);
            long count = Collections.frequency(numbers, 4);
            System.out.println("4) presents " + count + " times in a given list");

//            find occurrence of each element in given list
            Map<Integer, Integer> countMap =  numbers.stream()
                    .collect(Collectors.toMap(
                            number -> number,
                            number -> Collections.frequency(numbers, number),
                            (existingValue, newValue) -> existingValue
                    ));

        System.out.println(countMap);

//        Collections.disjoint()
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1,2,3,4,5);

        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2 ,78,9,10);

        boolean areDisjoint = Collections.disjoint(list1, list2);
        if(areDisjoint) {
            System.out.println("This list has no common element");
        }
        else {
            System.out.println("This list has common element");
        }

//        Collections.singleton
        Set<String> myCollection = Collections.singleton("JavaTechie");
        try {
            myCollection.add("test data");
        }catch (UnsupportedOperationException e) {
            System.out.println("Set is immutable, it can't be modified");
        }

//        Collections.rotate()
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i <= 10; i++) {
                list.add(i);
            }
//          [1,2,3,4,5,6,7,8,9,10])
//            System.out.println("Original list: " + list);
//
//        rotate right
//            Collections.rotate(list, 3);
//
//        System.out.println("Rotated list: " + list);
//        rotate left
//            Collections.rotate(list, -4);

//        Collections.rotate(list, list.size());
        Collections.rotate(list, -2);
        System.out.println("Rotated list: " + list);





    }
}
