public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]); //, x = 0, y = 0, steps = 0;
        int x = 0, y = 0, steps = 0;
        while (Math.abs(x+y) <= r){
                    if (Math.random() < 0.25) x++;
                    else if (Math.random() <= 0.5) y++;
                    else if (Math.random() <= 0.75) x--;
                    else y--;
                    System.out.println("("+ x + " , " + y+")");
                    steps++;
        }
        System.out.println("Steps = " + steps);
}
}
