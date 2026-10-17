package JCF.List;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Remove {

    public static void main(String[] args) {
        Map<Integer,String> hash=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the HashMap:");
        int len=sc.nextInt();
        for(int i=0;i<len;i++){
            System.out.println("Enter value:");
            String val=sc.next();
            hash.put(i, val);
        }
        
        System.out.println("Your HashMap is:");
        for(int k:hash.keySet()){
            System.out.println(k+"=>" +hash.get(k));
        }
        System.out.println("Enter the key you want to delete:");
        int del=sc.nextInt();
        hash.remove(del);
        System.out.println("HashMap After the operation:");
        for(int k:hash.keySet()){
            System.out.println(k+"=>" +hash.get(k));
        }
         
    }
    
} 