import java.util.Scanner;
public class Palindrome {
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
       
       if(b==num){
        System.out.println(num+" is a palindrome number..");
       }
       else{
        System.out.println("Not a palindrome number!");
       }
    }
}
