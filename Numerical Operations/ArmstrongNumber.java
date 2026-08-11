import java.util.Scanner;
public class ArmstrongNumber {
    public void checkArm(int n){
        int a,p=n,q=n,power=0,num=0;
        while(n>0){
            a=n%10;
            power=power+1;
            n=n/10;
        }
        while(p>0){
            a=p%10;
            num=num+(int)Math.pow(a,power);
            p=p/10;
        }
        if (q==num) {
            System.out.println(q+" is an Armstrong Number.");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArmstrongNumber obj=new ArmstrongNumber();
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        obj.checkArm(n);
    }
}
