/**
 * CheckMethods
 * have changeColor method to changing color
 * have CheckMove method to check move
 */

public class checkMethods {
    static void changeColor(int start, int finish, int type, int counter, int btnIndex) {
        int cnt = 0;
        for (int k = start; k < finish; k += counter) {
            cnt = type + k;
            int location = btnIndex;
            int center = btnIndex;
            boolean flag = false;
            //player 1
            if (Main.nuts[btnIndex] == 1) {
                while (true) {
                    if ((cnt == -9 || cnt == 7 || cnt == -1) && location % 8 == 0) {     //out of map
                        break;
                    }
                    if ((cnt == 9 || cnt == -7 || cnt == 1) && location % 8 == 1) {      //out of map
                        break;
                    }
                    if (location - cnt <= 0 || location - cnt > 64) {                    //out of map
                        break;
                    }
                    if (Main.nuts[location - cnt] == 1) {
                        if (flag) {
                            while (center != (location - cnt)) {
                                Main.nuts[center] = 1;
                                center -= cnt;
                            }
                            break;
                        } else {
                            break;
                        }
                    } else if (Main.nuts[location - cnt] == 2) {
                        flag = true;
                    } else {
                        break;
                    }
                    location -= cnt;
                }
            }
            //player 2
            if (Main.nuts[btnIndex] == 2) {
                while (true) {
                    if ((cnt == -9 || cnt == 7 || cnt == -1) && location % 8 == 0) {      //out of map
                        break;
                    }
                    if ((cnt == 9 || cnt == -7 || cnt == 1) && location % 8 == 1) {       //out of map
                        break;
                    }
                    if (location - cnt <= 0 || location - cnt > 64) {                     //out of map
                        break;
                    }
                    if (Main.nuts[location - cnt] == 2) {
                        if (flag) {
                            while (center != (location - cnt)) {
                                Main.nuts[center] = 2;
                                center -= cnt;
                            }
                            break;
                        } else {
                            break;
                        }
                    } else if (Main.nuts[location - cnt] == 1) {
                        flag = true;
                    } else {
                        break;
                    }
                    location -= cnt;
                }
            }
    }
}
