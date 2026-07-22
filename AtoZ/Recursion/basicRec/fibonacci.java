package AtoZ.Recursion.basicRec;

public class fibonacci {
    static int fib(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}

//TC = O(2^n) (because many subproblems are recalculated)
//SC = O(n) (maximum recursion depth)