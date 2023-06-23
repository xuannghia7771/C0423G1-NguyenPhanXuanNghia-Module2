package ss16_io_file_text.exercise.read_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class UtilReadFile {
    public static List<String> readFile(String pathFile){
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
