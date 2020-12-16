import java.util.Random;
import java.util.Scanner;

public class Main  {
    public static int[] nuts = new int[65];
    public static int player;
    public static int x;
    public static int y;

    public static void main(String[] args) {
        Map map = new Map();
        map.printMap();
        Scanner scanner = new Scanner(System.in);
        x = 0;
        y = 1;
        //initialize center nuts
        nuts[28] = 2;
        nuts[37] = 2;
        nuts[29] = 1;
        nuts[36] = 1;

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("start Reversi game")) {
                break;
            }

        }
}
