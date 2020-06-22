public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        //int[][] a = new int[m][n];

        boolean[][] mines = new boolean[m + 2][n + 2];
        double p = (k / (m * (double) n));
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                mines[i][j] = Math.random() < p;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (mines[i][j]) System.out.print("* ");
                else System.out.print(" ");
                System.out.println();
            }
            int[][] sol = new int[m + 2][n + 2];
            for (i = 1; i <= m; i++)
                for (int j = 1; j <= n; j++)
                    for (int ii = i - 1; ii <= i + 1; ii++)
                        for (int jj = j - 1; jj <= j; jj++)
                            if (mines[ii][jj]) sol[i][j]++;

            System.out.println();
            for (i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++)
                    if (mines[i][j]) System.out.print("* ");
                    else System.out.print(sol[i][j] + " ");
                System.out.println();

            }

        }
    }
}
