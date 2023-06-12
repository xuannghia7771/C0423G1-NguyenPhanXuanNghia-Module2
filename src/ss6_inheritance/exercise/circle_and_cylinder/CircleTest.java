package ss6_inheritance.exercise.circle_and_cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle;
        /*
            lỗi phát sinh khi khởi tạo đối tượng không có đối số truyền vào
            Vì đã có constructor có tham số => Java không thể tự sinh constructor mặc định
         */
        circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.0, "yellow");
        System.out.println(circle);
    }
}
