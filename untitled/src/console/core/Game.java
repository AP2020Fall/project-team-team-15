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
}
