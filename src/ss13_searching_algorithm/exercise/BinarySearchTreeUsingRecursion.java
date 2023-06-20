package ss13_searching_algorithm.exercise;

import java.util.Arrays;

public class BinarySearchTreeUsingRecursion {
    public static int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int first, int last, int x) {
        if (last >= first) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                return binarySearch(arr, mid + 1, last, x);
            } else
                return binarySearch(arr, first, mid - 1, x);
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {12, 52, 35, 48, 45, 7, 6, 123, 4, 84, 75, 96};
        System.out.println(Arrays.toString(sortAscending(arr)));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 75));
    }
}
