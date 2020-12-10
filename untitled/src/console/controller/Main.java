package console.controller;


import console.core.Game;
import console.core.InvalidMoveException;
import console.core.data.model.ConsolePlayer;
import console.core.data.model.Player;
import console.core.data.model.Square;
import java.util.*;

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

        while (!game.isEndGame()) {
            System.out.println("\nPlayers in order to play:");
            showPlayers(game);
            System.out.println("Game board status:");
            showBoard(game);

            System.out.println(game.getCurrentPlayer() + ": Enter your move in following format:");
            System.out.println("H | V row column");
            System.out.println("for example:");
            System.out.println("H 2 3");

            final String command = input.next();
            if (command.equalsIgnoreCase("exit"))
                break;

            if (command.equalsIgnoreCase("h"))
                try {
                    game.addHorizontalLine(input.nextInt(), input.nextInt());
                } catch (InvalidMoveException e) {
                    System.out.println(e.getMessage());
                }
            else
                try {
                    game.addVerticalLine(input.nextInt(), input.nextInt());
                } catch (InvalidMoveException ignored) {

                }
        }
    }

    private static void showPlayers(Game<Square> game) {
        int numOfPlayers = game.numOfPlayers();
        for (int i = 0; i < numOfPlayers; i++)
            System.out.println(" -> " + game.getPlayer(i) + " : " + game.numOfBoxes(game.getPlayer(i)));
    }

}

