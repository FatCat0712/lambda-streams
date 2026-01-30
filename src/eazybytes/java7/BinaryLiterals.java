package eazybytes.java7;

public class BinaryLiterals {
    public static void main(String[] args) {
        byte byteBinary = 0b111;
        short shortBinary = 0B001;
        int intBinary = 0B101;
        long longBinary = 0b00000111011100011;

        System.out.println("The value of byte number is: " + byteBinary);
        System.out.println("The value of short number is: " + shortBinary);
        System.out.println("The value of int number is: " + intBinary);
        System.out.println("The value of long number is: " + longBinary);

        int num = 5;
        System.out.println("Is Decimal and Binary value is the same ? : " + (intBinary == num));
        System.out.println("The value of long after multiplication is: " + (longBinary * 2));
    }
}
