public class SubAdd {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,9,8,15};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                sum=sum+arr[i];
            }
            else{
                sum=sum-arr[i];
            }
        }
        System.out.println(sum);

    }
}
