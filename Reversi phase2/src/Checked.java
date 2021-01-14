import java.awt.*;

public class Checked {
    static int whiteCnt = 0;
    static int blackCnt = 0;

    public void possibleMove(int btnIndex) {
        //changing color
        CheckMethodes.changeColor(-1, 2, -8, 1, btnIndex);
        CheckMethodes.changeColor(-1, 2, 0, 2, btnIndex);
        CheckMethodes.changeColor(-1, 2, 8, 1, btnIndex);
        //checking move
        CheckMethodes.checkMove(-1, 2, -8, 1);
        CheckMethodes.checkMove(-1, 2, 0, 2);
        CheckMethodes.checkMove(-1, 2, 8, 1);

        whiteCnt = 0;
        blackCnt = 0;
        for (int i = 1; i <= 64; i++) {
            if (MapFrame.btns.get(i).getBackground() == Color.black) {
                blackCnt++;
            }
            if (MapFrame.btns.get(i).getBackground() == Color.white) {
                whiteCnt++;
            }
        }
        MapFrame.whiteLbl.setText(String.valueOf(whiteCnt));
        MapFrame.blackLbl.setText(String.valueOf(blackCnt));

        int tmp = 0;
        for (int i = 1; i <= 64; i++) {
            if (MapFrame.btns.get(i).getBackground() == Color.gray) {
                tmp++;
            }

        }
        if (tmp == 0) {
            MapFrame.information.setText("Pass");
            if (MapFrame.player == 1) {
                MapFrame.player = 2;
            } else {
                MapFrame.player = 1;
            }
            CheckMethodes.checkMove(-1, 2, -8, 1);
            CheckMethodes.checkMove(-1, 2, 0, 2);
            CheckMethodes.checkMove(-1, 2, 8, 1);
            for (int i = 1; i <= 64; i++) {
                if (MapFrame.btns.get(i).getBackground() == Color.gray) {
                    tmp++;
                }
            }
            if (tmp == 0) {

                if (whiteCnt < blackCnt) {
                    MapFrame.information.setText("player 1 won!!!");
                } else if (whiteCnt > blackCnt) {
                    MapFrame.information.setText("player 2 won!!!");
                } else {
                    MapFrame.information.setText("draw!!!");
                }
            }
        }
    }

}
