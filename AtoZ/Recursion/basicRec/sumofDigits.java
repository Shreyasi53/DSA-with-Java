package AtoZ.Recursion.basicRec;

public class sumofDigits {
    static int DigitSum(int n){
        if(n == 0)
            return 0;
        return (n % 10) + DigitSum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(DigitSum(1234));
    }
}
