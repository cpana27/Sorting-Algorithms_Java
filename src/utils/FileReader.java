package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    private final String path = "src\\ressources\\exampleNumbers.csv";

    public ArrayList<Integer> readFile() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextInt() || scanner.hasNextLine()) {
                arr.add(scanner.nextInt());
            }
            scanner.close();
            return arr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
