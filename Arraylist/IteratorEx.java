import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx{
    public static void main(String [] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Abhinandan");
        arr.add("Amit");
        arr.add("Madhav");
        arr.add("Nitin");

        Iterator<String>it=arr.iterator();
        while (it.hasNext()) {
            String  name=it.next();
            System.out.println(name);
        }
    }
}