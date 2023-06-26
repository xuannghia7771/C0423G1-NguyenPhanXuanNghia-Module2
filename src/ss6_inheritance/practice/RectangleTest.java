package ss6_inheritance.practice;

public class RectangleTest {
    public static void main(String[] args) {
//        Rectangle rectangle;
//        rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
        //sau khi ép kiểu tường minh đối tượng shape sử dụng được phương thức getArea() của rectangle
        Shape shape = new Shape();
        Rectangle rectangle1 = (Rectangle) shape;
        ((Rectangle) shape).getArea();

    }
}
