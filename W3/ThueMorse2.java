public class ThueMorse2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String thue = "0";
        String morse = "1";

        for (int i = 1; i <= n; i *= 2) {
            String t = thue;             // save away values
            String m = morse;
            thue += m;
            morse += t;

        }
        //System.out.println(thue);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thue.charAt(i) != thue.charAt(j)) {
                    System.out.print(" - " + " ");
                } else {
                    System.out.print(" + ");
                }
            }
            System.out.println(" ");

        }
    }
}



