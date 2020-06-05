public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double x2 = Math.toRadians(Double.parseDouble(args[1]));
        double y1 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));


        double a = Math.sin((x2 - x1) / 2) * Math.sin((x2 - x1) / 2);
        double b = Math.sin((y2 - y1) / 2) * Math.sin((y2 - y1) / 2);
        double c = Math.cos(x1) * Math.cos(x2) * b;
        double d = Math.sqrt(a + c);
        double e = 2 * (6371.0) * Math.asin(d);

        System.out.println(e + " kilometers");


    }
}
