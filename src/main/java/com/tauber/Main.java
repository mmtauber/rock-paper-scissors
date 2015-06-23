package com.tauber;

/**
 * Created by radar on 6/22/15.
 *
 * Class for running the project.
 *
 */
public class Main {

    private static Game game = new Game();

    public static void main(String[] args) {
        game.run();
    }

    static void setGame(Game game) {
        Main.game = game;
    }
}
