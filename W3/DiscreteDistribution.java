public class DiscreteDistribution {
    public static void main(String[] args) {
        int n = args.length - 1;
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = Integer.parseInt(args[0]);
        }

        int t = 0;
        for (int i = 0; i < n; i++) {
            t += m[i];
        }

        int r = (int) (t * Math.random());
        int sum = 0, e = -1;
        for (int i = 0; i < n && sum <= r; i++) {
            sum += m[i];
            e = i;
            System.out.println(m[i]);
        }

        //for (int j =)

        System.out.println(e + "\t" + n + "\t" + m[1]);
    }

}

