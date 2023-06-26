package ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.repository;

import ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.model.Product;
import ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.utils.ReadAndWrite;
import ss5_accessmodifier_static_getter_setter.exercise.student.Student;

import java.util.*;


public class ProductRepository implements IProductRepository{
    private final static String PRODUCT_PATH = "src/ss17_io_binary_file_serialization/exercise/product_management_in_binary_file/data/product.txt";

    public ArrayList<Product> display(){
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList = (ArrayList<Product>) ReadAndWrite.readBinaryFile(PRODUCT_PATH);
        return productArrayList;
    }
    public void addProduct(Product product){
        List<Product> productList = new ArrayList<>();
        productList = ReadAndWrite.readBinaryFile(PRODUCT_PATH);
        productList.add(product);
        ReadAndWrite.writeBinaryFile(PRODUCT_PATH, productList);
    }
}
