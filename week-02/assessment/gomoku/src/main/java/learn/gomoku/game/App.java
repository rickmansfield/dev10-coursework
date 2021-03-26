package learn.gomoku.game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Step one display Welcome and prompt for Players
        playerSetUp((console));


    }
    private static void playerSetUp(Scanner console) {
        System.out.println("\nWelcome to Gomoku");
        System.out.println("<=================>");
        System.out.println("Player 1 is:");
        System.out.println("1. Human");
        System.out.println("2. Random Player");
        System.out.print("Select [1-2]: ");

    }
}
