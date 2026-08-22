public class LastDigit {
    
    public static void last(int n){
        int n1=n;
        int lastd=n1%10;
        System.out.println("Last Digit is "+lastd);
    }
    public static void main(String[] args) {
        last(25);
    }
}
