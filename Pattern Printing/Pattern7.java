import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){//Initial *
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){//loop for middle spaces
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){//loop for last *
                System.out.print("*");
            }
            
            System.out.println();//for the next line

        }
        for(int i=n;i>=1;i--){
            for(int j=i-1;j>=1;j--){// loop for the Initial *
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i+1);j++){//loop for middle spaces
                System.out.print(" ");

            }
            for(int j=i-1;j>=1;j--){//loop for last *
                System.out.print("*");
            }
            
            System.out.println();


        }
    }
}
