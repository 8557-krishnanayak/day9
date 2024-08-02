package Resources;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FileProcessor {
    public void processFiles(List<String> filePathList) {

        for (String path : filePathList) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "C:\\Users\\krishna.nayak\\Documents\\java\\Day_9\\src\\Resources\\file.txt",
                "C:\\Users\\krishna.nayak\\Documents\\java\\Day_9\\src\\Resources\\log.txt",
                "C:\\Users\\krishna.nayak\\Documents\\java\\Day_9\\src\\Resources\\text.txt");
        FileProcessor processor = new FileProcessor();
        processor.processFiles(list);
    }
}
