public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 2, 4 };
        System.out.println("Elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] == arr[i]) {
                
                arr[j] = arr[i];
                j++;
            }
        }
    }
}
