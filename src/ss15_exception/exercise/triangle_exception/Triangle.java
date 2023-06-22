package ss15_exception.exercise.triangle_exception;

public class Triangle extends Exception {
    private double egde1;
    private double egde2;
    private double egde3;

    public Triangle() {

    }

    public Triangle(double egde1, double egde2, double egde3) {
        this.egde1 = egde1;
        this.egde2 = egde2;
        this.egde3 = egde3;
    }

    public void checkTriangle(double egde1, double egde2, double egde3) throws IllegalTriangleException {
        double check1 = this.egde1 + this.egde2;
        double check2 = this.egde1 + this.egde3;
        double check3 = this.egde2 + this.egde3;
        if (check1 <= this.egde3 || check2 <= this.egde2 || check3 <= this.egde1) {
            throw new IllegalTriangleException("lỗi: không phải tam giác!");
        } else {
            System.out.println("tam giác hợp lệ");
        }
    }

    public double getEgde1() {
        return egde1;
    }

    public void setEgde1(double egde1) {
        this.egde1 = egde1;
    }

    public double getEgde2() {
        return egde2;
    }

    public void setEgde2(double egde2) {
        this.egde2 = egde2;
    }

    public double getEgde3() {
        return egde3;
    }

    public void setEgde3(double egde3) {
        this.egde3 = egde3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "egde1=" + egde1 +
                ", egde2=" + egde2 +
                ", egde3=" + egde3 +
                '}';
    }
}
