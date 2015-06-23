package com.tauber.model;

import com.tauber.strategy.GameStrategy;

/**
 * Created by radar on 6/22/15.
 *
 * The {@link Player} class keeps track of how many games a particular class
 * instance has won. It also stores a behavior {@link GameStrategy} for playing
 * the Rock Paper Scissor game.
 *
 */
public class Player {

    private GameStrategy strategy;
    private int wins;

    public Player(GameStrategy strategy) {
        this.strategy = strategy;
    }

    public GameStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(GameStrategy strategy) {
        this.strategy = strategy;
    }

    public int getWins() {
        return wins;
    }

    public void incrementWins() {
        wins += 1;
    }
}
