package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        n = sc.nextInt();
        String result = donVi(n);
        String result2 = hangChuc(n);
        String result3 = hangTram(n);
        if (n > 0 && n <= 9){
            System.out.println(result);
        } else if (n >= 10 && n <= 99){
            System.out.println(result2);
        } else if (n <= 999){
            System.out.println(result3);
        }

    }
    public static String donVi(int number) {
        String str = "";
        switch (number){
            case 1:
                str += "one";
                break;
            case 2:
                str += "two";
                break;
            case 3:
                str += "three";
                break;
            case 4:
                str += "four";
                break;
            case 5:
                str += "five";
                break;
            case 6:
                str += "six";
                break;
            case 7:
                str += "seven";
                break;
            case 8:
                str += "eight";
                break;
            case 9:
                str += "nine";
                break;
        }
        return str;
    }
    public static String hangChuc(int number){
        String str = "";
        int donVi = number % 10;
        int chuc = number / 10;
        if (chuc == 1){
            switch (donVi){
                case 0:
                    str += "ten";
                    break;
                case 1:
                    str += "eleven";
                    break;
                case 2:
                    str += "twelve";
                    break;
                case 3:
                    str += "thirteen";
                    break;
                case 4:
                    str += "fourteen";
                    break;
                case 5:
                    str += "fifteen";
                    break;
                case 6:
                    str += "sixteen";
                    break;
                case 7:
                    str += "seventeen";
                    break;
                case 8:
                    str += "eighteen";
                    break;
                case 9:
                    str += "nineteen";
                    break;
            }
            return str;
        } else if (chuc > 1 && chuc <= 9){
            switch (chuc){
                case 2:
                    str += "twenty";
                    break;
                case 3:
                    str += "thirty";
                    break;
                case 4:
                    str += "forty";
                    break;
                case 5:
                    str += "fifty";
                    break;
                case 6:
                    str += "sixty";
                    break;
                case 7:
                    str += "seventy";
                    break;
                case 8:
                    str += "eighty";
                    break;
                case 9:
                    str += "ninety";
                    break;
            }
        }
        return str+" "+donVi(donVi);
    }
    public static String hangTram(int number){
        String str = "";
        int tram = number / 100;
        int hamHangChuc = number%100;
        switch (tram){
            case 1:
                str += "one hundred";
                break;
            case 2:
                str += "two hundred";
                break;
            case 3:
                str += "three hundred";
                break;
            case 4:
                str += "four hundred";
                break;
            case 5:
                str += "five hundred";
                break;
            case 6:
                str += "six hundred";
                break;
            case 7:
                str += "seven hundred";
                break;
            case 8:
                str += "eight hundred";
                break;
            case 9:
                str += "nine hundred";
                break;
        }
        return str+" "+hangChuc(hamHangChuc);
    }
}

