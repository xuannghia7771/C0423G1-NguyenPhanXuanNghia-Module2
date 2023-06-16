package ss11_stack_and_queue.exercise.check_palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kì: ");
        String str = sc.nextLine().toLowerCase();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] strArr = str.split("");
        boolean flag = true;
        for (int i = 0; i < strArr.length; i++) {
            stack.push(strArr[i]);
            queue.add(strArr[i]);
        }
        while (!stack.isEmpty() && flag) {
            flag = stack.pop().equals(queue.remove());
        }
        if (flag) {
            System.out.println("Là Palindrome");
        } else {
            System.out.println("Không phải là Palindrome");
        }
    }
}
