class FindMissing{
    public static void main(String[] args) {
        int arr[]={1,2,4,0,5,6};
        int sum=0;
        int n=arr.length;
        int tot=n*(n+1)/2;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Missing Value: "+(tot-sum));
    }
}
