public class MergeSort {

    static void mergesort(int arr[],int p,int r){
        if(p<r){
            int q=(p+r)/2;
            mergesort(arr, p, q);
            mergesort(arr, q+1, r);
            merge(arr,p,q,r);


        }
    }
    static void merge(int arr[],int p,int q, int r){
        int n1=q-p+1;
        int n2=r-q;
        int L[]=new int[n1+1];
        int R[]=new int[n2+1];
        int i,j;
        for ( i = 0; i < L.length-1; i++) {
            L[i]=arr[p+i];
        }
        for(j=0;j< R.length-1;j++){
            R[j]=arr[q+j+1];
        }
        i=0;j=0;
        L[n1]=Integer.MAX_VALUE;
        R[n2]=Integer.MAX_VALUE;

        for(int k=p;k<=r;k++) {
           if (L[i]<=R[j]) {
                arr[k]=L[i];
                i++;

           } 
           else{
            arr[k]=R[j];
            j++;
           }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={5,9,1,0,9,5,0,6};
        System.out.println("The given array is:");
        for (int i : arr) {
            System.out.print(" "+i+" ");
        }
        int p=0;
        int r=arr.length-1;
        mergesort(arr,p,r);

        System.out.println("\nSorted output:");
        for (int i : arr) {
            System.out.print(" "+i+" ");
        }
    }
}
