package ss12_map_and_tree.exercise.product_managment.repository;

import ss12_map_and_tree.exercise.product_managment.model.Product;

import java.util.*;

public class ProductRepository implements IProductRepository{
    private static List<Product> productList = new ArrayList<>();
    static {
        Product product1 = new Product(1,"iphone",2000);
        Product product2 = new Product(3,"dell",3500);
        Product product3 = new Product(4,"samsung",4000);
        Product product4 = new Product(2,"oppo",1234);
        Product product5 = new Product(7,"macbook",5555);
        Product product6 = new Product(5,"hp",1500);
        Product product7 = new Product(6,"asus",2569);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
    }


    @Override
    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void addNewProduct(Product product) {
        productList.add(product);
    }
    public void editProduct(Product product) {
        for (Product p : productList) {
            if(p.getId() == product.getId()) {
                p = product;
            }
        }
    }
}
