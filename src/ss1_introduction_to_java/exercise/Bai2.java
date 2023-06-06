package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class Bai2 {
    //    [Bài tập] Ứng dụng chuyển đổi tiền tệ
    public static void main(String[] args) {
        int rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền đô muốn quy đổi: ");
        double usd = sc.nextDouble();
        double quyDoi = usd * rate;
        System.out.println("Sau khi quy đổi: " + quyDoi + " VND");
    }
}
