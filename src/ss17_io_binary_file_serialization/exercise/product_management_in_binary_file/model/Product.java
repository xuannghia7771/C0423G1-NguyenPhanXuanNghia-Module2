package ss17_io_binary_file_serialization.exercise.product_management_in_binary_file.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String productID;
    private String productName;
    private double price;
    private String publisher;
    private String description;

    public Product() {

    }

    public Product(String productID, String productName, int price, String publisher, String description) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.publisher = publisher;
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
