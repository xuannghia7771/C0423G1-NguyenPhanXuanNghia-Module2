package ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.controller;


import ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.service.IProductService;
import ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.service.ProductService;

import java.util.*;
import java.io.*;
public class ProductController {
   IProductService productService = new ProductService();
   public void showMenu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("---------MENU---------");
            System.out.println("1. THÊM SẢN PHẨM\n" +
                    "2. HIỂN THỊ SẢN PHẨM\n" +
                    "3. TÌM KIẾM SẢN PHẨM\n" +
                    "4. THOÁT");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    //them
                    productService.addNewProduct();
                    break;
                case 2:
                    //hien thi
                    productService.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }while (flag);
    }
}
