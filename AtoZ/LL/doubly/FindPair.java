package AtoZ.LL.doubly;

import java.util.*;

public class FindPair {
    public ArrayList<ArrayList<Integer>> pair(Node head, int key){
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         Node left = head;
         Node right = findTail(head);
         while(left != null && right != null && left != right && left.prev != right){
             int sum = left.data + right.data;
             if(sum == key){
                 ArrayList<Integer> temp = new ArrayList<>();
                 temp.add(left.data);
                 temp.add(right.data);
                 ans.add(temp);
                 left = left.next;
                 right = right.prev;
             }
             else if(sum<key){
                 left = left.next;
             }else{
                 right = right.prev;
             }
         }
         return ans;
    }


    public Node findTail(Node head){
        Node tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }
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
        System.out.println("Enter Sorted DLL elements:");
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
        System.out.print("Enter target Sum: ");
        int key = sc.nextInt();

        System.out.println("Original DLL:");
        printDLL(head);
        FindPair obj = new FindPair();
        ArrayList<ArrayList<Integer>> ans = obj.pair(head, key);
        System.out.println("Pairs:");
        for (ArrayList<Integer> pair : ans) {
            System.out.println(pair);
        }
        sc.close();
    }
}
