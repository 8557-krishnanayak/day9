package MultipleResourse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        String file1_path = "C:\\Users\\krishna.nayak\\Documents\\java\\Day_9\\src\\MultipleResourse\\file.txt";
        String file2_path = "C:\\Users\\krishna.nayak\\Documents\\java\\Day_9\\src\\MultipleResourse\\log.txt";
        String writer_path = "C:\\Users\\krishna.nayak\\Documents\\java\\Day_9\\src\\MultipleResourse\\text.txt";


        try (FileReader file1 = new FileReader(file1_path);
             FileReader file2 = new FileReader(file2_path);
             FileWriter writer = new FileWriter(writer_path);

             BufferedReader in_file1 = new BufferedReader(file1);
             BufferedReader in_file2 = new BufferedReader(file2);
        ) {

            String line = "";
            while ((line = in_file1.readLine()) != null) {
                System.out.println(line);
                for (char c : line.toCharArray())
                    writer.append(c);
            }

            writer.append('\n');
            while ((line = in_file2.readLine()) != null) {
                System.out.println(line);
                for (char c : line.toCharArray())
                    writer.append(c);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
