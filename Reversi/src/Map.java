public class Map {
    public void printMap() {
        System.out.print("\n  1   2   3   4   5   6   7   8");
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_RED = "\u001B[31m";

        for (int i = 0; i < 8; i++) {
            System.out.print("\n---------------------------------\n");   //first line
            for (int j = 0; j < 8; j++) {
                if (Main.nuts[i * 8 + (j + 1)] == 1) {
                    System.out.print("| ");
                    System.out.print(ANSI_RED + "O" + ANSI_RESET + " ");
                }
            }
        }
    }
}
