package concurrency_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSearchTask implements Runnable {

    private String fileName;
    private String keyword;

    public FileSearchTask(String fileName, String keyword) {
        this.fileName = fileName;
        this.keyword = keyword;
    }

    @Override
    public void run() {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println("Keyword found in file: " + fileName);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}