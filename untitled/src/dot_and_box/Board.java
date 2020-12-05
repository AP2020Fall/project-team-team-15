package dot_and_box;
import java.awt.*;
import java.util.ArrayList;
import static java.util.Arrays.fill;

public class Board {

    final static int RED = 0;
    final static int BLUE = 1;
    final static int BLACK = 2;
    final static int BLANK = 3;

    private int[][] hEdge;
    private int[][] vEdge;
    private int[][] box;
    private int n, redScore, blueScore;

    public Board(int n) {
        hEdge = new int[n-1][n];
        vEdge = new int[n][n-1];
        box = new int[n-1][n-1];
        fill(hEdge,BLANK);
        fill(vEdge,BLANK);
        fill(box,BLANK);
        this.n = n;
        redScore = blueScore = 0;
    }

    public Board clone() {
        Board cloned = new Board(n);

        for(int i=0; i<(n-1); i++)
            for(int j=0; j<n; j++)
                cloned.vEdge[i][j] = vEdge[i][j];

        for(int i=0; i<(n-1); i++)
            for(int j=0; j<(n-1); j++)
                cloned.box[i][j] = box[i][j];

        cloned.redScore = redScore;
        cloned.blueScore = blueScore;

        return cloned;
    }

    private void fill(int[][] array, int val) {

    }
}
