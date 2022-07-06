package Ontap.Question7;

import java.util.EmptyStackException;

public class MyStack {
    private int[] stack;
    private int top;

    public MyStack(int capacity) {
        stack = new int[capacity];
    }

    public void push(int value) {
        if (top == stack.length) {
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top++] = value;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = stack[top - 1];
        stack[top - 1] = 0;
        top--;
        return value;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.print(" " + stack[i]);
        }
    }

}
