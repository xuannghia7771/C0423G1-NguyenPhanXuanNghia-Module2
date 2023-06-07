package ss3_array.exercise;

import java.lang.reflect.Array;
import java.util.*;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] newArr = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to add: ");
        int n = sc.nextInt();
        System.out.println("Enter index: ");
        int pos = sc.nextInt();
        addElement(arr, n, newArr, pos);
        System.out.println(Arrays.toString(newArr));
    }

    public static void addElement(int[] arr, int element, int[] secondArr, int index) {
        for (int i = 0; i < secondArr.length; i++) {
            if (index == i) {
                for (int j = index + 1; j < secondArr.length; j++) {
                    secondArr[j] = arr[j - 1];
                }
                break;
            }
            secondArr[i] = arr[i];
        }
        secondArr[index] = element;
    }
}
