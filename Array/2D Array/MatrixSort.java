import java.util.Arrays;
public class MatrixSort {
    static void sortMatrix(int [][] matrix){
        //copying the 2d array in a 1d array to sort 
        
        int idx=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int [] arr=new int[n*m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++]=matrix[i][j];
            }
        }
        // Sorting the 1D array
        Arrays.sort(arr);
        idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=arr[idx++];
            }
        }

    }
    static void showMatrix(int [][] matrix){
        // for each loop
        for(int []row:matrix){//gets the total rows and behaves like as a 1d array for each row
            for(int val:row){//gets the values from the rows
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       int [][] matrix={
            {9,4,5},
            {1,8,6},
            {2,3,7}
        };
        System.out.println("Original array is:");
        showMatrix(matrix);

        sortMatrix(matrix);

        System.out.println("Sorted array row wise and column wise:");
        showMatrix(matrix);


    }
}
