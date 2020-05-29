package collections.optional;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// 4. List the poem. Sort ascending line lengths.
public class PoemReader {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        File file = new File("./src/collections/optional/poem.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while(line != null){
                list.add(line);
                line = reader.readLine();
            }
            System.out.println("Poem before sort:".toUpperCase());
            for (String poemLine:list) {
                System.out.println(poemLine);
            }
            list.sort((line1, line2) -> line1.length() - line2.length());
            System.out.println("\nPoem after sort:".toUpperCase());
            for (String poemLine:list) {
                System.out.println(poemLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
