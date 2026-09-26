public class Pairs {
    static void nPairs(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i; j < arr.length - 1; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                count++;
            }

            System.out.println();
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        nPairs(arr);
    }
}