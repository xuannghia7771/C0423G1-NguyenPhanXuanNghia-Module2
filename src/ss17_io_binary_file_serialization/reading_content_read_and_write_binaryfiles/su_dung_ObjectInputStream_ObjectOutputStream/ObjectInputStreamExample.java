package ss17_io_binary_file_serialization.reading_content_read_and_write_binaryfiles.su_dung_ObjectInputStream_ObjectOutputStream;

import java.io.*;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src/ss17_io_binary_file_serialization/reading_content_read_and_write_binaryfiles/su_dung_ObjectInputStream_ObjectOutputStream/productInput.txt"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
