package dot_and_box;

import java.util.Scanner;
import console.core.Game;
import console.core.InvalidMoveException;
import console.core.data.model.ConsolePlayer;
import console.core.data.model.Player;
import console.core.data.model.Square;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hello, Welcome to Dots and Boxes");
        int size=8;
        Game<Square> game = new Game<>(Square.class, size);
        int numOfPlayers = 2;
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.print("Enter name of " + (i + 1) + "th player: ");
            String name = input.nextLine();
            if (name == null || name.length() < 1) {
                i--;
                continue;
            }
            game.playerJoin(new ConsolePlayer(name));
        }
    }
}

