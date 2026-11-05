package Miscelleneous;

public class ReversrString {
    public static void main(String[] args) {
        String str[]={"H","E","L","L","O"};
        int i=0;
        int j=str.length-1;
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;

            i=i+1;
            j=j-1;
        }
        for (String string : str) {
            System.out.println(string);
        }
       
    }
}
