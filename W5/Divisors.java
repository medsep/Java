public class Divisors {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        if (b == 0) return a;
        else return ((Math.abs(a * b)) / (gcd(a, b)));
    }

    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    public static int totient(int n) {
        if (n <= 0) return 0;
        else {
            int x = 0;
            int i = 0;
            while (i <= n) {
                if (gcd(n, i) == 1) {
                    x++;
                }
                i++;
            }
            return x;
        }
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        StdOut.println(("gcd(" + a + ", " + b + ") = " + gcd(a, b)));
        StdOut.println(("lcm(" + a + ", " + b + ") = " + lcm(a, b)));
        StdOut.println(("areRelativelyPrime(" + a + ", " + b + ") = " + areRelativelyPrime(a, b)));
        StdOut.println(("totient(" + a + ") = " + totient(a)));
        StdOut.println(("totient(" + b + ") = " + totient(b)));
    }
}
