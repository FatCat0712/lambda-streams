package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SkipLimitExample {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
                .skip(2)
                .limit(6)
                .forEach(System.out::print);

        System.out.println();
        System.out.println("================================");
        List<String> fileData = Files.readAllLines(Paths.get("data.txt"));
        System.out.println(fileData.size());
        fileData.stream()
                .skip(1)
                .limit(fileData.size()-2)
                .forEach(System.out::println);


    }
}
