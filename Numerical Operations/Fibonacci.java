import java.util.Scanner;
public class Fibonacci {
    int n;
    void method(int n) {
        this.n = n;
        int a = 0, b = 1, c;
        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci obj=new Fibonacci();
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        obj.method(n);
        
    }

}
