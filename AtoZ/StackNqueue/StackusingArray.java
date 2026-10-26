
package AtoZ.StackNqueue;

import java.util.Scanner;
public class StackusingArray {
    static class Stack {
        int[] arr;
        int top;
        int capacity;
        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        void push(int value) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow! Stack is full.");
                return;
            }
            arr[++top] = value;
            System.out.println(value + " pushed into stack.");
        }

        void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow! Stack is empty.");
                return;
            }
            System.out.println(arr[top] + " popped from stack.");
            top--;
        }

        void peek() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.println("Top element: " + arr[top]);
        }

        void display() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.println("Stack elements (top to bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }

        boolean isEmpty() {
            return top == -1;
        }
        boolean isFull() {
            return top == capacity - 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack capacity: ");
        int size = sc.nextInt();
        Stack st = new Stack(size);
        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if Empty");
            System.out.println("6. Check if Full");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    st.push(value);
                    break;

                case 2:
                    st.pop();
                    break;

                case 3:
                    st.peek();
                    break;

                case 4:
                    st.display();
                    break;

                case 5:
                    System.out.println(st.isEmpty()
                            ? "Stack is empty."
                            : "Stack is not empty.");
                    break;

                case 6:
                    System.out.println(st.isFull()
                            ? "Stack is full."
                            : "Stack is not full.");
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);
        sc.close();
    }
}
