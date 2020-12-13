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
    }
}
