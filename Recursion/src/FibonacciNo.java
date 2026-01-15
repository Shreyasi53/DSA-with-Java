//Fibo(N) = Fibo(N-1) + Fibo(N-2)
public class FibonacciNo {
    public static void main(String[] args) {
        int ans = fibo(7);
        System.out.println(ans);
    }
    static int fibo(int n){
        //base condition
        if(n < 2){
            return n;
        }
        //this is not a tail recursion
        return fibo(n-1) + fibo(n-2);
    }
}
