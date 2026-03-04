package concurrency_io;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileSearchMain {

    public static void main(String[] args) {

        String keyword = "Java";

        String[] files = {
                "file1.txt",
                "file2.txt",
                "file3.txt"
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (String file : files) {
            executor.submit(new FileSearchTask(file, keyword));
        }

        executor.shutdown();
    }
}