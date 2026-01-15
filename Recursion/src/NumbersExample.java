public class NumbersExample {
    public static void main(String[] args) {
        //write a function that takes in a number and print it
        //print first 5numbers: 1 2 3 4 5
        print(1);
    }
//    static void print1(int n){
//        System.out.println(n);
//        print2(2);
//    }
//    static void print2(int n){
//        System.out.println(n);
//        print3(3);
//    }
//    static void print3(int n){
//        System.out.println(n);
//        print4(4);
//    }
//    static void print4(int n){
//        System.out.println(n);
//        print5(5);
//    }
//    static void print5(int n){
//        System.out.println(n);
//    }
    static void print(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);

        //recursive call
        //if you are calling a function again and again , you can treat it as a separate call in the stack

        //this is called tail recursion
        //this is give the last function call
        print(n + 1);
    }
}
