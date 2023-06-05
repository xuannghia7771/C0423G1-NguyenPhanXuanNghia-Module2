package ss1_introduction_to_java.exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
