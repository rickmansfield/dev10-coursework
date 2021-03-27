import learn.BoardGame;
import learn.GameRepository;

import java.util.ArrayList;

public class Exercise03 {

    public static void main(String[] args) {

        ArrayList<BoardGame> games = GameRepository.getAll();
        games.add(new BoardGame("Sorry", 2, 4, "party game"));
        for (BoardGame elem : games) {
            System.out.println(elem);

        }
        System.out.println("\n");
        games.add(new BoardGame("card against humanity", 4, 12, "party game" ));
        for (BoardGame elem : games) {
            System.out.println(elem);

        }
        System.out.println("\n");
        games.add(new BoardGame("spoons", 3, 12, "card party game"));
        for (BoardGame elem : games) {
            System.out.println(elem);

        }

        // 1. Add three new games to `games` with the `add` method.
        // 2. Print `games` after each add.
    }
}
