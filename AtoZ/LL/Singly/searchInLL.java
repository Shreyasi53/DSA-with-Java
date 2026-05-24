package AtoZ.LL.Singly;

import AtoZ.LL.Singly.Node;

//search element in linkedlist
public class searchInLL {
    public static boolean search(Node head, int key){
        Node temp = head;
        while(temp != null){
            //element found
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        //element not found
        return false;
    }
    //print LL
    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Linked List:");
        printLL(head);
        int key = 30;
        if(search(head, key)){
            System.out.println(key + " is present");
        }else{
            System.out.println(key + " is not present");
        }
    }
}
