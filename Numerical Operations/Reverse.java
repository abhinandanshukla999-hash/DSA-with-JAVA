import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:"); 
       int num=sc.nextInt();
       int a;
       int n=num;
       int b=0;
       while(n>0){
            a=n% 10;
            b=b*10+a;
            n=n/10;
       }
       System.out.println("Reverse of the number is:"+b);
    }
}