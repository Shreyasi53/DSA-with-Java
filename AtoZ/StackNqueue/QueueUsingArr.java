package AtoZ.StackNqueue;
import java.util.Scanner;

public class QueueUsingArr {
    static class Queue {
        int[] arr;
        int front;
        int rear;
        int capacity;
        int size;

        // Constructor
        Queue(int capacity) {
            arr = new int[capacity];
            this.capacity = capacity;
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int value) {
            if (size == capacity) {
                System.out.println("Queue Overflow! Queue is full.");
                return;
            }
            rear++;
            arr[rear] = value;
            size++;
            System.out.println(value + " inserted into queue.");
        }

        void dequeue() {
            if (size == 0) {
                System.out.println("Queue Underflow! Queue is empty.");
                return;
            }
            System.out.println(arr[front] + " removed from queue.");
            front++;
            size--;
        }

        void peek() {
            if (size == 0) {
                System.out.println("Queue is empty.");
                return;
            }

            System.out.println("Front element: " + arr[front]);
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.println("Queue elements (front to rear):");
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }

        boolean isEmpty() {
            return size == 0;
        }
        boolean isFull() {
            return size == capacity;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        int capacity = sc.nextInt();
        if (capacity <= 0) {
            System.out.println("Capacity must be positive.");
            sc.close();
            return;
        }
        Queue q = new Queue(capacity);
        int choice;
        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if Empty");
            System.out.println("6. Check if Full");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    System.out.println(q.isEmpty()
                            ? "Queue is empty."
                            : "Queue is not empty.");
                    break;

                case 6:
                    System.out.println(q.isFull()
                            ? "Queue is full."
                            : "Queue is not full.");
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);        sc.close();
    }
}
