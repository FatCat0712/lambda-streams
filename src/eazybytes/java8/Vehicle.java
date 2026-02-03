package eazybytes.java8;

public interface Vehicle {
    int getSpeed();
    void applyBreak();
    default void autoPilot(){
        System.out.println("I will help in driving with out manual support");
    }

    static void sayHello() {
        System.out.println("Hi, this is your favorite car");
    }
}
