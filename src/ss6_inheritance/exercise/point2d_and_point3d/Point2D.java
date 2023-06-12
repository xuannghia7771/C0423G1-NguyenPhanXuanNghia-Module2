package ss6_inheritance.exercise.point2d_and_point3d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double[] getXY() {
        double[] arr = new double[2];
        arr[0] = getX();
        arr[1] = getY();
        return arr;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Writing Point with "
                + "(" + getX() + ", " + getY() + ")";
    }
}
