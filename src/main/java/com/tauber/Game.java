package com.tauber;

import com.tauber.enums.Action;
import com.tauber.enums.Outcome;
import com.tauber.model.Player;
import com.tauber.strategy.impl.PaperGameStrategy;
import com.tauber.strategy.impl.RandomGameStrategy;

/**
 * Created by radar on 6/22/15.
 *
 * Main class for running the project requirements.
 *
 */
public class Game {

    private static final int RUNTIME = 100; // Can be configured elsewhere
    /**
     * Since the 'paperPlayer' will always choose {@link Action#PAPER} the
     * {@link PaperGameStrategy#execute()} method will only be called ONCE.
     */
    public void run() {

        Player randomPlayer = new Player(new RandomGameStrategy());
        Player paperPlayer = new Player(new PaperGameStrategy());

        Action paperAction = paperPlayer.getStrategy().execute();

        for (int i = 0; i < RUNTIME; i++) {
            Action randAction = randomPlayer.getStrategy().execute();
            Outcome paperPlayersOutcome = paperAction.isWinner(randAction);

            if (paperPlayersOutcome.equals(Outcome.WIN)) {
                paperPlayer.incrementWins();
            } else if (paperPlayersOutcome.equals(Outcome.LOSE)) {
                randomPlayer.incrementWins();
            }

        }

        System.out.println("Paper player won: " + paperPlayer.getWins() + " games out of 100");
        System.out.println("Random player won: " + randomPlayer.getWins() + " games out of 100");
        System.out.println("Ties: " + (100 - (paperPlayer.getWins() + randomPlayer.getWins())));

    }
}
