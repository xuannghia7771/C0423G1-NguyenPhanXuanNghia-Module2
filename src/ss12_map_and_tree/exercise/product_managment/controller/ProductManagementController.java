package ss12_map_and_tree.exercise.product_managment.controller;

import ss12_map_and_tree.exercise.product_managment.service.IProductService;
import ss12_map_and_tree.exercise.product_managment.service.ProductService;

import java.util.Scanner;

public class ProductManagementController {
    private IProductService productService = new ProductService();
    public void showMenu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----Product Management---- \n"+
                                "1. Add new product\n"+
                                "2. Edit product by id\n"+
                                "3. Delete product by id\n"+
                                "4. Display product list\n"+
                                "5. Find product by name\n"+
                                "6. Sort product in ascending order by price\n"+
                                "7. Sort product in descending order by price\n"+
                                "8. Exit");
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    //add
                    productService.addNewProduct();
                    break;
                case "2":
                    //edit by id
                    productService.editProduct();
                    break;
                case "3":
                    //delete by id
                    break;
                case "4":
                    //display
                    productService.displayProductList();
                    break;
                case "5":
                    //find by name
                    break;
                case "6":
                    //sort ascending
                    break;
                case "7":
                    //sort descending
                    break;
                case "8":
                    //exit
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập sai chức năng! Vui lòng nhập lại");
            }
        }while (flag);
    }
}
