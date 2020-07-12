public class tdp {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        long[][] T = new long[n + 1][k + 1];
        //T[0][0] = 1;
        //T[1][0] = 1;
        //T[1][1] = 1;
        //for (int i = 0; i <= n; i++) T[i][0] = T[i][0] + T[i][0];
        //for (int j = 0; j <= k; j++) T[0][j] = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) T[i][j] = 1;
                if (j > i || j < -i) T[i][j] = 0;
                //if (j == 0 & i > 1) T[i][0] = T[i - 1][0] + T[i - 1][0];
                T[i][j] = T[i - 1][j - 1] + T[i - 1][j];// + T[i - 1][j + 1];
            }
        }

        System.out.println(T[n][k]);
    }
}

