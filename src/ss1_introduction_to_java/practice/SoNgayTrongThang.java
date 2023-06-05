package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang muon kiem tra: ");
        int month = sc.nextInt();
        String text;
        switch (month){
            case 2:
                text = "28 hoac 29 ngay";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                text = "31 ngay";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                text = "30 ngay";
                break;
            default:
                text = "";
                break;
        }
        if (!text.equals("")){
            System.out.println("Thang "+month+"co "+text);
        } else {
            System.out.println("Thang khong hop le!");
        }
    }
}
