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
        Random random = new Random();
        int rand = random.nextInt();
        if (rand < 0) {
            rand *= -1;
        }
        rand = rand % 2;
        player = rand + 1;

        check.possibleMove((y - 1) * 8 + x + 1);

        while (true) {
            int red = 0;
            int black = 0;
            for (int i = 1; i < 65; i++) {
                if (nuts[i] == 1) {
                    red++;
                } else if (nuts[i] == 2) {
                    black++;
                }
            }


        }
