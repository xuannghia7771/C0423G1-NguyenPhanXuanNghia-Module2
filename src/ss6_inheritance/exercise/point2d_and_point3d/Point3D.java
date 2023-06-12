package ss6_inheritance.exercise.point2d_and_point3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public double[] getXYZ() {
        double[] arr = new double[3];
        arr[0] = super.getX();
        arr[1] = super.getY();
        arr[2] = getZ();
        return arr;
    }

    @Override
    public String toString() {
        return (super.toString() + ", " + getZ() + ")");
    }
}
