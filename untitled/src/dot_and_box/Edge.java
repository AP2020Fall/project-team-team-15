package dot_and_box;

public class Edge{

    private int x, y;
    private boolean horizontal;

    Edge(int x, int y, boolean horizontal) {
        this.x = x;
        this.y = y;
        this.horizontal = horizontal;
    }


    public boolean isHorizontal() {
        return horizontal;
    }

    Edge() {
        x = y = -1;
        horizontal = false;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

}