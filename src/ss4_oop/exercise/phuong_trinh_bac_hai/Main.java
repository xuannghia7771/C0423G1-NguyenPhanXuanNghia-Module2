package ss4_oop.exercise.phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap vao b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap vao c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.delta() > 0) {
            System.out.println("Phuong trinh co 2 nghiem: ");
            System.out.println("x1 = " + equation.getRoot1());
            System.out.println("x2 = " + equation.getRoot2());
        } else if (equation.delta() == 0) {
            System.out.println("Phuong trinh co nghiem kep x = " + equation.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
