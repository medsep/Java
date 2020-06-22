public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        //int distinct = 0;
        //int[][] a = new int[n][n];

        boolean[][] a = new boolean[n][n];
        String thue = "0";
        String morse = "1";
        for (int i = 1; i < n; i *= 2) {
            String t = thue;
            String m = morse;
            thue += m;
            morse += t;
        }

        //for (int i = 0; i < n; i++)
        //  for (int j = 0; j < n; j++)
        //   a[i][j] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //if (Array.thue[i] != thue[j])
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
    }
}
