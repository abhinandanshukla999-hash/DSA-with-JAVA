
package BackTracking;
class NQueens {
    static int k=1,n=5;
    static int x[]=new int [6];
    static int count=0;
    static void nq(int k,int n){
        int i;
        for(i=1;i<=n;i++){
            if(place(k,i)==true){
                x[k]=i;
            if(k==n){
                count++;
                System.out.println("Solution:\n"+(count));
               for(int j=1;j<=n;j++) {
                    System.out.println("Solution for queen"+j+": "+(+(j)+","+(x[j])));
                   }
                System.out.println();
                }
            else{
                nq(k+1,n);
                 }
            }
        }
    }
   static boolean place(int k,int i){
    for(int j=1;j<=k-1;j++){
            if(x[j]==i || (Math.abs(x[j]-i)==Math.abs(j-k))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("N-Queens Solution:");
        nq(k,n);
    }
}