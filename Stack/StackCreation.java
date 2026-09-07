package Stack;
import java.util.Scanner;
public class StackCreation {
    static int top=-1;
    static int maxSize[]=new int[100];
    static void pushData(int data){
        if (top==maxSize.length-1) {
            System.out.println("Stack Overflow");
        }
        else{
            top=top+1;
            maxSize[top]=data;
        }
    }
    static void display(){
        while(top!=-1){
            System.out.println(maxSize[top]);
            top--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length :");
        int len=sc.nextInt();
        for(int i=0;i<len;i++){
            System.out.print("Enter data:");
            int data=sc.nextInt();
            pushData( data);
        }
        display();
        sc.close();

    }
}
