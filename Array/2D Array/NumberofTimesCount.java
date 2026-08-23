
import java.util.Scanner;
public class NumberofTimesCount {

    Scanner sc=new Scanner(System.in);
    int row,cols,num,  array[][];

    void insertArray(int row,int cols){
        this.row=row;
        this.cols=cols;
        this.array=new int[row][cols];

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
    }

    void noCount(int num){
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(array[i][j]==num){
                    count++;
                }
            }
            
        }
        System.out.println("Frequency of "+num+" is:"+count);
    }
    
    public static void main(String[] args) {
        NumberofTimesCount obj=new NumberofTimesCount();
        System.out.println("Enter the length of row:");
        int row=obj.sc.nextInt();

        System.out.println("Enter the length of column:");
        int cols=obj.sc.nextInt();

        obj.insertArray(row, cols);

        System.out.println("Enter the number to count its frequency:");
        int num=obj.sc.nextInt();
        obj.noCount(num);
        
        obj.sc.close();
    }
}
