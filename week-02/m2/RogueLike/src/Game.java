import java.util.Random;
import java.util.Scanner;

public class Game {
    //constants
    private int WIDTH = 20; //removed 'final' keyword
    private final static String WALL_CHARACTER = "#";
    private final static String EMPTY_CHARACTER = " ";

    private final Scanner console = new Scanner(System.in);
    private Hero hero = new Hero("name", '@', 0, 0, false, false);
    private Treasure treasure;
    private Treasure treasure2;
    private Traps trap;
    private Traps trap2;
    private boolean isOver;

    public void run() {
        setUp();
        while (!isOver) {
            printWorld();
            move();
        }
        //NEW CODE
        printWorld();
    }


    private void setUp() {
        System.out.println("What is the name of your hero?: ");
        String name = console.nextLine();

        System.out.print("What symbol would you like to use? [@, !, &, *, %, $, #]: ");
        char symbol = console.next().charAt(0);
        hero.setSymbol(symbol);

        System.out.print("Choose the size of your world [whole number]: ");
        WIDTH = console.nextInt();
        System.out.println(WIDTH);

        Random rand = new Random();
        int x = rand.nextInt(WIDTH);
        int y = rand.nextInt(WIDTH);
        int x2 = rand.nextInt(WIDTH);
        int y2 = rand.nextInt(WIDTH);
        int x3 = rand.nextInt(WIDTH);
        int y3 = rand.nextInt(WIDTH);
        int x4 = rand.nextInt(WIDTH);
        int y4 = rand.nextInt(WIDTH);

        hero = new Hero(name, symbol, x, y, false, false);
        do {
            x = rand.nextInt(WIDTH);
            y = rand.nextInt(WIDTH);
        } while (x == hero.getX() && y == hero.getY());

        treasure = new Treasure(x, y);
        treasure2 = new Treasure(x2, y2);
        trap = new Traps(x3, y3);
        trap = new Traps(x4, y4);
    }

    private void printWorld() {
        //top wall border
        System.out.println(WALL_CHARACTER.repeat(WIDTH+2));

        for (int row = 0; row <WIDTH; row++) {
            //left wall border
            System.out.print(WALL_CHARACTER);
            for (int col = 0; col <WIDTH; col++) {
                if (row == hero.getY() && col == hero.getX()) {
                    System.out.print(hero.getSymbol());
                } else if (row == treasure.getY() && col == treasure.getX()) {
                    if (hero.getTreasure1Obtained()) {
                        System.out.print(EMPTY_CHARACTER);
                    } else {
                        System.out.print("T");
                    }
                } else if (row == treasure2.getY() && col == treasure2.getX()) {
                    if (hero.getTreasure1Obtained()) {
                        System.out.print(EMPTY_CHARACTER);
                    } else {
                        System.out.print("T");
                    }
                } else {
                    System.out.print(EMPTY_CHARACTER);
                }
            }

            //right wall border
            System.out.println(WALL_CHARACTER);
        }

        //bottom wall border
        System.out.println(WALL_CHARACTER.repeat(WIDTH+2));
    }

    private void move() {
        System.out.println(hero.getName() + ", move W up, S down, A left, D right, X exit [WASD]: ");
        String move = console.nextLine().trim().toUpperCase();

        if (move.length() != 1) {
            return;
        }
//        switch (move.charAt(0)) {
//            case 'W':
//                if (hero.getY() - 1 >= 0) {
//                    hero.moveDown();
//                }
//                break;
//            case 'A':
//                if (hero.getX() - 1 >= 0) {
//                    hero.moveLeft();
//                }
//                break;
//            case 'S':
//                if (hero.getY() + 1 < WIDTH) {
//                    hero.moveUp();
//                }
//                break;
//            case 'D':
//                if (hero.getX() + 1 < WIDTH) {
//                    hero.moveRight();
//                }
//                break;
//            case 'X':
//                isOver = true;
//                break;
//        }
        switch (move.charAt(0)) {
            case 'W':
                hero.moveUp();
                break;
            case 'A':
                hero.moveLeft();
                break;
            case 'S':
                hero.moveDown();
                break;
            case 'D':
                hero.moveRight();
                break;
        }

//        boolean treasureOne = false;
//        boolean treasureTwo = false;
//        int treasureCount = 0;
        if (hero.getX() < 0 || hero.getX() >= WIDTH
                || hero.getY() < 0 || hero.getY() >= WIDTH) {
            System.out.println(hero.getName() + " touched lava! You lose.");
            isOver = true;
        } else if (hero.getX() == treasure.getX() && hero.getY() == treasure.getY()) {
            System.out.println(hero.getName() + " found the treasure #1!");
            hero.setTreasure1Obtained(true);
            if (hero.getTreasure1Obtained() == hero.getTreasure2Obtained()){
                System.out.println("You've won the game! Congratulations.");
                isOver = true;
            }
        } else if (hero.getX() == treasure2.getX() && hero.getY() == treasure2.getY()) {
            System.out.println(hero.getName() + " found the treasure #2!");
            hero.setTreasure2Obtained(true);
            if (hero.getTreasure1Obtained() == hero.getTreasure2Obtained()){
                System.out.println("You've won the game! Congratulations.");
                isOver = true;
            }
        } else if (hero.getX() == trap.getX() && hero.getY() == trap.getY()) {
            System.out.println("You landed on a trap and died!");
            isOver = true;
        }  else if (hero.getX() == trap2.getX() && hero.getY() == trap2.getY()) {
            System.out.println("You landed on a trap and died!");
            isOver = true;
        }

    }
}
