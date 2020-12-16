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
            map.printMap();
            System.out.println("Player 1: " + red + "    Player 2: " + black);
            System.out.println("Turn: Player " + player);

            System.out.print("X: ");
            x = scanner.nextInt() - 1;
            if (x > 8 || x < 0) {
                System.out.println("Coordinates must be inside the table");
                continue;
            }



        }
