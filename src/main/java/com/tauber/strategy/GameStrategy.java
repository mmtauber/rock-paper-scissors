package com.tauber.strategy;

import com.tauber.enums.Action;

/**
 * Created by radar on 6/22/15.
 *
 * I am using the strategy pattern here. This allows the rock, paper, or scissor 'choosing'
 * logic to be obscured and changeable on the fly. This will also make the client code easier
 * to read.
 *
 */
public interface GameStrategy {

    Action execute();
}
