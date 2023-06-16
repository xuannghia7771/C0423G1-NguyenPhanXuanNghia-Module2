package ss11_stack_and_queue.exercise.reverse_integer_array_use_stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Stack<Integer> myStackReverse = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        System.out.println(myStack);

        int fixedSize = myStack.size();
        for (int i = 0; i < fixedSize; i++) {
            myStackReverse.push(myStack.pop());
        }

        //Đảo ngược chuỗi codegym-is-this
        String str = "codegym-is-this";
        String[] wArr = str.split("-");
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < wArr.length; i++) {
            wStack.push(wArr[i]);
        }
        System.out.println(wStack);
        Stack<String> newStack = new Stack<>();
        int size = wStack.size();
        for (int i = 0; i < size; i++) {
            newStack.push(wStack.pop());
        }
        System.out.println(newStack);
    }
}
