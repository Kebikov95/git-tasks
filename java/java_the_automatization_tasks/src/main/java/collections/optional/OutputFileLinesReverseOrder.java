package collections.optional;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// 1. Enter lines from the file, write to the list.
// Print lines in a file in reverse order.
public class OutputFileLinesReverseOrder {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        File file = new File("./src/collections/optional/file.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
            reader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
