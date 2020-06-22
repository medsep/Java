public class Birthday2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int people = 0;
        double pr = 0;
        int[] count = new int[n + 2];

        for (int j = 0; j < trials; j++) {
            boolean[] birthday = new boolean[n];
            while (true) {
                people++;
                int d = (int) ((n - 1) * Math.random());
                if (birthday[d]) break;

                count[j] += people;
                birthday[d] = true;
            }

            for (int i = 0; i < trials; i++) {
                if (birthday[j] == birthday[i]) {
                    people++;
                }
                pr += count[j];
                pr /= trials;

                System.out.print(j + 1 + "\t" + people + "\t" + pr);
                if (pr >= 0.5) break;
                System.out.println();

            }


        }
    }
}
