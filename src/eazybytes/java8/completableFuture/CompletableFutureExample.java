package eazybytes.java8.completableFuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        runAsync();
//        supplyAsync();
//        thenApply();
        thenAccept();
        System.out.println("Main thread");
    }

    private static void runAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> async = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Running in a separate thread than the main method");
            }catch (InterruptedException ex) {
                throw new IllegalStateException();
            }
        });
        System.out.println("runAsync Blocking 1");
        async.get();
        System.out.println("runAsync Blocking 2");
    }

    private static void supplyAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<String> async = CompletableFuture.supplyAsync(() -> {
           try {
               TimeUnit.SECONDS.sleep(1);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           return "Eazy Bytes";
        });
        System.out.println("supplyAsync Blocking 1");
        String result = async.get();
        System.out.println(result);
        System.out.println("supplyAsync Blocking 2");
    }

    private static void thenApply() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
           try {
               TimeUnit.SECONDS.sleep(1);
           }catch (InterruptedException ex) {
               throw new IllegalStateException(ex);
           }
           return "Eazy";
        });
        System.out.println("then apply middle block");

        CompletableFuture<String> finalFuture = future.thenApply(name -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e) {
                throw new IllegalStateException();
            }
            return name + "Bytes";
        });

        System.out.println("thenApply before final block");
        System.out.println(finalFuture.get());
        System.out.println("thenApply Blocking");
    }

    private static void thenAccept() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Accept";
        }).thenAccept(result -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            System.out.println("Received the value: " + result);
        });
        System.out.println("thenAccept non-blocking");
        future.get();

    }

}
