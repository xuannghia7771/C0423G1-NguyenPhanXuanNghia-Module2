package ss6_inheritance.exercise.circle_and_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder;
        cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5, 3, "cyan");
        System.out.println(cylinder);
    }
}
