package AtoZ.LL.Singly;
//TC: O(n) SC: O(1)
public class addOne {
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }

    public Node add(Node head){
        //step1 reverse the LL
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        //step 2 Add carry
        while(temp != null){
            temp.data = temp.data + carry;
            if(temp.data < 10){
                carry = 0;
                break;
            }else{
                temp.data = 0;
                carry = 1;
            }
            //if last node and carry still exists
            if(temp.next == null && carry == 1){
                temp.next = new Node(1);
                break;
            }
            temp = temp.next;
        }
        //step 3 reverse again
        head = reverse(head);
        return head;

    }
    public static void main(String[] args) {
        //1 -> 5-> 9
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(9);

        System.out.println("Original linked list:");
        printLL(head);

        addOne obj = new addOne();
        head = obj.add(head);

        System.out.println("After Adding One:");
        printLL(head);
    }
    // Print linked list
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

}
