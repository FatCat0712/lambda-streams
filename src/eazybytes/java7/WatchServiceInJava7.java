package eazybytes.java7;

import java.io.IOException;
import java.nio.file.*;

public class WatchServiceInJava7 {
    public static void main(String[] args) throws IOException, InterruptedException {
        directoryWatchService();
    }


    public static void directoryWatchService() throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("D:\\projects\\java8\\src\\eazybytes\\watchservice");
        if(!Files.exists(path)) {
            Files.createDirectory(path);
        }
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        boolean poll = true;
        WatchKey key = watchService.take();

        while(poll) {
            for(WatchEvent<?> event : key.pollEvents()) {
                System.out.println("Event kind: " + event.kind() + " - for the file : " + event.context());
            }
            poll = key.reset();
        }


    }
}
