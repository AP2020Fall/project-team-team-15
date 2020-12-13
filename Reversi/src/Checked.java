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



}
