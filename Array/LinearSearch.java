import java.util.Scanner;
public class LinearSearch {

    public static void search(int arr[],int val,int n){
        boolean check=false;
         for(int i=0;i<n;i++){
            if (arr[i]==val) {
                System.out.println("Element found at place"+(i+1));
                check=true;
            }
            else{
                continue;
            }
            
        }
        if (!check) {
            System.out.println("Element is not present in the array");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter values in the array-");
        for(int i=0;i<n;i++){
            System.out.print("Enter value "+(i+1)+":");
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Enter the value to search:");
        int val=sc.nextInt();
        search(arr, val, n);
        sc.close();

        
    }
}
