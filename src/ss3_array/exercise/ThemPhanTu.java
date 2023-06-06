package ss3_array.exercise;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to add: ");
        int n = sc.nextInt();
        int index = indexOfElement(arr, n);
        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("Can't add!");
        }
    }

    public static int indexOfElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteElement(int[] arr, int element) {
        int position = indexOfElement(arr, element);
        for (int i = position; i < arr.length - 1; i++) {
            if (position != -1) {
                arr[i] = element;
            }
            arr[i + 1] = arr[i];
        }

    }
}
