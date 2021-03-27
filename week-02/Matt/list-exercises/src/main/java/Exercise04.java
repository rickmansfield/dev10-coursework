import learn.BoardGame;
import learn.GameRepository;

import java.util.ArrayList;

public class Exercise04 {

    public static void main(String[] args) {

        ArrayList<BoardGame> games = GameRepository.getAll();


        ArrayList<BoardGame> coolGames = new ArrayList<>();
        coolGames.add(new BoardGame("Poker", 2, 5, "card gambling"));
        coolGames.add(new BoardGame("21", 2, 5, "card gambling"));
        coolGames.add(new BoardGame("roulette", 1, 10, "chance gambling"));

        games.addAll(coolGames);

        for (BoardGame elem : games) {
            System.out.println(elem);

        }

        // 1. Instantiate a new ArrayList<BoardGame>.
        // 2. Add three BoardGames to the new list.
        // 3. Print the new list.
        // 4. Add items in the new list to `games` with the `addAll` method.
        // 5. Print `games`.
    }
}
