package ss11_stack_and_queue.exercise.kiem_tra_ngoac;

import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c)";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == ')') {
                stack.push(c);
            }
        }
        if (stack.size() % 2 == 0) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
