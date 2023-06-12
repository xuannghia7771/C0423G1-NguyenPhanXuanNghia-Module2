package ss6_inheritance.exercise.circle_and_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "The Circle with radius = "
                + getRadius()
                + ", area = "
                + getArea()
                + ", perimeter = "
                + getPerimeter()
                + " and color filled with "
                + ((this.color) != null ? getColor() : "no color");
    }
}
