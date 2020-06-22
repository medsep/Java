public class DiscreteDistribution2 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        int[] sum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
            sum[i] = sum[i] + a[i];
        }
        int b = 0;
        while (b < m) {
            int r = (int) (Math.random() * sum[a.length - 1]);
            if (r < sum[b + 1] && r >= sum[b]) {
                System.out.print(b - 1 + "");
                b++;
            }
            //System.out.print(b - 1 + "");
        }
    }
}
