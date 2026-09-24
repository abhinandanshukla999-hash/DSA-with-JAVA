public class RainWater {
    public static void trap(int arr[]) {
        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            int lmax = 0;
            int rmax = 0;
            for (int j = 0; j <= i; j++) {
                lmax=Math.max(lmax,arr[j]);
            }
            for (int j = i; j <arr.length; j++) {
                rmax=Math.max(rmax,arr[j]);
            }
            water=water+Math.min(lmax,rmax)-arr[i];

        }
        System.out.println("Water:"+water);
    }

    public static void main(String[] args) {
        int arr[]={10,2,3,4,5,12};
        trap(arr);

    }
}
