package ss11_stack_and_queue.exercise.transfer_decimal_into_binary;

import java.util.Scanner;
import java.util.Stack;

public class TransferIntoBinary {
    public static String convertToBinary(int num) {
        Stack<Integer> uncompletedBinaryStack = new Stack<>();
        while (num != 0) {
            uncompletedBinaryStack.push(num % 2);
            num = num / 2;
        }
        StringBuilder completedBinary = new StringBuilder();
        while (!uncompletedBinaryStack.isEmpty()) {
            completedBinary.append(uncompletedBinaryStack.pop());
        }
        return completedBinary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số nguyên dương bất kỳ: ");
        int num;
        do {
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Vui long nhập lại đúng số nguyên dương");
            }
        } while (num <= 0);
        System.out.println(convertToBinary(num));
    }
}
