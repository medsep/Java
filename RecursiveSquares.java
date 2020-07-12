public class RecursiveSquares {
    public static void drawSquare(double x, double y, double length) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, length / 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, length / 2);
    }

    public static void draw(int n, double x, double y, double length) {
        if (n == 0) return;
        drawSquare(x, y, length);
        double ratio = 2.2;
        // compute x- and y-coordinates of the 4 half-size H-trees
        draw(n - 1, x - length / 2, y + length / 2, length / ratio);//draw(upperLeft);
        draw(n - 1, x + length / 2, y + length / 2, length / ratio);//draw(upperRight);
        drawSquare(x, y, length);
        draw(n - 1, x + length / 2, y - length / 2, length / ratio);//draw(lowerLeft);
        draw(n - 1, x - length / 2, y - length / 2, length / ratio);//draw(lowerRight);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double x = 0.5, y = 0.5;   // center of H-tree
        double length = 0.5;         // side length of H-tree
        draw(n, x, y, length);
    }
}
//  draw(n - 1, x - length / 2, y - length / 2, length / ratio);
//        draw(n - 1, x - length / 2, y + length / 2, length / ratio);
//        draw(n - 1, x + length / 2, y - length / 2, length / ratio);
//        draw(n - 1, x + length / 2, y + length / 2, length / ratio);
