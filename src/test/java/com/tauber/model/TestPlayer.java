package com.tauber.model;

import com.tauber.enums.Action;
import com.tauber.strategy.impl.PaperGameStrategy;
import com.tauber.strategy.impl.RandomGameStrategy;
import com.tauber.strategy.impl.RockGameStrategy;
import com.tauber.strategy.impl.ScissorsGameStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by radar on 6/22/15.
 */
public class TestPlayer {

    private Player paperPlayer = new Player(new PaperGameStrategy());
    private Player rockPlayer = new Player(new RockGameStrategy());
    private Player scissorsPlayer = new Player(new ScissorsGameStrategy());
    private Player randomPlayer = new Player(new RandomGameStrategy());

    @Test
    public void testPaperPlayerAction() {
        Assert.assertEquals(paperPlayer.getStrategy().execute(), Action.PAPER);
    }

    @Test
    public void testRockPlayerAction() {
        Assert.assertEquals(rockPlayer.getStrategy().execute(), Action.ROCK);
    }

    @Test
    public void testScissorsPlayerAction() {
        Assert.assertEquals(scissorsPlayer.getStrategy().execute(), Action.SCISSORS);
    }

    @Test
    public void testRandomPlayerAction() {
        Set<Action> set = EnumSet.allOf(Action.class);
        Assert.assertTrue(set.contains(randomPlayer.getStrategy().execute()));
    }

    @Test
    public void testIncrementWins() {
        Assert.assertEquals(paperPlayer.getWins(), 0);
        paperPlayer.incrementWins();
        Assert.assertEquals(paperPlayer.getWins(), 1);
    }

    @Test
    public void testSetStrategy() {
        Assert.assertEquals(paperPlayer.getStrategy().execute(), Action.PAPER);
        paperPlayer.setStrategy(new RockGameStrategy());
        Assert.assertEquals(paperPlayer.getStrategy().execute(), Action.ROCK);
    }
}
