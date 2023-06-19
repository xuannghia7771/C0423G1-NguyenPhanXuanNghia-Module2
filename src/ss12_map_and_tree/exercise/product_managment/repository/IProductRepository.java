package ss12_map_and_tree.exercise.product_managment.repository;

import ss12_map_and_tree.exercise.product_managment.model.Product;
import java.util.*;
public interface IProductRepository {
    List<Product> getProductList();
    void addNewProduct(Product product);
    void editProduct(Product product);
}
