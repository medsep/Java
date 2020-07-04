public class PercolationVisualizer {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        int trials = Integer.parseInt(args[2]);

        // repeatedly created n-by-n matrices and display them using standard draw
        StdDraw.enableDoubleBuffering();
        for (int t = 0; t < trials; t++) {
            boolean[][] open = Percolation.random(n, p);
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            Percolation.show(open, false);
            StdDraw.setPenColor(StdDraw.GRAY);
            boolean[][] full = Percolation.flow(open);
            Percolation.show(full, true);
            StdDraw.show();
            StdDraw.pause(1000);
        }
    }
}
