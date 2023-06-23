package ss16_io_file_text.exercise.copy_file_text;

import java.util.*;
import java.io.*;

public class ReadAndWrite {
    public static void writeFile(String pathFile, List<String> text, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            int num = 0;
            for (String s : text) {
                bufferedWriter.write(s);
                num += s.length();
                //bufferedWriter.newLine();
            }
            bufferedWriter.write("\nTổng số ký tự " + num);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readFile(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
