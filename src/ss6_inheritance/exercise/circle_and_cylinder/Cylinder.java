package ss6_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {

    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return height * super.getArea();
    }

    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "The Cylinder with height = "
                + getHeight()
                + " and the volume = "
                + getVolume()
                + ". This Cylinder is a subclass of "
                + super.toString();
    }
}
