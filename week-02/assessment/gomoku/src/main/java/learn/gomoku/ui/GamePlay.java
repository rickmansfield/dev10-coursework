package learn.gomoku.ui;

import learn.gomoku.game.Gomoku;
import learn.gomoku.game.Result;
import learn.gomoku.game.Stone;
import learn.gomoku.players.HumanPlayer;
import learn.gomoku.players.Player;
import learn.gomoku.players.RandomPlayer;

import java.util.Scanner;

public class GamePlay {
    // steps for GamePlay:
    //class-level variables...?
    //Scanner
    Scanner console = new Scanner(System.in);
    //Stone[][] stoneArray
    Stone[][] stonesArrays = new Stone[Gomoku.WIDTH][Gomoku.WIDTH];
    // boolean playAgain
    boolean playAgain;

    //1) Create run() method to serve as an entery point
    public void run() {
        System.out.println("Running");

        //loop for playing a game (while playAgain()?)

        do {
            System.out.println("Welcome to Gomoku");
            System.out.println("=================");
            //Get two players (setUpPlayers()?)
            int playerCount = 1;
            Player playerOne = setUpPlayers(playerCount);
            playerCount++;
            Player playerTwo = setUpPlayers(playerCount);
            System.out.println(playerOne.getName() + ", " + playerTwo.getName());
            //Instantiate gomoku
            Gomoku gomoku = new Gomoku(playerOne, playerTwo);
            //Randomize players
            System.out.println("\n Randomizing...");
            // print who goes first
            System.out.printf("%n%s goes first %n%n", gomoku.getCurrent().getName());
            //play the game (playgame(gomoku)?)
            playGame(gomoku);

        } while (playAgain);

        // ones out of the loop, print goodbye

    }

    private Player setUpPlayers(int playerCount) {
        Player player = null;
        String userChoice = "";

        do {
            System.out.printf("Player %s is: %n", playerCount);
            System.out.println("1. Human");
            System.out.println("2. Random Player");
            System.out.print("Select [1-2]: ");
            userChoice = console.nextLine();
            if (userChoice.equals("1")) {
                System.out.println("Please enter your name");
                player = new HumanPlayer(console.nextLine());
            } else if (userChoice.equals("2")) {
                player = new RandomPlayer();
                System.out.printf("Player %s is %s %n:", playerCount, player.getName());
            }
        } while (!(userChoice.equals("1") || (userChoice.equals("2"))));

        return player;
    }

    private void playGame(Gomoku gomoku) {
        while (!gomoku.isOver()) {
            Player currentPlayer = gomoku.getCurrent();
            Stone stone = getPlayerMove(gomoku, currentPlayer);
            //add stone to the stone array
            stonesArrays[stone.getRow()][stone.getColumn()] = stone;
            drawBoard(stonesArrays);
        }
    }

    private Stone getPlayerMove(Gomoku gomoku, Player currentPlayer) {
        Stone stone;
        Result result;

        System.out.printf("%s's turn %n", currentPlayer);
        do {
            stone = currentPlayer.generateMove(gomoku.getStones());
            //current player is human
            if (stone == null) {
                System.out.println("Enter a Row: ");
                int row = Integer.parseInt(console.nextLine()) - 1;
                System.out.println("Column a Row: ");
                int column = Integer.parseInt(console.nextLine()) - 1;
                stone = new Stone(row, column, gomoku.isBlacksTurn());
            }

            //current player is random
            else {
                //stone = gomoku.getCurrent().generateMove(gomoku.getStones());
                System.out.printf("Stone placed at row %s, column %s", stone.getRow() + 1, stone.getColumn() + 1);
            }
            result = gomoku.place(stone);
            // validate result
            if (!result.isSuccess()) {
                System.out.printf("%n Error %s %n%n", result.getMessage());
            }

        } while (!result.isSuccess());

        return stone;
    }


    private void drawBoard(Stone[][] stonesArrays) {
        System.out.println("Drawing board");
    }

}
