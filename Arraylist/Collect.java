import java.util.*;
public class Collect {
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  the length of the arraylist :");
        int n=s.nextInt();
        for(int i=0;i<=n-1;i++){
            System.out.println("Enter element"+(i+1)+":");
            arr.add(s.nextInt());
        }
        System.out.println("Here is the output:");
        for(int data: arr){
            System.out.print(data+"  ");
        }
        System.out.println("\n Enter the value: ");
        int num=s.nextInt();
        if(num==arr.get(0)){
            int temp = arr.get(0);
            arr.set(0, arr.get(n-1));
            arr.set(n-1, temp);
        }
        
            
        int mid=(n-1)/2;
        for(int i=0;i<mid;i++){
            if(num==i){
                arr.set(i,num);
            }
        }
        for(int i=mid;i<=n-1;i++){
             if(num==i){
                arr.set(i,num);
            }
        }     
        System.out.println("Final ArrayList:");
        for(int data:arr){
            System.out.print(data+"  ");
        }
    }
    
}