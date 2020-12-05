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

}