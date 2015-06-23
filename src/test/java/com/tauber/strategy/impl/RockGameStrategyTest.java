package com.tauber.strategy.impl;

import com.tauber.enums.Action;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by radar on 6/22/15.
 */
public class RockGameStrategyTest {

    @Test
    public void testExecute() {
        Assert.assertEquals(new RockGameStrategy().execute(), Action.ROCK);
    }
}
