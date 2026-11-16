package JCF.List;
import java.util.HashSet;

public class CheckDuplicacy {
    public static void main(String[] args) {

        HashSet <Integer> hash=new HashSet<>();
        int arr[]={1,2,3,1,2};

        for (int i : arr) {
            
            if (!hash.add(i)) {
                System.out.println("Duplicate is : "+i);
            }
        }
         
    }
}
