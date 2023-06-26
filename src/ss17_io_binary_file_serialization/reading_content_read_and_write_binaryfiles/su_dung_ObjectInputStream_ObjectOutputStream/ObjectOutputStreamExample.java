package ss17_io_binary_file_serialization.reading_content_read_and_write_binaryfiles.su_dung_ObjectInputStream_ObjectOutputStream;

import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/ss17_io_binary_file_serialization/reading_content_read_and_write_binaryfiles/su_dung_ObjectInputStream_ObjectOutputStream/productOutput.txt"));
            Product product = new Product(1, "IPhone 12", 2800000, "New");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Success!");
    }
}
