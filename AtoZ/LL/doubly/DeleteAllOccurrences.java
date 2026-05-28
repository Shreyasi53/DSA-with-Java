package AtoZ.LL.doubly;
import java.util.*;
public class DeleteAllOccurrences {
    public Node deleteAllOccur(Node head, int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                //if deleting head node
                if(temp == head) head = head.next;

                Node nextNode = temp.next;
                Node prevNode = temp.prev;

                //connect prev node
                if(prevNode != null){
                    prevNode.next = nextNode;
                }
                //connect next node
                if(nextNode != null){
                    nextNode.prev = prevNode;
                }
            }
            temp = temp.next;
        }
        return head;
    }
    // Print DLL
    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" <-> NULL");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        System.out.println("Enter DLL elements:");
        // Input DLL
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        System.out.print("Enter key to delete: ");
        int key = sc.nextInt();

        System.out.println("Original DLL:");
        printDLL(head);

        DeleteAllOccurrences obj = new DeleteAllOccurrences();
        head = obj.deleteAllOccur(head, key);
        System.out.println("DLL After Deletion:");
        printDLL(head);
        sc.close();
    }
}
