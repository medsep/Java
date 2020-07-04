public class ShannonEntropy {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[m + 1];
        double sum = 0;
        int count = 0;

        while (!StdIn.isEmpty()) {
            int v = StdIn.readInt();
            ++a[v];
            count += 1;
        }
        for (int i = 1; i <= m + 1; i++) {
            double p = a[i] / (double) count;
            double H = 0;
            if (p != 0) {
                H = (-p * (Math.log(p) / Math.log(2)));
            }
            sum += H;
        }
        StdOut.printf("%.4f", sum);
    }
}


