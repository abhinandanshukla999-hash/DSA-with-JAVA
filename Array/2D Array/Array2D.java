
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of row:");
        int row=sc.nextInt();
        System.out.println("Enter the length of column:");
        int cols=sc.nextInt();
        int array[][]=new int[row][cols];

        System.out.println("Enter the elements row-wise:");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
            }
        }

        System.out.println("Entered Array Is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print("  "+array[i][j]+"");
            }
            System.out.println();
        }
        sc.close();
    }
}
