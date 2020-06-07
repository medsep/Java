public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]), trials = Integer.parseInt(args[1]);//,x = 0, y = 0, steps = 0;
        double average = 0;
        int totalSteps = 0;

        for (int i = 1; i <= trials; i++) {
            int x = 0;
            int y = 0;
            int steps = 0;
            while (Math.abs(x + y) <= r) {
                if (Math.random() < 0.25) x++;
                else if (Math.random() <= 0.5) y++;
                else if (Math.random() <= 0.75) x--;
                else y--;
                steps++;
            }
            totalSteps = totalSteps + steps;
            }
        average = ((double) totalSteps / trials);
        System.out.println("Average number of steps = " + average);
    }
}
