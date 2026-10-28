public class SecondLargest {
    public static void main(String[] args) {
        {
            int arr[]={12,34,32,90,89};
            int largest=Integer.MIN_VALUE;
            int sec_largest=Integer.MIN_VALUE;
             
            for(int i:arr){
                
                if (i>largest) {
                    sec_largest=largest;
                    largest=i;
                }
                else if (sec_largest<i && largest>i) {
                    sec_largest=i;
                }
            }
            System.out.println("Second Largest number Is:"+sec_largest);

        }
    }
}
