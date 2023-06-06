package ss2_loop.exercise;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Print Rectangle");
            System.out.println("2. Print Square Triangle");
            System.out.println("3. Print Isosceles Triangle");
            System.out.println("0. Exit");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    rectangle();
                    break;
                case 2:
                    squareTriangle();
                    break;
                case 3:
                    isoscelesTriangle();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        } while (true);
    }

    public static void squareTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void isoscelesTriangle() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                if (j + i >= 5 && j - i <= 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void rectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
