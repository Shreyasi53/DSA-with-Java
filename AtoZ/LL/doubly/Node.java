package AtoZ.LL.doubly;

class Node {
    int data;
    Node next;
    Node prev;
    //constructor
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}