package eazybytes.java7;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsInJava7 {
    private static final String HOME_DIR = "D:\\projects\\java8";

    public static void main(String[] args) {
        buildPath();
    }


    private static void buildPath() {
        Path path = Paths.get(HOME_DIR, "java7", "Test.txt");
        Path fileName = path.getFileName();;
        System.out.println("File name is : " + fileName.toString());
        System.out.println("File system is: " + path.getFileSystem());
        System.out.println("File system separator is: " + path.getFileSystem().getSeparator());

//        for (int i = 0; i < path.getNameCount(); i++) {
//            Path subPath = path.getName(i);
//            System.out.println("Path location at index" + (i + 1) + " is " + subPath);
//        }
//
//        System.out.println("Sub path is " + path.subpath(0, 2));
//        System.out.println("Root path is " + path.getRoot());
//        System.out.println("Parent path is " + path.getParent());
//
//        Path redundantPath = Paths.get(HOME_DIR, "java7", ".", "Test.txt");
//        System.out.println("Redundant path is " + redundantPath);
//
//        Path cleanPath = redundantPath.normalize();
//        System.out.println("Clean path is " + cleanPath);
//
//        URI uri = cleanPath.toUri();
//        System.out.println("URI path is " + uri);
//        System.out.println("Absolute path is " + cleanPath.toAbsolutePath());

//        Path partialPath = Paths.get(HOME_DIR, "java7");
//        Path combinedPath = partialPath.resolve("Test.txt");
//        System.out.println("Partial path is " + partialPath);
//        System.out.println("Combine path is " + combinedPath);
//
//        if(!partialPath.equals(combinedPath)) {
//            System.out.println("Paths are not  equal");
//        }


    }
}


