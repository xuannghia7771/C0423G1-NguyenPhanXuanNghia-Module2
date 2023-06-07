package ss3_array.exercise;

import java.util.Scanner;

public class TanSuatKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ki tu muon dem: ");
        char n = sc.next().charAt(0);
        String str = "true love stories never have endings";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == n) {
                count++;
            }
        }
        System.out.println("Ki tu " + n + " xuat hien " + count + " lan");
    }
}
