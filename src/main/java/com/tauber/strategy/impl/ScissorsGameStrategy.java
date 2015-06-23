package com.tauber.strategy.impl;

import com.tauber.enums.Action;
import com.tauber.strategy.GameStrategy;

/**
 * Created by radar on 6/22/15.
 *
 * This is a behavior of our GameStrategy interface that only chooses the SCISSORS enum from
 * {@link Action}.
 *
 */
public class ScissorsGameStrategy implements GameStrategy {
    public Action execute() {
        return Action.SCISSORS;
    }
}
