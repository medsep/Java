public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        double sum = 0;
        for (int i = 1; i <= n1; i++)
            sum += 1/((Math.pow(i,n2)));
        System.out.println(sum);
    }

}
//(1 / (Math.pow(n1, n2)))
