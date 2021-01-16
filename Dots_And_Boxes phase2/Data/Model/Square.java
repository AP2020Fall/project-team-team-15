package core.core.data.model;

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
        return this.owner;
    }


    @Override
    public Player getTop() {
        return this.top;
    }


    @Override
    public Player getBottom() {
        return this.bottom;
    }


    @Override
    public Player getLeft() {
        return this.left;
    }


    @Override
    public Player getRight() {
        return this.right;
    }


    @Override
    public boolean setTop(Player top) {
        this.top = top;
        if (right != null && bottom != null && left != null) {
            this.owner = top;
            return true;
        }
        return false;
    }


    @Override
    public boolean setBottom(Player bottom) {
        this.bottom = bottom;
        if (top != null && right != null && left != null) {
            this.owner = bottom;
            return true;
        }
        return false;
    }


    @Override
    public boolean setLeft(Player left) {
        this.left = left;
        if (top != null && bottom != null && right != null) {
            this.owner = left;
            return true;
        }
        return false;
    }


    @Override
    public boolean setRight(Player right) {
        this.right = right;
        if (top != null && bottom != null && left != null) {
            this.owner = right;
            return true;
        }
        return false;
    }
}

