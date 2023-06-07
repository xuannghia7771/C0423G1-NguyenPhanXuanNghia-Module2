package ss3_array.exercise;

import java.util.Scanner;

public class TimMinTrongMang {
    public static void taoMang(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        taoMang(arr);
        System.out.println("Mang vua tao la: ");
        xuatMang(arr);

        //Tim min trong mang
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nPhan tu co gia tri nho nhat la: " + min);
    }
}
