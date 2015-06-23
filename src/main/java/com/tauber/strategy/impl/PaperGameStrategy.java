package com.tauber.strategy.impl;

import com.tauber.enums.Action;
import com.tauber.strategy.GameStrategy;

/**
 * Created by radar on 6/22/15.
 *
 * This is a behavior of our GameStrategy interface that only chooses the PAPER enum from
 * {@link Action}.
 *
 */
public class PaperGameStrategy implements GameStrategy {
    public Action execute() {
        return Action.PAPER;
    }
}
