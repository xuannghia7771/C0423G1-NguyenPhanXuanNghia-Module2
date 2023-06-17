package ss11_stack_and_queue.exercise.kiem_tra_ngoac;

import java.util.Stack;

public class CheckBracket {
    public static void checkBracket(String str) {
        Stack<Character> openBracketStack = new Stack<>();
        Stack<Character> closeBracketStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals("(")) {
                openBracketStack.push(str.charAt(i));
            }
            if (String.valueOf(str.charAt(i)).equals(")")) {
                closeBracketStack.push(str.charAt(i));
            }
        }
        while (!openBracketStack.isEmpty() && !closeBracketStack.empty()) {
            openBracketStack.pop();
            closeBracketStack.pop();
        }
        if (openBracketStack.isEmpty() && closeBracketStack.isEmpty()) {
            System.out.println("well");
        } else {
            System.out.println("???");
        }
    }

    public static void main(String[] args) {
        String str1 = "s * (s – a) * (s – b) * (s – c)";
        String str2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String str3 = "s * (s – a) * (s – b * (s – c)";
        String str4 = "s * (s – a) * s – b) * (s – c)";

        checkBracket(str1);
        checkBracket(str2);
        checkBracket(str3);
        checkBracket(str4);


    }
}
