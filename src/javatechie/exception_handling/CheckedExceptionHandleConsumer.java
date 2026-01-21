package javatechie.exception_handling;

@FunctionalInterface
public interface CheckedExceptionHandleConsumer<Target, ExObj extends Exception> {
    public void accept(Target target) throws ExObj;
}
