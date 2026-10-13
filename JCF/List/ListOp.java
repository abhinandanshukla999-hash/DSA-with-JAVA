package JCF.List;
import java.util.ArrayList;
import java.util.List;

class ListOp{
    public static void main(String[] args) {
        List<String>li=new  ArrayList<>() ;
        li.add("Abhay");
        li.add("Satyam");
        li.add("Sundar");
        li.add("Bhola");

        System.out.println("List :"+li);//outputs like an array 
        
        //traversal
        for (String string : li) {
            System.out.println(string);
        }

        System.out.println("\nFirst element of the list:"+li.getFirst());//accessing first element

        System.out.println("\nLast element of the list:"+li.getLast());//accessing last element

        System.out.println("\n"+li.isEmpty());//returns true if empty

        System.out.println("\n"+li.removeFirst());// removes the given entity

        System.out.println(li);
        
    }
}