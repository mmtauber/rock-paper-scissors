package com.tauber.strategy.impl;

import com.tauber.enums.Action;
import com.tauber.strategy.GameStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by radar on 6/22/15.
 *
 * This is a random styled behavior of the GameStrategy interface.
 *
 */
public class RandomGameStrategy implements GameStrategy {

    Random r = new Random();

    /**
     * Returns a {@link Action} object that is pseudo randomly chosen from the set
     * of possible values.
     *
     * @return      a random {@link Action}
     */
    @Override
    public Action execute() {

        // Coerce enum of game actions to a List
        List<Action> actions = new ArrayList<>(Arrays.asList(Action.values()));

        // Pseudo-randomly choose from the options in the Action enum
        return actions.get(r.nextInt(actions.size()));
    }
}
