package BackTracking;

public class MultiplicationOfSubset {
    int m[][] = new int[6][6];
    int i, j;
    int p[] = { 5, 6, 7, 8, 9 ,10};

    public void matrix(int p[]) {
        for (i = 1; i < 6; i++) {
            for (j = i; j < 6; j++) {
                m[i][j] = 32767;
            }
        }
        for (i = 1; i < 6; i++) {
            for (j = i; j < 6; j++) {
                lookup(p, i, j);
            }
        }
    }

    int lookup(int p[], int i, int j) {
        if (m[i][j] < 32767) {
            return m[i][j];

        }
        if (i == j) {
            m[i][j] = 0;
        } else {

            for (int k = i; k <= j - 1; k++) {
                int Q;
                Q = lookup(p, i, k) + lookup(p, k + 1, j) + (p[i - 1] * p[k] * p[j]);
                if (Q < m[i][j]) {
                    m[i][j] = Q;
                }
            }
        }
        return m[i][j];
    }

    public static void main(String[] args) {
        MultiplicationOfSubset obj=new MultiplicationOfSubset();
        System.out.println("Solution of matrix chain order:");
        obj.matrix(obj.p);
       
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" " + obj.m[i][j]);
            }
            System.out.println();
        }
        System.out.println("Solution is:"+obj.m[1][5]);

        
        
    }
}