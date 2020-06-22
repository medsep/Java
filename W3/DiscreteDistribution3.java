public class DiscreteDistribution3 {
    public static void main(String[] args) {
        //int m = Integer.parseInt(args[0]);
        int n = args.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        int t = 0;
        for (int i = 1; i < n; i++) {
            t += a[i];
        }

        double[] Pr = new double[n];
        for (int i = 1; i < Pr.length; i++) {
            final double p = a[i] / (double) t;
            Pr[i] = Pr[i - 1] + p;
        }

        for (int j = 0; j < a[0]; j++) {
            double r = Math.random();
            int i = 1;
            while (r > Pr[i]) {
                i++;
            }

            System.out.print(i + " ");
        }

    }

}
