package ss17_io_binary_file_serialization.reading_content_read_and_write_binaryfiles.su_dung_ObjectInputStream_ObjectOutputStream;

import java.io.Serializable;
public class Product implements Serializable {
    // Biến serialVersionUID có tác dụng xác nhận object lúc gửi/nhận
    // tương thích với quá trình Serialization
    private static final long serialVersionUID = -266706354210367639L;

    private int id;
    private String name;
    private double price;
    private String description;

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
