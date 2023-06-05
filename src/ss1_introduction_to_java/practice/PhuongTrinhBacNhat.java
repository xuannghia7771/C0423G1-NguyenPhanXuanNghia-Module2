package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        if (a!=0){
            double answer = (c-b)/a;
            System.out.printf("Phuong trinh co nghiem x = %f", answer);
        } else {
            if (b==c){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Khong co nghiem!");
            }
        }
    }
}
