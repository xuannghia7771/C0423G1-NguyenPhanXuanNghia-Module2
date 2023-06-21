package ss12_map_and_tree.exercise.product_managment.repository;

import ss12_map_and_tree.exercise.product_managment.model.Product;
import java.util.*;
public interface IProductRepository {
    List<Product> getProductList();
    void addNewProduct(Product product);

    int indexOfProduct(int id);
    //void deleteProduct();
    void editProduct(Product product);
}
