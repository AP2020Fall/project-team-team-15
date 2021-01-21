package games.dot_and_box.controller;

import games.dot_and_box.core.InvalidMoveException;
import games.dot_and_box.core.data.model.ConsolePlayer;
import games.dot_and_box.core.data.model.Player;
import games.dot_and_box.core.data.model.Square;

import java.util.Scanner;

public class Main extends Thread{
    @Override
    public void run() {

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
    private static void showBoard(Game<Square> game) {
        int size = game.boardSize();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) { // print horizontal lines
                System.out.print(".");
                if (game.getHorizontalLine(row, col) != null) {
                    System.out.print("──");
                } else {
                    System.out.print("   "); // print spaces if it's empty
                }
                if (col == size - 1) {
                    System.out.print("."); // print last dot
                }
            }
            System.out.println();
            for (int col = 0; col < size; col++) { // print vertical lines
                if (game.getVerticalLine(row, col) != null) {
                    System.out.print("|");
                }
                Player owner = game.getBoxOwner(row, col);
                if (owner != null) {
                    System.out.print(" " + owner.getName().substring(0, 1).toUpperCase() + " ");
                } else {
                    System.out.print("   ");
                }
                if (col == size - 1) {
                    if (game.getVerticalLine(row, col + 1) != null) {
                        System.out.print("|");
                    }
                }
            }
            System.out.println();
            if (row == size - 1) { // print last row
                for (int col = 0; col < size; col++) {
                    System.out.print(".");
                    if (game.getHorizontalLine(row + 1, col) != null) {
                        System.out.print("──");
                    } else {
                        System.out.print("   ");
                    }
                    if (col == size - 1) {
                        System.out.print(".");
                    }
                }
                System.out.println();

            }
        }
    }
}
