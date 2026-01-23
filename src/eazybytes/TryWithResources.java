package eazybytes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws Exception {
//            beforeJava7();
//            withJava7();
            withCustomResInJava7();
    }

    public static void beforeJava7() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\projects\\java8\\src\\eazybytes\\eazybytes.txt"));
            String sCurrentLine;
            while((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } finally {
            br.close();
        }
    }

    public static void withJava7() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\projects\\java8\\src\\eazybytes\\eazybytes.txt"))){
            String sCurrentLine;
            while((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        }
    }

    public static void withCustomResInJava7() throws Exception {
        try (CustomResource cr = new CustomResource()) {
            cr.readFromResource();
        }
    }







}
