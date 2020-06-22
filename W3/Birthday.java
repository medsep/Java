public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double trials = Integer.parseInt(args[1]);
        int people = 0;
        double pr = 0;
        //int count = 0;
        int[] count = new int[n + 2];

        for (int j = 0; j <= n; j++) {
            boolean[] birthday = new boolean[n];
            for (int k = 0; k <= trials; k++) {
                while (true) {
                    people++;
                    int d = (int) ((n - 1) * Math.random());
                    if (birthday[d]) break;
                    if (birthday[j] == birthday[k]) {
                        people++;
                    }
                    birthday[d] = true;
                }
            }

            for (int i = 0; i < count.length; i++) {
                pr += count[i];
                pr /= trials;
                System.out.print(i + 1 + "\t" + people + "\t" + pr);
                if (pr >= 0.5) break;

                System.out.println();


            }
        }
    }
}
