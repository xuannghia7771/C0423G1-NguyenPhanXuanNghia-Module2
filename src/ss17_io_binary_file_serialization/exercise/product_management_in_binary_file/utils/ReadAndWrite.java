package ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.utils;
import ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.model.Product;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    public static void writeBinaryFile(String pathFile, List<Product> productList){
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Product> readBinaryFile(String pathFile){
        List<Product> productList = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream =new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file!");
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            System.err.println("Không tìm thấy class!");
        } catch (Exception e){
            e.printStackTrace();
        }
        return productList;
    }
}
