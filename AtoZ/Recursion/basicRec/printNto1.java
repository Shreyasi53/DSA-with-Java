package AtoZ.Recursion.basicRec;

public class printNto1 {
    static void print(int n){
        if(n == 0) return; //base case

        System.out.println(n);
        print(n - 1);
    }

    public static void main(String[] args) {
        print(5);
    }
}
