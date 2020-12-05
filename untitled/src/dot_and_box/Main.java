package dot_and_box;

import java.util.Scanner;

public class Main {
    private int n;
    private GameSolver redSolver, blueSolver;
    private String redName, blueName;
    Scanner scanner;
    String[] players = {"Select player","Human"};

    public Main() {
        System.out.print("Please Enter your names");
        scanner=new Scanner(System.in);
        redName=scanner.next();
        blueName=scanner.next();
    }

    public static void main(String[] args) {
        Main main=new Main();
    }
}

