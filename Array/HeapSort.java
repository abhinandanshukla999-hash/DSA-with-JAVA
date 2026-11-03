import java.util.Scanner;

public class HeapSort {
    static void BMH(int[] A){
        int hs = A.length-1;
        for (int i = (A.length / 2) - 1; i >= 0; i--) {
            Max_Heapify(A, i, hs);
        }
    }

    static void Max_Heapify(int[] A, int i, int hs) {
        int r = 2 * i + 1;
        int l = 2 * i + 2;
        if (l < hs && A[l] > A[i]) {
            int largest = l;

            int temp = A[largest];
            A[largest] = A[i];
            A[i] = temp;
            Max_Heapify(A, largest, hs);
        }
        if (r < hs && A[r] > A[i]) {
            int largest = r;

            int temp = A[largest];
            A[largest] = A[i];
            A[i] = temp;
            Max_Heapify(A, largest, hs);
        }

    }

    static void heapSort(int A[]) {
        BMH(A);
        int hs = A.length ;
        for (int i = A.length - 1; i > 0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;

            hs = hs - 1;

            Max_Heapify(A, 0, hs);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int A[] = new int[n];

        System.out.println("Enter the array :");

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Provided array:");
        for (int data : A)
            System.out.println(data);

        heapSort(A);

        System.out.println("Array after sorting:");
        for (int data : A)
            System.out.println(data);

    }
}
