package ss3_array.exercise;

import java.util.*;

public class TongDuongCheoChinh {
    public static void taoMang(double[][] arr, int m, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextDouble();
            }
        }
    }

    public static void xuatMang(double[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t\t\t");
            }
            System.out.print("\n");
        }
    }

    public static double tinhTongDuongCheo(double[][] arr) {
        double sum = 0.0d;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số dòng: ");
        int m = sc.nextInt();
        System.out.println("Nhập vào số cột: ");
        int n = sc.nextInt();
        double[][] arr = new double[m][n];
        taoMang(arr, m, n);
        System.out.println("Ma trận sau khi tạo là: ");
        xuatMang(arr, m, n);

        //Tong duong cheo chinh
        System.out.println("Tổng đường chéo chính của ma trận là: " + tinhTongDuongCheo(arr));
    }
}
