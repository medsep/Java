public class ThueMorse3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[] a = new boolean[n];
        a[0] = false;
        for (int i = 2; i < n; i++) {
            a[i] = (a[i - 1] && !a[i - 1]);
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.print("+ " + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(" ");
        }

    }
}
