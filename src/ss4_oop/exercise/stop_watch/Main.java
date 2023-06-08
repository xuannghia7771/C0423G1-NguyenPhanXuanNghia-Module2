package ss4_oop.exercise.stop_watch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        System.out.println("Nhap 'start' de bat dau bam gio");
        do {
            String button = sc.nextLine();
            switch (button) {
                case "start":
                    System.out.println("Thoi gian bat dau tai thoi diem " + watch.start() + " mili giay");
                    System.out.println("Nhap 'end' khi nao ban muon dung");
                    break;
                case "end":
                    System.out.println("Thoi gian ket thuc tai thoi diem " + watch.stop() + " mili giay");
                    System.out.println("Khoang thoi gian da chay la " + watch.getElapsedTime());
                    System.out.println("Thoat chuong trinh nhap 'exit'");
                    break;
                case "exit":
                    System.exit(0);
            }
        } while (true);
    }
}
