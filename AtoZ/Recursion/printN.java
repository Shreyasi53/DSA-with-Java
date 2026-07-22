package AtoZ.Recursion;

public class printN {
    static void print(int n){
        //Base case
        if(n == 0)
            return;
        //recursive call
        print(n - 1);
        //work
        System.out.println(n);

    }
    public static void main(String[] args) {
        print(5);
    }
}
//the recursive call pauses the current function.when the called function returns,
//execution resumes from the very next line after that function call.