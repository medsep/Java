public class Birthday3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double trials = Integer.parseInt(args[1]);
        int people = 0;
        double pr = 0;
        double count = 0;

        for (int j = 0; j <= n; j++) {
            boolean[] birthday = new boolean[n];
            for (int k = 0; k <= trials; k++) {
                while (true) {
                    people++;
                    int d = (int) ((n - 1) * Math.random());
                    if (birthday[d]) break;
                    birthday[d] = true;
                    if (birthday[j] == birthday[k]) {
                        count++;
                    }
                }
                count += people;
                pr = count / trials;
                System.out.print(k + 1 + "\t" + people + "\t" + pr);
                if (pr >= 0.5) break;

                System.out.println();


            }
        }
    }
}
