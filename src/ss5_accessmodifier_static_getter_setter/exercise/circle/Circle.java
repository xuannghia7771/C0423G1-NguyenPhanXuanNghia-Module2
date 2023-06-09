package ss5_accessmodifier_static_getter_setter.exercise.circle;

public class Circle {
    private double radius;
    private String color;

    Circle() {

    }

    Circle(double r) {
        this.radius = r;
    }

    //change access modifier into private, protected, none access modifier - "default"

    /**
     * thay protected và default vẫn sài được phương thức trong lớp TestCircle vì nằm chung trong một package là circle
     * thay private thì không sử dụng đuợc phương thức vì phạm vi hoạt động chỉ trong class Circle
     */
    public double getRadius() {
        return radius;
    }

    //change access modifier into private, protected none access modifier - "default"

    /**
     * Như trên
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
