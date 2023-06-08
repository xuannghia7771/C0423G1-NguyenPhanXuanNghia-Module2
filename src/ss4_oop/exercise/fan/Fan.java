package ss4_oop.exercise.fan;

//Lớp này gồm các thành phần sau:
//
//        2 hằng được đặt tên là SLOW, MEDIUM, và FAST với giá trị 1, 2, và 3 để biểu thị tốc độ quạt.
//        Trường speed có kiểu số nguyên (private int) để xác định tốc độ quạt, mặc định là SLOW
//        Trường on có kiểu private boolean để xác định quạt đang bật hay tắt, mặc định là false (tắt).
//        Trường radius có kiểu private double để xác định bán kính quạt, giá trị mặc định là 5
//        Trường color có kiểu dữ liệu private String để xác định màu quạt, mặc định là blue
//        Các getter và setter cho các thuộc tính
//        Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
//        Phương thức toString() trả về chuỗi chứa thông tin của quạt. Nếu quạt đang ở trạng thái on, phương thức trả về speed, color, và radius với chuỗi “fan is on”. Nếu quạt không ở trạng thái on, phương thức trả về color, radius với chuỗi “fan is off”.
//        Vẽ sơ đồ UML cho lớp và cài đặt lớp
//        Viết chương trìnhHiển thị các đối tượng bằng cách gọi phương thức toString
//        Tạo 2 đối tượng Fan
//        Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
//        Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan{" +
                    " speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' + " fan is on " +
                    '}';
        } else {
            return "Fan{" +
                    " radius=" + radius +
                    ", color='" + color + '\'' + " fan is off " +
                    '}';
        }
    }

}
