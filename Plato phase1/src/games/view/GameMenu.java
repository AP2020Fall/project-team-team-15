package games.view;

import games.dot_and_box.controller.Main;

import java.util.Scanner;

public class GameMenu {
    Scanner scanner=new Scanner(System.in);
    public void instructionGame(){
        System.out.println("list games:\ndot_and_box\nriversi");
        System.out.println("choose game you want");
        String gameName=scanner.next();
        if (gameName.equals("dot_and_box")){
            Main main=new Main();
            main.start();
        }
        else if (gameName.equals("riversi")){
        }
        else {
            System.out.println("invalid game name");
            instructionGame();
        }

    }
}
