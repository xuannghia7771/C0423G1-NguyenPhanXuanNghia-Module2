package ss4_oop.exercise.phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double delta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        double result = (-(this.b) + Math.sqrt(delta())) / (2 * this.a);
        return result;
    }

    public double getRoot2() {
        double result = (-(this.b) - Math.sqrt(delta())) / (2 * this.a);
        return result;
    }
}
