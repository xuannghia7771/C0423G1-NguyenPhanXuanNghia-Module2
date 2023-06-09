package ss5_accessmodifier_static_getter_setter.exercise.circle;

public class TestCircle {
    public static final String s = "\u001B[31m";

    public static void main(String[] args) {
        Circle c = new Circle(5.5);
        System.out.println(s + c.getRadius());
        System.out.println(s + c.getArea());

    }

}
