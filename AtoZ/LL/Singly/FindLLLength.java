package AtoZ.LL.Singly;

public class FindLLLength {
//find length
    public static int findLength(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
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
        printLL(head);
        int len = findLength(head);
        System.out.println("Length = " +len);
    }
}
