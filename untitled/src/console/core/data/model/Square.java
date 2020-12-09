package console.core.data.model;

public class Square implements Box {

    private Player owner;
    private Player top;
    private Player bottom;
    private Player left;
    private Player right;

    public Square() {

    }

    @Override
    public Player getOwner() {
        return null;
    }

    @Override
    public Player getTop() {
        return null;
    }

    @Override
    public Player getBottom() {
        return null;
    }

    @Override
    public Player getLeft() {
        return null;
    }

    @Override
    public Player getRight() {
        return null;
    }

    @Override
    public boolean setTop(Player top) {
        return false;
    }

    @Override
    public boolean setBottom(Player bottom) {
        return false;
    }

    @Override
    public boolean setLeft(Player left) {
        return false;
    }

    @Override
    public boolean setRight(Player right) {
        return false;
    }
}
