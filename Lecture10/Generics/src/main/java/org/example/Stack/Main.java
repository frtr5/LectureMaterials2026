package org.example.Stack;

import java.util.Stack;

public class Main {
    static void main() {
        SimpleStack<String> stack1 = new SimpleStack<>();
        stack1.push("Plate 1");
        stack1.push("Plate 2");
        stack1.push("Plate 3");
        System.out.println(stack1.checkStack());
        String next = stack1.pop();
        System.out.println(next + " left the stack");
        System.out.println(stack1.checkStack());

        Stack<String> stack2 = new Stack<>();
        stack2.push("Plate 1");
        stack2.push("Plate 2");
        stack2.push("Plate 3");
        System.out.println(stack2);
        next = stack2.pop();
        System.out.println(next + " left the stack");
        System.out.println(stack2);

    }
}
