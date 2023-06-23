package ss16_io_file_text.exercise.copy_file_text;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> text = ReadAndWrite.readFile("src/ss16_io_file_text/exercise/copy_file_text/source_file.txt");
        ReadAndWrite.writeFile("src/ss16_io_file_text/exercise/copy_file_text/target_file.txt", text, false);
    }
}
