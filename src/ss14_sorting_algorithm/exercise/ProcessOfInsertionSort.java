package ss14_sorting_algorithm.exercise;

import java.util.Arrays;

public class ProcessOfInsertionSort {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            System.out.println("Vòng lặp thứ: " + i);
            x = array[i];
            System.out.println("Gán x = array[" + i + "]" + " => x = " + array[i]);
            pos = i;
            System.out.println("Gán pos = i" + " => pos = " + i);
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            System.out.println("So sánh " + pos + " > 0 và " + x + " < " + array[i - 1]);
            System.out.println("Nếu " + ANSI_YELLOW + "true" + ANSI_RESET + " thì thực hiện đổi chỗ " + ANSI_RED + array[i - 1] + ANSI_RESET + " và " + ANSI_RED + x + ANSI_RESET + " ,nếu " + ANSI_YELLOW + "false" + ANSI_RESET + " thì giữ nguyên'");
            System.out.println("Mảng sau khi chạy hết vòng lặp while\n" + Arrays.toString(array));
            array[pos] = x;
            System.out.println("Gán array[pos] = x => " + "array[" + pos + "] = " + x);
            System.out.println("Mảng sau khi chạy lần thứ " + i + ":\n" + Arrays.toString(array));
            System.out.println(ANSI_RED + "-------------------------------------------------------------" + ANSI_RESET);
        }
    }

    public static void main(String[] args) {
        int[] list = {12, 52, 35, 48, 45, 7, 6, 123, 4, 84, 75, 96};
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
