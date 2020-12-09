package console.core;

import console.core.data.model.Board;
import console.core.data.model.Box;
import console.core.data.model.Player;

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
}
