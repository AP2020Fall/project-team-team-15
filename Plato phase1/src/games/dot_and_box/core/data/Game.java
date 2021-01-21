package games.dot_and_box.core;

import games.dot_and_box.core.data.model.Board;
import games.dot_and_box.core.data.model.Box;
import games.dot_and_box.core.data.model.Player;

import java.util.LinkedList;

public class Game<B extends Box> {

    private final Board<B> gameBoard;

    private final LinkedList<Player> players;

    private int availableMoves;

    {
        players = new LinkedList<>();
    }


    public Game(B[][] boxes) {
        this.gameBoard = new Board<>(boxes);
        availableMoves = 2 * boxes.length * (boxes.length + 1);
    }


    public Game(Class<B> type, int size) {
        this.gameBoard = new Board<>(type, size);
        this.availableMoves = 2 * size * (size + 1);
    }


    public void playerJoin(Player newPlayer) {
        players.addLast(newPlayer);
    }


    public void playerLeave(Player player) {
        if (players.contains(player))
            players.remove(player);
        if (numOfPlayers() < 2)
            availableMoves = 0;
    }


    public int numOfPlayers() {
        return players.size();
    }


    public Player getPlayer(int playerIdx) {
        return players.get(playerIdx);
    }


    public void addVerticalLine(int row, int col) throws InvalidMoveException {
        final Player verticalLine = getVerticalLine(row, col);
        if (!isEndGame() && verticalLine == null) {
            if (!gameBoard.addVerticalLine(getCurrentPlayer(), row, col))
                nextPlayer();
            else
                getCurrentPlayer().setNumOfOwnedBoxes(numOfBoxes(getCurrentPlayer()));
            availableMoves--;
        } else if (isEndGame())
            throw new InvalidMoveException();
        else
            throw new InvalidMoveException(verticalLine);
    }


    public Player getVerticalLine(int row, int col) {
        return gameBoard.getVerticalLine(row, col);
    }


    public boolean isEndGame() {
        return availableMoves <= 0;
    }


    public Player getCurrentPlayer() {
        return players.getFirst();
    }


    public void nextPlayer() {
        players.addLast(players.removeFirst());
    }


    public int numOfBoxes(Player player) {
        if (player == null)
            return 0;

        int size  = boardSize();
        int count = 0;

        for (int row = 0; row < size; row++)
            for (int col = 0; col < size; col++)
                if (player.equals(getBoxOwner(row, col)))
                    count++;

        return count;
    }


    public int boardSize() {
        return gameBoard.size();
    }


    public Player getBoxOwner(int row, int col) {
        return gameBoard.getBoxOwner(row, col);
    }


    public void addHorizontalLine(int row, int col) throws InvalidMoveException {
        final Player horizontalLine = getHorizontalLine(row, col);
        if (!isEndGame() && horizontalLine == null) {
            if (!gameBoard.addHorizontalLine(getCurrentPlayer(), row, col))
                nextPlayer();
            else
                getCurrentPlayer().setNumOfOwnedBoxes(numOfBoxes(getCurrentPlayer()));
            availableMoves--;
        } else if (isEndGame())
            throw new InvalidMoveException();
        else
            throw new InvalidMoveException(horizontalLine);
    }


    public Player getHorizontalLine(int row, int col) {
        return gameBoard.getHorizontalLine(row, col);
    }


    public void sortPlayers() {
        if (isEndGame())
            players.sort(Player:: compareTo);
    }

}
