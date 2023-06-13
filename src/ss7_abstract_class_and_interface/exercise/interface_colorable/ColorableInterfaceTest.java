package ss7_abstract_class_and_interface.exercise.interface_colorable;

public class ColorableInterfaceTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 7);
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println("Hình chữ nhật có diện tích " + ((Rectangle) shape).getArea());
            }
            if (shape instanceof Square && shape.howToColor() != null) {
                System.out.println("Hình chữ vuông có diện tích " + ((Square) shape).getArea());
                System.out.println(shape.howToColor());
            }
        }
    }
}
