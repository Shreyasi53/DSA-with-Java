package AtoZ.LL.Singly;

import java.util.Scanner;

//Sort a Linked List of 0's 1's and 2's by changing links
//Input: 1 -> 2 -> 0 -> 1 -> 0 -> 2 -> NULL
//Output: 0 -> 0 -> 1 -> 1 -> 2 -> 2 -> NULL
public class sort012 {
    public Node sortList(Node head){
        // Dummy nodes
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        // Tail pointers
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;
        //Divide nodes into 3 lists
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        //connect lists
        zero.next = (oneHead.next != null)? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        //new head
        head = zeroHead.next;
        return head;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes:");
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        System.out.println("Enter values (only 0, 1, 2):");
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.println("Original LinkedList:");
        printLL(head);
        sort012 obj = new sort012();
        head = obj.sortList(head);
        System.out.println("Sort LinkedList");
        printLL(head);
        sc.close();
    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> NULL");
    }
}

