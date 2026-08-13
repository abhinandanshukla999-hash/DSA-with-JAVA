import java.util.Scanner;

class Imp {
    public static void method(int arr[], int element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at the index :" + i);
            }
        }
    }

    public static void deleteVal(int arr[], int del) {
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == del) {
                ind = i;
            }
        }
        if (ind == 0) {
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];

            }
        } else if (ind == arr.length - 1) {
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];

            }
        } else if (ind > 0 && ind < arr.length - 1) {
            for (int j = ind; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

        } else {
            System.out.println("Please enter a valid number that is present in the array");
        }
        System.out.println("Updated array is:");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);

        }

    }

   
    
}


public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the element you want to search for:");
        int element = sc.nextInt();

        Imp.method(arr, element);

        System.out.println("If you want to delete an element, press 1 else press 0:");
        int choice = sc.nextInt();
        if (choice == 0) {
            System.out.println("Sorry,Can't add in the same array because arrays are static.");
            System.out.println("Well ,Thanks for the response!");

        } else if (choice == 1) {
            System.out.println("Enter the element you want to delete:");
            int del = sc.nextInt();
            Imp.delete(arr, del);

        } else {
            System.out.println("Please enter a valid number between 0 & 1!");
        }
        
        sc.close();
    }

}
