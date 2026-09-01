import java.util.Scanner;

public class MatrixManipulation {

    Scanner sc = new Scanner(System.in);
    int row, cols;
    int array[][];

    void insertArray(int row, int cols) {
        this.row = row;
        this.cols = cols;
        this.array = new int[row][cols];

        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered Array Is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("  " + array[i][j] + "");
            }
            System.out.println();
        }
    }

    void manipulate() {
        System.out.println("Enter your choice:\n1.Row Deletion\n2.Column Deletion");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter the row you want to delete:");
            int drow = sc.nextInt();
            if (drow == 0) {
                System.out.println("Output is");
                for (int i = 1; i < row; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print( array[i][j] + "");
                    }
                    System.out.println();
                }
            }
            else if (drow>1&&drow!=row) {
                outer:for (int i = 0; i < row; i++) {
                    
                    for (int j = 0; j < cols; j++) {
                        if (i==drow) {
                           continue outer; 
                        }
                        System.out.print( + array[i][j] + "");
                    }
                    System.out.println();

                }
            }
            else if (drow==row-1) {
                for (int i = 0; i < row-1; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print( array[i][j] + "");
                    }
                    System.out.println();

                }
            }
            else{
                System.out.println("Enter a valid row !");
            }

        }

        
    }

    public static void main(String[] args) {
        MatrixManipulation obj = new MatrixManipulation();
        System.out.println("Enter the length of row:");
        int row = obj.sc.nextInt();

        System.out.println("Enter the length of column:");
        int cols = obj.sc.nextInt();

        obj.insertArray(row, cols);
        obj.manipulate();
        obj.sc.close();
    }
}
