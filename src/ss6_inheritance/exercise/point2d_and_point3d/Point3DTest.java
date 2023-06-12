package ss6_inheritance.exercise.point2d_and_point3d;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D;
        point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(2.5f, 3.5f, 4.5f);
        System.out.println(point3D);
    }
}
