import java.util.Scanner;
import java.util.ArrayList;

public class ArraylistCreation {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the ArrayList: ");
        int len=sc.nextInt();
        for(int i=0;i<=len-1;i++)
        {
            System.out.println("Enter value");
            arr.add(sc.nextInt());
        }
        System.out.println("Your provided list: ");
        for(int data:arr){
            System.out.print(data+" ");

        }
    }
}
