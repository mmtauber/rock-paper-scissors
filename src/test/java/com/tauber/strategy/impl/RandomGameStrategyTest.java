package com.tauber.strategy.impl;

import com.tauber.enums.Action;
import org.junit.Assert;
import org.junit.Test;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by radar on 6/22/15.
 */
public class RandomGameStrategyTest {

    @Test
    public void testExecute() {
        Set<Action> set = EnumSet.allOf(Action.class);
        Assert.assertTrue(set.contains(new RandomGameStrategy().execute()));
    }
}
