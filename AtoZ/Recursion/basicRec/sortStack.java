package AtoZ.Recursion.basicRec;
import java.util.*;
public class sortStack {
    static void sort(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        sort(st);
        insert(st, top);
    }
    static void insert(Stack<Integer> st, int element){
        if(st.isEmpty() || st.peek() <= element){
            st.push(element);
            return;
        }
        int top = st.pop();
        insert(st, element);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(1);
        st.push(3);
        System.out.println("Original Stack:" + st);
        sort(st);
        System.out.println("Sorted Stack:" + st);
    }
}
