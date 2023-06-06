package ss3_array.exercise;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {50, 60, 70, 80, 90, 100};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr3.length - arr2.length) {
                arr3[i] = arr1[i];
            }
            if (i >= arr3.length - arr2.length) {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
