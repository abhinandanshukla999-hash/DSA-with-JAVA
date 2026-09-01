public class StaircaseSearching{
    public static boolean searchkey(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else
                row++;
        }
        System.out.println("Entered key is not present");
        return false;
    }
    public static void main(String[] args) {
        int [][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        searchkey(matrix, 7);

    }
}