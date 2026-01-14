

public class PatternPrinting {
    public static void main(String[] args) {
        pattern10(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            //for(int col = n; col >= row; col--){
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            // print spaces
            for (int s = 1; s <= n - row; s++) {
                System.out.print("  "); // double space for better alignment
            }
            // print stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {

            // print leading spaces
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            // print descending numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            // print ascending numbers
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern9(int n){
        n = 2*n;
        for(int row = 0; row <= n; row++){
            for(int col = 0; col < n; col++ ){
                int atEveryIndex = Math.min(Math.min(row,col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n) {
        int size = 2 * n;

        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
                int atEveryIndex = n - Math.min(
                        Math.min(row, col),
                        Math.min(size - row, size - col)
                );
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

}

