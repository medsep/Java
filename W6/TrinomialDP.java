public class TrinomialDP {
    //private static long[] f = new long[92];

    public static long trinomial(int n, int k) {
        long[][] T = new long[n + 1][k + 1];
        //T[n][k] = Math.min(T[n][-k]);
        //T[0][0] = 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (j == 0 || i == j) T[i][j] = 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, k); j++) {
                if (j > i || j < -i) T[i][j] = 0;
                else T[i][j] = T[i - 1][j - 1] + T[i - 1][j];// + T[i - 1][j + 1];

            }
        }
        return T[n][k];
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
        //System.out.println(trinomial(n, k));
    }
}

