package ss6_inheritance.practice;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape;
        shape = new Shape();
        System.out.println(shape);

        shape =  new Shape("red", false);

        System.out.println(shape);
    }
}
