package ss12_map_and_tree.exercise.product_managment.service;

import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;
import ss12_map_and_tree.exercise.product_managment.model.Product;
import ss12_map_and_tree.exercise.product_managment.repository.IProductRepository;
import ss12_map_and_tree.exercise.product_managment.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    private IProductRepository productRepository = new ProductRepository();
    @Override
    public void displayProductList() {
        List<Product> productList = productRepository.getProductList();
        for (Product p:productList) {
            System.out.println(p);
        }
    }

    @Override
    public void addNewProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());
        Product newProduct = new Product(id, name,price);
        productRepository.addNewProduct(newProduct);
    }

    @Override
    public void editProduct() {
        Scanner scanner = new Scanner(System.in);
        displayProductList();
        System.out.print("Nhập id muốn sửa: ");
        int idStudentEdit = Integer.parseInt(scanner.nextLine());
        Product productEdit = null;
        List<Product> studentList = productRepository.getProductList();
        for (Product s: studentList) {
            if(s.getId() == idStudentEdit) {
                productEdit = s;
            }
        }
        if(productEdit != null) {
            System.out.println(productEdit);
            System.out.print("Nhập tên mới: ");
            String name = scanner.nextLine();
            productEdit.setProductName(name);
            productRepository.editProduct(productEdit);
        } else
        {
            System.out.println("ko tìm thấy.");
        }
    }
}
