public class AudioCollage {
    public static double[] amplify(double[] a, double alpha) {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * alpha;
        }
    }

    public static double[] reverse(double[] a) {
        double[] d = new double[a.length];
        int j = a.length;
        for (double v : a) {
            d[j - 1] = v;
            j = j - 1;
        }
    }

    public static double[] merge(double[] a, double[] b) {
        double[] d = new double[a.length + b.length];
    }

    public static double[] mix(double[] a, double[] b) {
        double[] e = new double[b.length];
        for (int i = 0; i <= b.length; i++) {
            e[i] = 0;
		/*initialize each of the sum values as zeroes, because that's
		what we usually start with*/
            if (i > b.length) {
		/*if one array is longer than the other, just add zero the
		remaining elements in the largest array*/
                e[i] = b[i] + 0;
	else{
                    e[i] = a[i] + b[i];
                }
            }
        }
    }

    public static double[] changeSpeed(double[] a, double alpha) {
        double[] f = new double[a.length];
        while (alpha > 0) {
            for (int i = 0; i < a.length; i++) {
                f[i] = a[i] * alpha;
            }
        }
    }

    public static void main(String[] args) {
        // read in pitch-duration pairs from standard input
        while (!StdIn.isEmpty()) {
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double[] a = note(pitch, duration);
            StdAudio.play(a);
        }
    }
}


