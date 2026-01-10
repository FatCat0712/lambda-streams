package demo;

@FunctionalInterface
interface Calculator {
//    void switchOn();
//    void sum(int input);
    int subtract(int i1, int i2);
}

public class CalculatorImpl{
//    @Override
//    public void switchOn() {
//        System.out.println("Switch on");
//    }
    // () ->  {body};

    public static void main(String[] args) {
//        Calculator calculator = () -> System.out.println("Switch on");
//
//        calculator.switchOn();

//            Calculator calculator = (n) -> System.out.println("Sum: " + n);
//            calculator.sum(394);

        Calculator calculator = (a,b) -> {
          if(b < a) {
              throw new RuntimeException("message");
          }
          else {
              return b - a;
            }
        };

        System.out.println(calculator.subtract(7,5));

    }
}
