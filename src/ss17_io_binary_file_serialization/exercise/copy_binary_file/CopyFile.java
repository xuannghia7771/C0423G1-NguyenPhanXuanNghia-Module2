package ss17_io_binary_file_serialization.exercise.copy_binary_file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(new File("src/ss17_io_binary_file_serialization/exercise/copy_binary_file/source_file.txt"));
            os = new FileOutputStream(new File("src/ss17_io_binary_file_serialization/exercise/copy_binary_file/target_file.txt"));
            int length;
            byte[] bytes = new byte[1024];
            int size = is.available();
            while ((length = is.read(bytes)) > 0) {
                os.write(bytes, 0, length);
            }
            System.out.println("Copied successfully !");
            System.out.println("number of bytes = " + size);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            os.close();
            is.close();
        }
    }
}
