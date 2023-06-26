package ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.service;

import ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.model.Product;
import ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.repository.IProductRepository;
import ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();

    public void display() {
        List<Product> productList = productRepository.display();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void addNewProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        String ID = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập hãng: ");
        String publisher =sc.nextLine();
        System.out.println("Nhập mô tả sản phẩm: ");
        String description = sc.nextLine();
        Product newProduct = new Product(ID, name, price, publisher, description);
        productRepository.addProduct(newProduct);
    }
}
