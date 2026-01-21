package javatechie.method_reference;

public class Test {
    public void m1() {
        System.out.println("m1() instance/non-static method");
    }

    public static void m2() {
        System.out.println("m2() static method");
    }

    public static void main(String[] args) {
//        reference :: methodName

//        Test::m2(); -> static method reference

        Test.m2();
        Test test = new Test();
        test.m1();

//        test::m1(); -> instance method reference
//        constructor reference




    }
}
