package ss7_abstract_class_and_interface.exercise.interface_resizeable;

import javax.swing.*;
import java.text.DecimalFormat;

public class ResizeableInterfaceTest {
    public static void main(String[] args) {
        // Thay đổi kích thước theo tỉ lệ ngẫu nhiên từ 1-100
        double percent = (Math.random() * 99) + 1;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.7);
        shapes[1] = new Rectangle(4.0, 10.0);
        shapes[2] = new Square(5.0);

        //Thư viện định dạng số thập phân trong lớp DecimalFormat
        DecimalFormat dF = new DecimalFormat();
        //Chỉ lấy 2 phần thập phân = phương thức setMaximumFractionDigits
        dF.setMaximumFractionDigits(2);

        String[] text = new String[3];
        text[0] = "hình tròn";
        text[1] = "hình chữ nhật";
        text[2] = "hình vuông";
        double specificPercentage = 0.0d;
        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].getArea();
            System.out.println("Diện tích " + text[i] + " trước khi thay đổi kích thước: " + dF.format(area));
            System.out.println("Sau khi thay đổi kích thước: " + dF.format(shapes[i].resizable(percent)) + "\n");
            specificPercentage = (100 * (shapes[i].resizable(percent) - shapes[i].getArea())) / shapes[i].getArea();

        }
        System.out.println("Vậy các hình đã tăng lên cụ thể là: " + dF.format(specificPercentage) + "%");
    }
}
