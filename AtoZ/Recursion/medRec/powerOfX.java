package AtoZ.Recursion.medRec;
//https://leetcode.com/problems/powx-n
//LC-50
//n can be negative also
//at every step halves the exponent thats why the complexity becomes 0(logn)
public class powerOfX {
    //handles positive power and negative powers
    static double myPow(double x, int n){
        long power = n;
        if(power < 0){
            return 1.0/solve(x, -power);
        }
        return solve(x, power);
    }
    static double solve(double x, long n){
        if(n == 0) return 1.0;
        double half = solve(x, n/2);
        if(n % 2 == 0) return half * half;
        return x*half*half;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.000, -2));
    }
}
