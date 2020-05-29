package collections.optional;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 6. Enter lines from the file, write to the ArrayList list.
// Sort strings using the sort () method from the Collections class.
public class CollectionsSort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("./src/collections/optional/poem.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while(line != null){
                list.add(line);
                line = reader.readLine();
            }
            System.out.println("Poem before Collections.sort():");
            for (String poemLine:list) {
                System.out.println(poemLine);
            }
            Collections.sort(list);
            System.out.println("\nPoem after Collections.sort():");
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
