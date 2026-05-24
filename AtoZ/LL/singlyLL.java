package AtoZ.LL;
import java.util.*;

public class singlyLL {
    //insert at beginning
    public static Node insertAtBeginning(Node head, int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }
    //print linked list
    public static void printLL(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // initial linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println("Original Linked List:");
        printLL(head);
        // insert at beginning
        head = insertAtBeginning(head, 5);
        System.out.println("After Insertion:");
        printLL(head);
    }
}
