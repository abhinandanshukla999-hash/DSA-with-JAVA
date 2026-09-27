package BitWise_Operator;

import java.util.Scanner;

public class EvenOdd {
    static void check(int n){
        int bit=1;
        System.out.println("-----------------");
        if ((bit & 1)==0) {
            System.out.println("Even Number");

        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        check(n);
        sc.close();


    }
}
