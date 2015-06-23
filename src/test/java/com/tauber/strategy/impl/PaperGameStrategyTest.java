package com.tauber.strategy.impl;

import com.tauber.enums.Action;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by radar on 6/22/15.
 */
public class PaperGameStrategyTest {

    @Test
    public void testExecute() {
        Assert.assertEquals(new PaperGameStrategy().execute(), Action.PAPER);
    }
}
