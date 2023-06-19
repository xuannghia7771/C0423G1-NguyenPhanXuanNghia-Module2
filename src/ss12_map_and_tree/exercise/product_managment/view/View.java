package ss12_map_and_tree.exercise.product_managment.view;

import ss12_map_and_tree.exercise.product_managment.controller.ProductManagementController;

public class View {
    public static void main(String[] args) {
        ProductManagementController productManagementController = new ProductManagementController();
        productManagementController.showMenu();
    }
}
