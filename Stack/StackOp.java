
package Stack;

import java.util.Scanner;

public class StackOp {

    static int top = -1;
    static int maxSize[] = new int[100];

    // Push operation
    static void pushData(int data) {

        if (top == maxSize.length - 1) {
            System.out.println("Stack Overflow");
        }
        else {
            top = top + 1;
            maxSize[top] = data;
        }
    }

    // Display operation
    static void display() {

        for (int i = top; i >= 0; i--) {
            System.out.println(maxSize[i]);
        }
    }

    // Pop operation
    static int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = maxSize[top];
        top = top - 1;

        return value;
    }

    // Insert an element at the bottom
    static void insertAt(int value) {

        if (top == -1) {
            pushData(value);
            return;
        }

        int temp = pop();

        insertAt(value);

        pushData(temp);
    }

    // Reverse stack recursively
    static void reverseStack() {

        if (top == -1) {
            return;
        }

        int temp = pop();

        reverseStack();

        insertAt(temp);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        int len = sc.nextInt();

        for (int i = 0; i < len; i++) {

            System.out.print("Enter item: ");
            int data = sc.nextInt();

            pushData(data);
        }

        System.out.println("\n------------------Original Stack-------------------");
        display();

        reverseStack();

        System.out.println("\n--------------Reversed Stack----------------");
        display();

        sc.close();
    }
}
