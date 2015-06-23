package com.tauber.enums;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by radar on 6/22/15.
 */
public class ActionTest {

    private static final Action rock = Action.ROCK;
    private static final Action paper = Action.PAPER;
    private static final Action scissors = Action.SCISSORS;

    @Test
    public void testActionIsWinner_Outcomes() {

        // Test paper
        Assert.assertEquals(paper.isWinner(rock), Outcome.WIN);
        Assert.assertEquals(paper.isWinner(paper), Outcome.TIE);
        Assert.assertEquals(paper.isWinner(scissors), Outcome.LOSE);

        // Test rock
        Assert.assertEquals(rock.isWinner(scissors), Outcome.WIN);
        Assert.assertEquals(rock.isWinner(rock), Outcome.TIE);
        Assert.assertEquals(rock.isWinner(paper), Outcome.LOSE);

        // Test scissors
        Assert.assertEquals(scissors.isWinner(paper), Outcome.WIN);
        Assert.assertEquals(scissors.isWinner(scissors), Outcome.TIE);
        Assert.assertEquals(scissors.isWinner(rock), Outcome.LOSE);

    }
}
