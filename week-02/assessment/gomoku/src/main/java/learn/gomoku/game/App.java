package learn.gomoku.game;

import learn.gomoku.ui.GamePlay;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        GamePlay gamePlay = new GamePlay();
        gamePlay.run();

    }
}
