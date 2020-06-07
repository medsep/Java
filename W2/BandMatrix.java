public class BandMatrix {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int w1 = Integer.parseInt(args[1]);

        for (int i = 1 ; i <= n1; i++) {
            for (int j = 1; j <= n1; j++) {
                if (Math.abs(i - j) <= w1) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
                    System.out.println();

                }
            }
        }
