package ss2_loop.exercise;

import java.util.*;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < numbers) {
            int countUoc = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    countUoc++;
                }
            }
            if (countUoc == 2) {
                System.out.println(n + " là số nguyên tố");
                count++;
            }
            n++;
        }
    }
}
