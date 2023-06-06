package ss3_array.exercise;

import java.util.*;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to delete: ");
        int n = sc.nextInt();
        int result = indexOfElement(arr, n);
        if (result == -1) {
            System.out.println("No " + n + " in array");
        } else {
            deleteElement(arr, n);
            System.out.println("Array after removing " + n);
            System.out.println(Arrays.toString(arr));
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
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }
}
