public class RightTriangle {
    public static void main(String[] d) {

        int a = Integer.parseInt(d[0]);
        int b = Integer.parseInt(d[1]);
        int c = Integer.parseInt(d[2]);

        int e = a * a;
        int f = b * b;
        int g = c * c;

        boolean isPos = (a > 0) && (b > 0) && (c > 0);
        boolean SOE = (e + f == g) || (e + g == f) || (f + g == e);
        boolean isRT = isPos && SOE;

        System.out.println(isRT);
    }
}
//else if System.out.println("true");;

//System.out.println( boolean isTri);


//isTri = a + b > c || b + c > a || a + c > b;
//if (a < 1 || b < 1 || c < 1)
//isTri = false;

//System.out.println("isTri");



