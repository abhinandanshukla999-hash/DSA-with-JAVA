import java.util.Scanner;
class ArrayReverse{
    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start!=end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start+=1;
            end-=1;
            
        }
        System.out.println("After reversing the array:");
        display(arr);
    }
    public static void display(int arr[]){
        System.out.println("Array is:");
       for (int i : arr) {
            System.out.println(i);
       } 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len;
        System.out.println("Enter the length of the array:");
        len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter the elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        display(arr);
        reverse(arr);

    }
}