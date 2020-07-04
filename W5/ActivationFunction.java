public class ActivationFunction {
    public static double heaviside(double x) {
        //if (x > 0) return (1);
        if (x == 0) return (0.5);
        if (x < 0) return (0);
        else return (1);
    }

    public static double sigmoid(double x) {
        return (1 / (1 + Math.exp(-x)));
    }

    public static double tanh(double x) {
        return ((Math.exp(x) - Math.exp(-x)) / (Math.exp(-x) + Math.exp(x)));
    }

    public static double softsign(double x) {
        return (x / (1 + Math.abs(x)));
    }

    public static double sqnl(double x) {
        if (x <= -2) return (-2);
        if (-2 < x & x < 0) return ((Math.pow(x, 2) / 4) + x);
        if (0 <= x & x < 2) return (x - (Math.pow(x, 2) / 4));
            //if (2 <= x) return (1);
        else return (1);
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        if (Double.isNaN(x)) {
            StdOut.println("NaN");
        }
        StdOut.println(heaviside(x));
        StdOut.println(sigmoid(x));
        StdOut.println(tanh(x));
        StdOut.println(softsign(x));
        StdOut.println(sqnl(x));
    }
}
