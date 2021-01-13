import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Action implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        if (((JButton) e.getSource()).getBackground() == Color.green) {
            int btnIndex = 0;
            ArrayList<Integer> grayBtn = new ArrayList<>();
            if (MapFrame.player == 1) {
                for (int i = 1; i <= 64; i++) {
                    if (MapFrame.btns.get(i).getBackground() == Color.gray) {
                        grayBtn.add(i);
                    }
                }
                Random rand = new Random();
                btnIndex = rand.nextInt(grayBtn.size());
                MapFrame.btns.get(grayBtn.get(btnIndex)).setBackground(Color.black);
                // برای پاک کردن موقعیت های بازی قبل
                for (int i = 1; i <= 64; i++) {
                    if (MapFrame.btns.get(i).getBackground() == Color.gray) {
                        MapFrame.btns.get(i).setBackground(Color.pink);
                    }
                }
                MapFrame.information.setText("player 2");
                MapFrame.player = 2;
            } else {
                for (int i = 1; i <= 64; i++) {
                    if (MapFrame.btns.get(i).getBackground() == Color.gray) {
                        grayBtn.add(i);
                    }
                }
                Random rand = new Random();
                btnIndex = rand.nextInt(grayBtn.size());
                MapFrame.btns.get(grayBtn.get(btnIndex)).setBackground(Color.white);
                for (int i = 1; i <= 64; i++) {
                    if (MapFrame.btns.get(i).getBackground() == Color.gray) {
                        MapFrame.btns.get(i).setBackground(Color.pink);
                    }
                }

                MapFrame.information.setText("player 1");
                MapFrame.player = 1;
            }

        }
        if (((JButton) e.getSource()).getBackground() == Color.gray) {
            int btnIndex = MapFrame.btns.indexOf(e.getSource()); // ذخیره index کلیک شده
            ((JButton) e.getSource()).setSize(58, 58);
            ((JButton) e.getSource()).setOpaque(true);
            ((JButton) e.getSource()).setBorderPainted(false);
            if (MapFrame.player == 1) {
                ((JButton) e.getSource()).setBackground(Color.black);
                for (int i = 1; i <= 64; i++) {
                    if (MapFrame.btns.get(i).getBackground() == Color.gray) {
                        MapFrame.btns.get(i).setBackground(Color.pink);
                    }
                }
                MapFrame.information.setText("player 2");
                MapFrame.player = 2;
            } else {
                ((JButton) e.getSource()).setBackground(Color.white);
                for (int i = 1; i <= 64; i++) {
                    if (MapFrame.btns.get(i).getBackground() == Color.gray) {
                        MapFrame.btns.get(i).setBackground(Color.pink);
                    }
                }
                MapFrame.information.setText("player 1");
                MapFrame.player = 1;
            }

        }

    }
}
