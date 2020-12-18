<<<<<<< HEAD
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Checked {
    public void possibleMove(int btnIndex) {
        //changing color
        CheckMethods.changeColor(-1, 2, -8, 1, btnIndex);
        CheckMethods.changeColor(-1, 2, 0, 2, btnIndex);
        CheckMethods.changeColor(-1, 2, 8, 1, btnIndex);

        //checking move
        CheckMethods.checkMove(-1, 2, -8, 1);
        CheckMethods.checkMove(-1, 2, 0, 2);
        CheckMethods.checkMove(-1, 2, 8, 1);

        int tmp = 0;
        for (int i = 1; i <= 64; i++) {
            if (Main.nuts[i] == 3) {
                tmp++;
            }
        }
        if (tmp == 0) {
            System.out.println("Pass");
            if (Main.player == 1) {
                Main.player = 2;
            } else {
                Main.player = 1;
            }
        }
        //check for finish game
        CheckMethods.checkMove(-1, 2, -8, 1);
        CheckMethods.checkMove(-1, 2, 0, 2);
        CheckMethods.checkMove(-1, 2, 8, 1);

        for (int i = 1; i <= 64; i++) {
            if (Main.nuts[i] == 3) {
                tmp++;
            }
        }
        if (tmp == 0) {
            int black = 0;
            int red = 0;
            for (int i = 0; i < 65; i++) {
                if (Main.nuts[i] == 1) {
                    red++;
                }
                if (Main.nuts[i] == 2) {
                    black++;
                }
            }
            try {
                File f1 = new File("result.txt");
                if (!f1.exists()) {
                    f1.createNewFile();
                }

                FileWriter fileWritter = new FileWriter(f1.getName(), true);
                BufferedWriter bw = new BufferedWriter(fileWritter);
                bw.write("Player 1: " + red + "   Player 2: " + black + "\n");
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (black > red) {
                System.out.println("Player 2 won!!!");
                System.out.println("Player 1: " + red + "   Player 2: " + black);
                System.out.println("Last disk: (" + (Main.x + 1) + ", " + Main.y + ")");
                System.exit(0);
            }
            if (black < red) {
                System.out.println("Player 1 won!!!");
                System.out.println("Player 1: " + red + "   Player 2: " + black);
                System.out.println("Last disk: (" + (Main.x + 1) + ", " + Main.y + ")");
                System.exit(0);
            }
            if (black == red) {
                System.out.println("Draw!!!");
                System.out.println("Player 1: " + red + "   Player 2: " + black);
                System.out.println("Last disk: (" + (Main.x + 1) + ", " + Main.y + ")");
                System.exit(0);
            }
        }
    }
=======
public class Checked {
>>>>>>> 0eb87e411422785c28af395faf42e1d137aed109
}
