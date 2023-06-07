package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TimMaxTrongMaTran {
    public static void taoMang(int[][] arr, int m, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void xuatMang(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng: ");
        int m = sc.nextInt();
        System.out.println("Nhập vào số cột: ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        taoMang(arr, m, n);
        System.out.println("Ma trận sau khi tạo là: ");
        xuatMang(arr, m, n);
        //System.out.println(Arrays.deepToString(arr));

        //tìm max trong mảng hai chiều
        int indexI = 0;
        int indexJ = 0;
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("Số lớn nhất trong mảng là " + max + " ở vị trí arr[" + indexI + "][" + indexJ + "]");
    }
}
