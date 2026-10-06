public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 2, 4 };
        System.out.println("Elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]) {
                    
                    for (int k = j; k < n-1; k++) {
                        arr[k]=arr[k+1];
                    }
                    n--;
                }
            }
            
        }
        for (int i = n; i < arr.length; i++) {
            arr[i]=0;
        }
        System.out.println("\nArray without duplicacy:");
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
