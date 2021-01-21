package games.dot_and_box.core;

import games.dot_and_box.core.data.model.Player;

public class InvalidMoveException extends Exception {
    public InvalidMoveException() {
        super("The game has already ended.");
    }


    public InvalidMoveException(Player p) {
        super("Move already made by player: " + p.toString());
    }
}
