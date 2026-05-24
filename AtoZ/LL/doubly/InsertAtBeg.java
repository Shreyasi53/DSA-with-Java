package AtoZ.LL.doubly;

public class InsertAtBeg {
    //insert at beginning
    public static Node insertAtBeginning(Node head, int value){
        Node newNode = new Node(value);
        newNode.next = head;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        return head;
    }
    public static void printDLL(Node head){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        // connect nodes
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Original Doubly Linked List:");
        printDLL(head);
        // insert at beginning
        head = insertAtBeginning(head, 5);
        System.out.println("After Insertion:");
        printDLL(head);
    }
}
