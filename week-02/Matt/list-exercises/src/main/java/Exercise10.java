import learn.BoardGame;
import learn.GameRepository;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise10 {

    public static void main(String[] args) {

        ArrayList<BoardGame> games = GameRepository.getAll();

        // 1. Loop over `games` and remove any game that can be played by one person.
        // 2. Print `games` and confirm single-player games are removed.
//        for(BoardGame elem : games){
//            if(elem.getMinPlayers() == 1){
//                games.remove(elem);
//            }
//        }
        Iterator itr = games.iterator();
        while (itr.hasNext())
        {
            int x = (Integer)itr.next();
            if(BoardGame games.
        }

        for(BoardGame elem : games){
            System.out.println(elem);
        }
    }
}
