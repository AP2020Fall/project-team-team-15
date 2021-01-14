import java.awt.*;

public class CheckMethodes {
    public static void changeColor(int start, int finish, int type, int counter, int btnIndex) {
        int cnt = 0;
        for (int k = start; k < finish; k += counter) {
            cnt = type + k;
            int location = btnIndex;
            int center = btnIndex;
            boolean flag = false;

            if (MapFrame.btns.get(btnIndex).getBackground() == Color.black) {
                while (true) {
                    // چک کردن index خارج از دسترس
                    if ((cnt == -9 || cnt == 7 || cnt == -1) && location % 8 == 0) {
                        break;
                    }
                    // چک کردن index خارج از دسترس
                    if ((cnt == 9 || cnt == -7 || cnt == 1) && location % 8 == 1) {
                        break;
                    }
                    // چک کردن index خارج از دسترس
                    if (location - cnt <= 0 || location - cnt > 64) {
                        break;
                    }

                    if (MapFrame.btns.get(location - cnt).getBackground() == Color.black) {
                        if (flag) {
                            while (center != (location - cnt)) {
                                MapFrame.btns.get(center).setBackground(Color.black);
                                center -= cnt;
                            }
                            break;
                        } else {
                            break;
                        }
                    } else if (MapFrame.btns.get(location - cnt).getBackground() == Color.white) {
                        flag = true;
                    } else {
                        break;
                    }
                    location -= cnt; // حرکت روی خانه ها با لوکیشن
                }
            }

            if (MapFrame.btns.get(btnIndex).getBackground() == Color.white) {

                while (true) {
                    if ((cnt == -9 || cnt == 7 || cnt == -1) && location % 8 == 0) {
                        break;
                    }
                    if ((cnt == 9 || cnt == -7 || cnt == 1) && location % 8 == 1) {
                        break;
                    }
                    if (location - cnt <= 0 || location - cnt > 64) {
                        break;
                    }
                    if (MapFrame.btns.get(location - cnt).getBackground() == Color.white) {
                        if (flag) {
                            while (center != (location - cnt)) {
                                MapFrame.btns.get(center).setBackground(Color.white);
                                center -= cnt;
                            }
                            break;
                        } else {
                            break;
                        }
                    } else if (MapFrame.btns.get(location - cnt).getBackground() == Color.black) {
                        flag = true;
                    } else {
                        break;
                    }
                    location -= cnt; // حرکت روی خانه ها با لوکیشن
                }
            }

        }


    }

}
