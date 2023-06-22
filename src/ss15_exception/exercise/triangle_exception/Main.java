package ss15_exception.exercise.triangle_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        try {

            System.out.print("Nhập cạnh 1: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập cạnh 2: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập cạnh 3: ");
            int c = Integer.parseInt(scanner.nextLine());

            try {
                triangle.checkTriangle(a, b, c);
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Không hợp lệ!");
        }

    }
}
