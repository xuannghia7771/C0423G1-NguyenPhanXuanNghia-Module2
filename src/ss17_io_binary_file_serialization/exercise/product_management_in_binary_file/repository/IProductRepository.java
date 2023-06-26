package ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.repository;

import ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> display();
    void addProduct(Product product);
}
