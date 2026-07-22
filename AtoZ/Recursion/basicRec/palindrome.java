package AtoZ.Recursion.basicRec;
//check palindrome
public class palindrome {
    static boolean isPalindrome(String s, int left, int right){
        //base case
        if(left >= right)
            return true;
        //characters don't match
        if(s.charAt(left) != s.charAt(right))
            return false;
        //recursive call
        return isPalindrome(s, left+1, right-1);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s, 0, s.length()-1));
    }
}
